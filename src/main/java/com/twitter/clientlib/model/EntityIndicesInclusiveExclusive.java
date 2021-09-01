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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Represent a boundary range (start and end index) for a recognized entity (for example a hashtag or a mention). &#x60;start&#x60; must be smaller than &#x60;end&#x60;.  The start index is inclusive, the end index is exclusive.
 */
@ApiModel(description = "Represent a boundary range (start and end index) for a recognized entity (for example a hashtag or a mention). `start` must be smaller than `end`.  The start index is inclusive, the end index is exclusive.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityIndicesInclusiveExclusive {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public EntityIndicesInclusiveExclusive() { 
  }

  public EntityIndicesInclusiveExclusive start(Integer start) {
    
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


  public EntityIndicesInclusiveExclusive end(Integer end) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityIndicesInclusiveExclusive entityIndicesInclusiveExclusive = (EntityIndicesInclusiveExclusive) o;
    return Objects.equals(this.start, entityIndicesInclusiveExclusive.start) &&
        Objects.equals(this.end, entityIndicesInclusiveExclusive.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityIndicesInclusiveExclusive {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EntityIndicesInclusiveExclusive
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EntityIndicesInclusiveExclusive.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntityIndicesInclusiveExclusive is not found in the empty JSON string", EntityIndicesInclusiveExclusive.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EntityIndicesInclusiveExclusive.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntityIndicesInclusiveExclusive` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EntityIndicesInclusiveExclusive.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntityIndicesInclusiveExclusive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntityIndicesInclusiveExclusive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntityIndicesInclusiveExclusive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntityIndicesInclusiveExclusive.class));

       return (TypeAdapter<T>) new TypeAdapter<EntityIndicesInclusiveExclusive>() {
           @Override
           public void write(JsonWriter out, EntityIndicesInclusiveExclusive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntityIndicesInclusiveExclusive read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntityIndicesInclusiveExclusive given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntityIndicesInclusiveExclusive
  * @throws IOException if the JSON string is invalid with respect to EntityIndicesInclusiveExclusive
  */
  public static EntityIndicesInclusiveExclusive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntityIndicesInclusiveExclusive.class);
  }

 /**
  * Convert an instance of EntityIndicesInclusiveExclusive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

