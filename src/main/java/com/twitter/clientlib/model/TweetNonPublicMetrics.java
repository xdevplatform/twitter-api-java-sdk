/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Nonpublic engagement metrics for the Tweet at the time of the request.
 */
@ApiModel(description = "Nonpublic engagement metrics for the Tweet at the time of the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetNonPublicMetrics {
  public static final String SERIALIZED_NAME_IMPRESSION_COUNT = "impression_count";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_COUNT)
  private Integer impressionCount;

  public TweetNonPublicMetrics() { 
  }

  public TweetNonPublicMetrics impressionCount(Integer impressionCount) {
    
    this.impressionCount = impressionCount;
    return this;
  }

   /**
   * Number of times this Tweet has been viewed.
   * @return impressionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this Tweet has been viewed.")

  public Integer getImpressionCount() {
    return impressionCount;
  }


  public void setImpressionCount(Integer impressionCount) {
    this.impressionCount = impressionCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetNonPublicMetrics tweetNonPublicMetrics = (TweetNonPublicMetrics) o;
    return Objects.equals(this.impressionCount, tweetNonPublicMetrics.impressionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetNonPublicMetrics {\n");
    sb.append("    impressionCount: ").append(toIndentedString(impressionCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("impression_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetNonPublicMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (TweetNonPublicMetrics.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in TweetNonPublicMetrics is not found in the empty JSON string", TweetNonPublicMetrics.openapiRequiredFields.toString()));
     //   }
     // }

  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetNonPublicMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetNonPublicMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetNonPublicMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetNonPublicMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetNonPublicMetrics>() {
           @Override
           public void write(JsonWriter out, TweetNonPublicMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetNonPublicMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetNonPublicMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetNonPublicMetrics
  * @throws IOException if the JSON string is invalid with respect to TweetNonPublicMetrics
  */
  public static TweetNonPublicMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetNonPublicMetrics.class);
  }

 /**
  * Convert an instance of TweetNonPublicMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

