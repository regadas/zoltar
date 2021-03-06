/*-
 * -\-\-
 * zoltar-core
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

package com.spotify.zoltar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.spotify.zoltar.FeatureExtractFns.ExtractFn;
import com.spotify.zoltar.FeatureExtractFns.SingleExtractFn;
import com.spotify.zoltar.PredictFns.AsyncPredictFn;
import com.spotify.zoltar.PredictFns.PredictFn;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.junit.Test;

public class PredictorTest {

  static class DummyModel implements Model<Object> {

    @Override
    public Object instance() {
      return new Object();
    }

    @Override
    public void close() throws Exception {

    }
  }

  @Test
  public void timeout() {
    final Duration wait = Duration.ofSeconds(1);
    final Duration predictionTimeout = Duration.ZERO;

    final ExtractFn<Object, Object> extractFn = inputs -> Collections.emptyList();
    final PredictFn<DummyModel, Object, Object, Object> predictFn = (model, vectors) -> {
      Thread.sleep(wait.toMillis());
      return Collections.emptyList();
    };

    try {
      Predictor.create(new DummyModel(), extractFn, predictFn)
          .predict(predictionTimeout, new Object())
          .toCompletableFuture()
          .get(wait.toMillis(), TimeUnit.MILLISECONDS);

      fail("should throw TimeoutException");
    } catch (Exception e) {
      assertTrue(e.getCause() instanceof TimeoutException);
    }
  }

  @Test
  public void empty() throws InterruptedException, ExecutionException, TimeoutException {
    final Duration wait = Duration.ofSeconds(1);
    final ExtractFn<Object, Object> extractFn = inputs -> Collections.emptyList();
    final AsyncPredictFn<DummyModel, Object, Object, Object> predictFn =
        (model, vectors) -> CompletableFuture.completedFuture(Collections.emptyList());

    Predictor.create(new DummyModel(), extractFn, predictFn)
        .predict()
        .toCompletableFuture()
        .get(wait.toMillis(), TimeUnit.MILLISECONDS);
  }

  @Test
  public void nonEmpty() throws InterruptedException, ExecutionException, TimeoutException {
    final Duration wait = Duration.ofSeconds(1);
    final SingleExtractFn<Integer, Float> extractFn = input -> (float) input / 10;
    final PredictFn<DummyModel, Integer, Float, Float> predictFn = (model, vectors) -> {
      return vectors.stream()
          .map(vector -> Prediction.create(vector.input(), vector.value() * 2))
          .collect(Collectors.toList());
    };

    final List<Prediction<Integer, Float>> predictions = Predictor
        .create(new DummyModel(), extractFn, predictFn)
        .predict(1)
        .toCompletableFuture()
        .get(wait.toMillis(), TimeUnit.MILLISECONDS);

    assertThat(predictions.size(), is(1));
    assertThat(predictions.get(0), is(Prediction.create(1, 0.2f)));
  }
}
