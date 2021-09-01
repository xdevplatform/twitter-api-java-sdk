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
import com.twitter.clientlib.model.AnimatedGif;
import com.twitter.clientlib.model.Photo;
import com.twitter.clientlib.model.Video;
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
 * Media
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Media {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public static final String SERIALIZED_NAME_MEDIA_KEY = "media_key";
  @SerializedName(SERIALIZED_NAME_MEDIA_KEY)
  private String mediaKey;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public Media() { 
    this.type = this.getClass().getSimpleName();
  }

  public Media type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Media mediaKey(String mediaKey) {
    
    this.mediaKey = mediaKey;
    return this;
  }

   /**
   * The Media Key identifier for this attachment.
   * @return mediaKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Media Key identifier for this attachment.")

  public String getMediaKey() {
    return mediaKey;
  }


  public void setMediaKey(String mediaKey) {
    this.mediaKey = mediaKey;
  }


  public Media height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the media in pixels
   * minimum: 0
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the media in pixels")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public Media width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the media in pixels
   * minimum: 0
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the media in pixels")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.type, media.type) &&
        Objects.equals(this.mediaKey, media.mediaKey) &&
        Objects.equals(this.height, media.height) &&
        Objects.equals(this.width, media.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mediaKey, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mediaKey: ").append(toIndentedString(mediaKey)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("media_key");
    openapiFields.add("height");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Media
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Media.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Media is not found in the empty JSON string", Media.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "AnimatedGif":
          AnimatedGif.validateJsonObject(jsonObj);
          break;
        case "Photo":
          Photo.validateJsonObject(jsonObj);
          break;
        case "Video":
          Video.validateJsonObject(jsonObj);
          break;
        case "animated_gif":
          AnimatedGif.validateJsonObject(jsonObj);
          break;
        case "photo":
          Photo.validateJsonObject(jsonObj);
          break;
        case "video":
          Video.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of Media given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Media
  * @throws IOException if the JSON string is invalid with respect to Media
  */
  public static Media fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Media.class);
  }

 /**
  * Convert an instance of Media to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

