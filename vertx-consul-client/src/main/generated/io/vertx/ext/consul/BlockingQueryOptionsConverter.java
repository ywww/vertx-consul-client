/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.consul.BlockingQueryOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.consul.BlockingQueryOptions} original class using Vert.x codegen.
 */
public class BlockingQueryOptionsConverter {

  public static void fromJson(JsonObject json, BlockingQueryOptions obj) {
    if (json.getValue("index") instanceof Number) {
      obj.setIndex(((Number)json.getValue("index")).longValue());
    }
    if (json.getValue("wait") instanceof String) {
      obj.setWait((String)json.getValue("wait"));
    }
  }

  public static void toJson(BlockingQueryOptions obj, JsonObject json) {
    json.put("index", obj.getIndex());
    if (obj.getWait() != null) {
      json.put("wait", obj.getWait());
    }
  }
}