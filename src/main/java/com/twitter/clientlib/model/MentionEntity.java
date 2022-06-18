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
import com.twitter.clientlib.model.EntityIndicesInclusiveExclusive;
import com.twitter.clientlib.model.MentionFields;
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
 * MentionEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MentionEntity {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public MentionEntity() { 
  }

  public MentionEntity end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Index (zero-based) at which position this entity ends.  The index is exclusive.
   * minimum: 0
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "61", required = true, value = "Index (zero-based) at which position this entity ends.  The index is exclusive.")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public MentionEntity start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Index (zero-based) at which position this entity starts.  The index is inclusive.
   * minimum: 0
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "Index (zero-based) at which position this entity starts.  The index is inclusive.")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public MentionEntity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2244994945", required = true, value = "Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MentionEntity username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The Twitter handle (screen name) of this user.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Twitter handle (screen name) of this user.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MentionEntity mentionEntity = (MentionEntity) o;
    return Objects.equals(this.end, mentionEntity.end) &&
        Objects.equals(this.start, mentionEntity.start) &&
        Objects.equals(this.id, mentionEntity.id) &&
        Objects.equals(this.username, mentionEntity.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, id, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MentionEntity {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("start");
    openapiFields.add("id");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MentionEntity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (MentionEntity.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in MentionEntity is not found in the empty JSON string", MentionEntity.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MentionEntity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MentionEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MentionEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MentionEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MentionEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<MentionEntity>() {
           @Override
           public void write(JsonWriter out, MentionEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MentionEntity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MentionEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MentionEntity
  * @throws IOException if the JSON string is invalid with respect to MentionEntity
  */
  public static MentionEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MentionEntity.class);
  }

 /**
  * Convert an instance of MentionEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

