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
import com.twitter.clientlib.model.Tweet;
import com.twitter.clientlib.model.UsersIdLikedTweetsResponseMeta;
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
 * UsersIdLikedTweetsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersIdLikedTweetsResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Tweet> data = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private UsersIdLikedTweetsResponseMeta meta;

  public UsersIdLikedTweetsResponse() { 
  }

  public UsersIdLikedTweetsResponse data(List<Tweet> data) {
    
    this.data = data;
    return this;
  }

  public UsersIdLikedTweetsResponse addDataItem(Tweet dataItem) {
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

  public List<Tweet> getData() {
    return data;
  }


  public void setData(List<Tweet> data) {
    this.data = data;
  }


  public UsersIdLikedTweetsResponse includes(Expansions includes) {
    
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


  public UsersIdLikedTweetsResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public UsersIdLikedTweetsResponse addErrorsItem(Problem errorsItem) {
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


  public UsersIdLikedTweetsResponse meta(UsersIdLikedTweetsResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersIdLikedTweetsResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(UsersIdLikedTweetsResponseMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersIdLikedTweetsResponse usersIdLikedTweetsResponse = (UsersIdLikedTweetsResponse) o;
    return Objects.equals(this.data, usersIdLikedTweetsResponse.data) &&
        Objects.equals(this.includes, usersIdLikedTweetsResponse.includes) &&
        Objects.equals(this.errors, usersIdLikedTweetsResponse.errors) &&
        Objects.equals(this.meta, usersIdLikedTweetsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, includes, errors, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersIdLikedTweetsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("includes");
    openapiFields.add("errors");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersIdLikedTweetsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (UsersIdLikedTweetsResponse.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in UsersIdLikedTweetsResponse is not found in the empty JSON string", UsersIdLikedTweetsResponse.openapiRequiredFields.toString()));
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
          Tweet.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `includes`
      if (jsonObj.getAsJsonObject("includes") != null) {
        Expansions.validateJsonObject(jsonObj.getAsJsonObject("includes"));
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
      // validate the optional field `meta`
      if (jsonObj.getAsJsonObject("meta") != null) {
        UsersIdLikedTweetsResponseMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersIdLikedTweetsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersIdLikedTweetsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersIdLikedTweetsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersIdLikedTweetsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersIdLikedTweetsResponse>() {
           @Override
           public void write(JsonWriter out, UsersIdLikedTweetsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersIdLikedTweetsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersIdLikedTweetsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersIdLikedTweetsResponse
  * @throws IOException if the JSON string is invalid with respect to UsersIdLikedTweetsResponse
  */
  public static UsersIdLikedTweetsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersIdLikedTweetsResponse.class);
  }

 /**
  * Convert an instance of UsersIdLikedTweetsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

