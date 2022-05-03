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
 * MultiComplianceJobResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MultiComplianceJobResponseMeta {
  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public MultiComplianceJobResponseMeta() { 
  }

  public MultiComplianceJobResponseMeta resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Number of compliance jobs returned
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of compliance jobs returned")

  public Integer getResultCount() {
    return resultCount;
  }


  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiComplianceJobResponseMeta multiComplianceJobResponseMeta = (MultiComplianceJobResponseMeta) o;
    return Objects.equals(this.resultCount, multiComplianceJobResponseMeta.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiComplianceJobResponseMeta {\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
    openapiFields.add("result_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MultiComplianceJobResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (MultiComplianceJobResponseMeta.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in MultiComplianceJobResponseMeta is not found in the empty JSON string", MultiComplianceJobResponseMeta.openapiRequiredFields.toString()));
     //   }
     // }

  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiComplianceJobResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiComplianceJobResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiComplianceJobResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiComplianceJobResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiComplianceJobResponseMeta>() {
           @Override
           public void write(JsonWriter out, MultiComplianceJobResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiComplianceJobResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiComplianceJobResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiComplianceJobResponseMeta
  * @throws IOException if the JSON string is invalid with respect to MultiComplianceJobResponseMeta
  */
  public static MultiComplianceJobResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiComplianceJobResponseMeta.class);
  }

 /**
  * Convert an instance of MultiComplianceJobResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

