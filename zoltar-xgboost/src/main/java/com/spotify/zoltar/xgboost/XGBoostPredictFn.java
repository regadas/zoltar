/*-
 * -\-\-
 * zoltar-xgboost
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

package com.spotify.zoltar.xgboost;

import com.spotify.zoltar.PredictFns.AsyncPredictFn;
import ml.dmlc.xgboost4j.LabeledPoint;

/**
 * XGBoost flavor of {@link AsyncPredictFn}. Uses {@link XGBoostModel} and features are extracted as
 * a {@link LabeledPoint}s.
 *
 * @param <I> type of the raw input to the feature extraction.
 * @param <P> type of the prediction result.
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
@FunctionalInterface
public interface XGBoostPredictFn<I, P> extends AsyncPredictFn<XGBoostModel, I, LabeledPoint, P> {

}
