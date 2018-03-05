/*-
 * -\-\-
 * model-serving-tensorflow
 * --
 * Copyright (C) 2016 - 2018 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

/*
 * Copyright 2018 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.modelserving.tf;

import com.google.common.collect.ImmutableMap;
import com.spotify.featran.FeatureSpec;
import com.spotify.featran.java.JFeatureExtractor;
import com.spotify.futures.CompletableFutures;
import com.spotify.modelserving.IrisFeaturesSpec;
import com.spotify.modelserving.IrisFeaturesSpec.Iris;
import com.spotify.modelserving.Model.FeatureExtractFn;
import com.spotify.modelserving.Model.Prediction;
import com.spotify.modelserving.Model.Predictor;
import com.spotify.modelserving.fs.Resource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.LongBuffer;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.Tensors;
import org.tensorflow.example.Example;
import scala.Option;

public class TensorFlowModelTest {

  @Test
  public void testLoad() throws Exception {
    final FeatureSpec<Iris> irisFeatureSpec = IrisFeaturesSpec.irisFeaturesSpec();
    final List<Iris> irisStream = Resource.from("resource:///iris.csv").read(is -> {
      return new BufferedReader(new InputStreamReader(is.open()))
          .lines()
          .map(l -> l.split(","))
          .map(strs -> new Iris(Option.apply(Double.parseDouble(strs[0])),
                                Option.apply(Double.parseDouble(strs[1])),
                                Option.apply(Double.parseDouble(strs[2])),
                                Option.apply(Double.parseDouble(strs[3])),
                                Option.apply(strs[4])))
          .collect(Collectors.toList());
    });

    final Map<String, Long> classToId = ImmutableMap.of("Iris-setosa", 0L,
                                                        "Iris-versicolor", 1L,
                                                        "Iris-virginica", 2L);

    TensorFlowPredictFn<Iris, Long> predictFn = (model, vectors) -> {
      final List<CompletableFuture<Prediction<Iris, Long>>> predictions = vectors.stream()
          .map(vector -> {
            return CompletableFuture
                .supplyAsync(() -> predict(model, vector.value()))
                .thenApply(value -> Prediction.create(vector.input(), value));
          }).collect(Collectors.toList());

      return CompletableFutures.allAsList(predictions);
    };

    final URI trainedModel = getClass().getResource("/trained_model").toURI();
    final URI settings = getClass().getResource("/settings.json").toURI();

    final TensorFlowModel<Iris> model = TensorFlowModel
        .create(trainedModel, settings, irisFeatureSpec);
    final FeatureExtractFn<Iris, Example> featureExtractFn = JFeatureExtractor::featureValuesExample;

    CompletableFuture<Integer> sum = Predictor
        .create(model, featureExtractFn, predictFn)
        .predict(irisStream, Duration.ofMillis(1000))
        .thenApply(predictions -> {
          return predictions.stream()
              .mapToInt(prediction -> {
                String className = prediction.input().className().get();
                long value = prediction.value();

                return classToId.get(className) == value ? 1 : 0;
              }).sum();
        }).toCompletableFuture();

    Assert.assertTrue("Should be more the 0.8", sum.get() / 150f > .8);
  }

  private long predict(TensorFlowModel<Iris> model, Example example) {
    // rank 1 cause we need to account for batch
    byte[][] b = new byte[1][];
    b[0] = example.toByteArray();
    try (Tensor<String> t = Tensors.create(b)) {
      Session.Runner runner = model.instance().session().runner()
          .feed("input_example_tensor", t)
          .fetch("linear/head/predictions/class_ids");
      List<Tensor<?>> output = runner.run();
      LongBuffer incomingClassId = LongBuffer.allocate(1);

      try {
        output.get(0).writeTo(incomingClassId);
      } finally {
        output.forEach(Tensor::close);
      }
      return incomingClassId.get(0);
    }
  }
}
