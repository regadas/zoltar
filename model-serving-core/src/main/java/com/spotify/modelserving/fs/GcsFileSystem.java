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

package com.spotify.modelserving.fs;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.storage.Storage;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

final class GcsFileSystem implements FileSystem {

  private static final GcsFileSystem instance = new GcsFileSystem();

  private final Storage storage;

  private GcsFileSystem() {
    try {
      NetHttpTransport transport = new NetHttpTransport();
      JacksonFactory jacksonFactory = new JacksonFactory();
      GoogleCredential credential = GoogleCredential.getApplicationDefault();
      storage = new Storage(transport, jacksonFactory, credential);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static GcsFileSystem getInstance() {
    return instance;
  }

  @Override
  public InputStream open(String path) throws IOException {
    ObjectId id = parse(path);
    return storage.objects().get(id.bucket, id.path).executeMedia().getContent();
  }

  @Override
  public List<Resource> list(String path) throws IOException {
    ObjectId id = parse(path);
    return storage.objects().list(id.bucket).setPrefix(id.path).execute().getItems().stream()
            .map(o -> Resource.create(
                    String.format("gs://%s/%s", o.getBucket(), o.getName()),
                    o.getUpdated().getValue()))
            .collect(Collectors.toList());
  }

  private ObjectId parse(String path) {
    URI uri = URI.create(path);
    Preconditions.checkArgument("gs".equals(uri.getScheme()),
            "Not a GCS path: %s", path);
    return new ObjectId(uri.getHost(), uri.getPath().substring(1));
  }

  private static class ObjectId {
    final String bucket;
    final String path;

    private ObjectId(String bucket, String path) {
      this.bucket = bucket;
      this.path = path;
    }
  }
}