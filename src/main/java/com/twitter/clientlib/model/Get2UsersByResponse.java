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
import com.twitter.clientlib.model.Expansions;
import com.twitter.clientlib.model.Problem;
import com.twitter.clientlib.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Get2UsersByResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Get2UsersByResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<User> data = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public Get2UsersByResponse() { 
  }

  public Get2UsersByResponse data(List<User> data) {
    
    this.data = data;
    return this;
  }

  public Get2UsersByResponse addDataItem(User dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getData() {
    return data;
  }


  public void setData(List<User> data) {
    this.data = data;
  }


  public Get2UsersByResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public Get2UsersByResponse addErrorsItem(Problem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    this.errors = errors;
  }


  public Get2UsersByResponse includes(Expansions includes) {
    
    this.includes = includes;
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expansions getIncludes() {
    return includes;
  }


  public void setIncludes(Expansions includes) {
    this.includes = includes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get2UsersByResponse get2UsersByResponse = (Get2UsersByResponse) o;
    return Objects.equals(this.data, get2UsersByResponse.data) &&
        Objects.equals(this.errors, get2UsersByResponse.errors) &&
        Objects.equals(this.includes, get2UsersByResponse.includes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, includes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get2UsersByResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("errors");
    openapiFields.add("includes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Get2UsersByResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (Get2UsersByResponse.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in Get2UsersByResponse is not found in the empty JSON string", Get2UsersByResponse.openapiRequiredFields.toString()));
     //   }
     // }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      if (jsonArraydata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
        }

        // validate the optional field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
          User.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      if (jsonArrayerrors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("errors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
        }

        // validate the optional field `errors` (array)
        for (int i = 0; i < jsonArrayerrors.size(); i++) {
          Problem.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `includes`
      if (jsonObj.getAsJsonObject("includes") != null) {
        Expansions.validateJsonObject(jsonObj.getAsJsonObject("includes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get2UsersByResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get2UsersByResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get2UsersByResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get2UsersByResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Get2UsersByResponse>() {
           @Override
           public void write(JsonWriter out, Get2UsersByResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get2UsersByResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Get2UsersByResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Get2UsersByResponse
  * @throws IOException if the JSON string is invalid with respect to Get2UsersByResponse
  */
  public static Get2UsersByResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get2UsersByResponse.class);
  }

 /**
  * Convert an instance of Get2UsersByResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

