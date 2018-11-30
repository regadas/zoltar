/*-
 * -\-\-
 * apollo-service-example
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

package com.spotify.zoltar.logging;

import com.google.auto.value.AutoValue;
import com.spotify.zoltar.FeatureExtractor;
import com.spotify.zoltar.Model;
import com.spotify.zoltar.ModelLoader;
import com.spotify.zoltar.PredictFns.AsyncPredictFn;
import com.spotify.zoltar.Predictor;
import com.spotify.zoltar.PredictorBuilder;
import com.spotify.zoltar.Vector;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;


/**
 * Implementation of a logged {@link PredictorBuilder}.
 *
 * @param <ModelT>  underlying type of the {@link Model}.
 * @param <InputT>  type of the input to the {@link FeatureExtractor}.
 * @param <VectorT> type of the output from {@link FeatureExtractor}.
 * @param <ValueT>  type of the prediction result.
 */
@AutoValue
public abstract class PredictorLogger<ModelT extends Model<?>, InputT, VectorT, ValueT>
    implements PredictorBuilder<ModelT, InputT, VectorT, ValueT> {

  public abstract PredictorBuilder<ModelT, InputT, VectorT, ValueT> predictorBuilder();

  public abstract Logger logger();

  @SuppressWarnings("checkstyle:LineLength")
  static <ModelT extends Model<?>, InputT, VectorT, ValueT> Function<PredictorBuilder<ModelT, InputT, VectorT, ValueT>, PredictorLogger<ModelT, InputT, VectorT, ValueT>> create(
      final Logger logger) {
    return predictorBuilder -> {
      final FeatureExtractorLogger<ModelT, InputT, VectorT> featureExtractor =
          predictorBuilder
              .featureExtractor()
              .with(FeatureExtractorLogger.create(logger));

      final PredictFnLogger<ModelT, InputT, VectorT, ValueT> predictFn = predictorBuilder
          .predictFn()
          .with(PredictFnLogger.create(logger));

      final ModelLoader<ModelT> modelLoader = predictorBuilder.modelLoader();

      final PredictorBuilder<ModelT, InputT, VectorT, ValueT> pb =
          predictorBuilder.with(modelLoader, featureExtractor, predictFn);

      return new AutoValue_PredictorLogger<>(pb, logger);
    };
  }

  @FunctionalInterface
  interface FeatureExtractorLogger<ModelT extends Model<?>, InputT, ValueT>
      extends FeatureExtractor<ModelT, InputT, ValueT> {

    /**
     * Creates a new logged {@link FeatureExtractor}.
     */
    @SuppressWarnings("checkstyle:LineLength")
    static <ModelT extends Model<?>, InputT, ValueT> Function<FeatureExtractor<ModelT, InputT, ValueT>, FeatureExtractorLogger<ModelT, InputT, ValueT>> create(
        final Logger logger) {
      return extractFn -> (model, inputs) -> {
        final List<Vector<InputT, ValueT>> result = extractFn.extract(model, inputs);

        logger.info("feature extraction");

        return result;
      };
    }
  }

  @FunctionalInterface
  interface PredictFnLogger<ModelT extends Model<?>, InputT, VectorT, ValueT>
      extends AsyncPredictFn<ModelT, InputT, VectorT, ValueT> {

    /**
     * Creates a new logged {@link AsyncPredictFn}.
     */
    @SuppressWarnings("checkstyle:LineLength")
    static <ModelT extends Model<?>, InputT, VectorT, ValueT> Function<AsyncPredictFn<ModelT, InputT, VectorT, ValueT>, PredictFnLogger<ModelT, InputT, VectorT, ValueT>> create(
        final Logger logger) {
      return predictfn -> (model, vectors) -> {
        return predictfn
            .apply(model, vectors)
            .whenComplete((r, t) -> logger.info("prediction"));
      };
    }

  }

  @Override
  public ModelLoader<ModelT> modelLoader() {
    return predictorBuilder().modelLoader();
  }

  @Override
  public FeatureExtractor<ModelT, InputT, VectorT> featureExtractor() {
    return predictorBuilder().featureExtractor();
  }

  @Override
  public AsyncPredictFn<ModelT, InputT, VectorT, ValueT> predictFn() {
    return predictorBuilder().predictFn();
  }

  @Override
  public Predictor<InputT, ValueT> predictor() {
    return predictorBuilder().predictor();
  }

  @Override
  public PredictorLogger<ModelT, InputT, VectorT, ValueT> with(
      final ModelLoader<ModelT> modelLoader,
      final FeatureExtractor<ModelT, InputT, VectorT> featureExtractor,
      final AsyncPredictFn<ModelT, InputT, VectorT, ValueT> predictFn) {
    final PredictorBuilder<ModelT, InputT, VectorT, ValueT> pb =
        predictorBuilder().with(modelLoader, featureExtractor, predictFn);

    return PredictorLogger.<ModelT, InputT, VectorT, ValueT>create(logger())
        .apply(pb);
  }

}
