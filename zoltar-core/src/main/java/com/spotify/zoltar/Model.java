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

/**
 * Model interface. In most cases you can just use the prebaked implementations.
 *
 * @param <UnderlyingT> the underlying type of the model.
 */
public interface Model<UnderlyingT> extends AutoCloseable {

  /**
   * Returns an instance of the underlying model. This could be for example TensorFlow's graph,
   * session or XGBoost's booster.
   */
  UnderlyingT instance();

}
