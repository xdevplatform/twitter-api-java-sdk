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


package com.twitter.clientlib.auth;


import java.util.HashSet;
import java.util.Set;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.ResourceUnauthorizedProblem;
import com.twitter.clientlib.model.SingleTweetLookupResponse;


/**
 * You can set several credential types for the client.
 * The client will use the relevant one for each API call.
 * If the API has several options for authentication, the client will use the following order in order to authenticate:
 * 1. If defined use OAuth2 'OAuth2UserToken'
 * 2. If defined use OAuth2 app-only 'BearerToken'
 * 3. If defined use OAuth1 'UserToken'
 */
public class MultiCredentialTypes {

  public static void main(String[] args) {
    MultiCredentialTypes example = new MultiCredentialTypes();

    TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
            System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
            System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
            System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // This call will use the bearer token (app-only)
    example.callApi(apiInstance);

    apiInstance.setTwitterCredentials(new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN")));
    // This call will use the OAuth2 access token
    example.callApi(apiInstance);
  }

  public void callApi(TwitterApi apiInstance) {
    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
      // findTweetById
      SingleTweetLookupResponse result = apiInstance.tweets().findTweetById("20", null, tweetFields, null,
          null, null, null);
      if (result.getErrors() != null && result.getErrors().size() > 0) {
        System.out.println("Error:");
        result.getErrors().forEach(e -> {
          System.out.println(e.toString());
          if (e instanceof ResourceUnauthorizedProblem) {
            System.out.println(e.getTitle() + " " + e.getDetail());
          }
        });
      } else {
        System.out.println("findTweetById - Tweet Text: " + result.toString());
      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
