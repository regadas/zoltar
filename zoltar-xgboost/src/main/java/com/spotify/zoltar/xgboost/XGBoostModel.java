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

import com.google.auto.value.AutoValue;
import com.spotify.zoltar.Model;
import com.spotify.zoltar.fs.FileSystemExtras;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import ml.dmlc.xgboost4j.java.Booster;
import ml.dmlc.xgboost4j.java.GompLoader;
import ml.dmlc.xgboost4j.java.XGBoost;
import ml.dmlc.xgboost4j.java.XGBoostError;

/**
 * XGBoost model.
 *
 * <p>XGBoostModel is thread-safe.</p>
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
@AutoValue
public abstract class XGBoostModel implements Model<Booster> {

  /**
   * Note: Please use Models from zoltar-models module.
   *
   * <p>Returns a XGBoost model given a URI to the serialized model file.</p>
   */
  public static XGBoostModel create(final URI modelUri) throws IOException {
    try {
      GompLoader.start();
      final InputStream is = Files.newInputStream(FileSystemExtras.path(modelUri));
      return new AutoValue_XGBoostModel(XGBoost.loadModel(is));
    } catch (final XGBoostError xgBoostError) {
      throw new IOException(xgBoostError);
    }
  }

  /**
   * Returns XGBoost's {@link Booster}.
   */
  public abstract Booster instance();

  /**
   * Closes the model.
   */
  @Override
  public void close() throws Exception {
  }
}
