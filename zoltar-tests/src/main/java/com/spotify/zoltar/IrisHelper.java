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

package com.spotify.zoltar;

import com.google.common.io.Resources;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import scala.Option;

/**
 * Helper class to generate Iris test data.
 */
public class IrisHelper {

  private IrisHelper() {
  }

  private static IrisFeaturesSpec.Iris fromCsvString(final String features) {
    final String[] strs = features.split(",");
    return new IrisFeaturesSpec.Iris(Option.apply(Double.parseDouble(strs[0])),
            Option.apply(Double.parseDouble(strs[1])),
            Option.apply(Double.parseDouble(strs[2])),
            Option.apply(Double.parseDouble(strs[3])),
            Option.apply(strs[4]));
  }

  /**
   * Get Iris test data.
   */
  public static IrisFeaturesSpec.Iris[] getIrisTestData() throws Exception {
    final URL data = IrisHelper.class.getResource("/iris.csv");
    return Resources.readLines(data, StandardCharsets.UTF_8)
        .stream()
        .map(IrisHelper::fromCsvString)
        .toArray(IrisFeaturesSpec.Iris[]::new);
  }

}
