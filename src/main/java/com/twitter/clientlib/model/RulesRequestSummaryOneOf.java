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
 * A summary of the results of the addition of user-specified stream filtering rules.
 */
@ApiModel(description = "A summary of the results of the addition of user-specified stream filtering rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RulesRequestSummaryOneOf {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created;

  public static final String SERIALIZED_NAME_NOT_CREATED = "not_created";
  @SerializedName(SERIALIZED_NAME_NOT_CREATED)
  private Integer notCreated;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Integer valid;

  public static final String SERIALIZED_NAME_INVALID = "invalid";
  @SerializedName(SERIALIZED_NAME_INVALID)
  private Integer invalid;

  public RulesRequestSummaryOneOf() { 
  }

  public RulesRequestSummaryOneOf created(Integer created) {
    
    this.created = created;
    return this;
  }

   /**
   * Number of user-specified stream filtering rules that were created.
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Number of user-specified stream filtering rules that were created.")

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    this.created = created;
  }


  public RulesRequestSummaryOneOf notCreated(Integer notCreated) {
    
    this.notCreated = notCreated;
    return this;
  }

   /**
   * Number of user-specified stream filtering rules that were not created.
   * @return notCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Number of user-specified stream filtering rules that were not created.")

  public Integer getNotCreated() {
    return notCreated;
  }


  public void setNotCreated(Integer notCreated) {
    this.notCreated = notCreated;
  }


  public RulesRequestSummaryOneOf valid(Integer valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Number of valid user-specified stream filtering rules.
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Number of valid user-specified stream filtering rules.")

  public Integer getValid() {
    return valid;
  }


  public void setValid(Integer valid) {
    this.valid = valid;
  }


  public RulesRequestSummaryOneOf invalid(Integer invalid) {
    
    this.invalid = invalid;
    return this;
  }

   /**
   * Number of invalid user-specified stream filtering rules.
   * @return invalid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Number of invalid user-specified stream filtering rules.")

  public Integer getInvalid() {
    return invalid;
  }


  public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesRequestSummaryOneOf rulesRequestSummaryOneOf = (RulesRequestSummaryOneOf) o;
    return Objects.equals(this.created, rulesRequestSummaryOneOf.created) &&
        Objects.equals(this.notCreated, rulesRequestSummaryOneOf.notCreated) &&
        Objects.equals(this.valid, rulesRequestSummaryOneOf.valid) &&
        Objects.equals(this.invalid, rulesRequestSummaryOneOf.invalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, notCreated, valid, invalid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesRequestSummaryOneOf {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    notCreated: ").append(toIndentedString(notCreated)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("not_created");
    openapiFields.add("valid");
    openapiFields.add("invalid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("not_created");
    openapiRequiredFields.add("valid");
    openapiRequiredFields.add("invalid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RulesRequestSummaryOneOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RulesRequestSummaryOneOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulesRequestSummaryOneOf is not found in the empty JSON string", RulesRequestSummaryOneOf.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RulesRequestSummaryOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulesRequestSummaryOneOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RulesRequestSummaryOneOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulesRequestSummaryOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulesRequestSummaryOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulesRequestSummaryOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulesRequestSummaryOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RulesRequestSummaryOneOf>() {
           @Override
           public void write(JsonWriter out, RulesRequestSummaryOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulesRequestSummaryOneOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulesRequestSummaryOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulesRequestSummaryOneOf
  * @throws IOException if the JSON string is invalid with respect to RulesRequestSummaryOneOf
  */
  public static RulesRequestSummaryOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulesRequestSummaryOneOf.class);
  }

 /**
  * Convert an instance of RulesRequestSummaryOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

