# Twitter API Client Library for Java.

**Note: This SDK is in beta and is not ready for production**

You can find examples of using the SDK under the [examples/](examples/) directory

**Note: Only Twitter API V2 is supported**

- API version: 2.45

Twitter API v2 available endpoints

  For more information, please visit [https://developer.twitter.com/](https://developer.twitter.com/)

## Table of contents

- [Requirements](#requirements)
- [Installation](#installation)
  - [Maven users](#maven-users)
  - [Gradle users](#gradle-users)
  - [Others](#others)
- [Twitter Credentials](#twitter-credentials)
  - [OAuth 2.0 Authorization with PKCE](#oauth-20-authorization-with-pkce)
  - [OAuth 2.0 Bearer Token](#oauth-20-bearer-token-app-only)
- [Getting Started](#getting-started)
- [Authentication](#authentication)
  - [Auto Refresh Token](#auto-refresh-token)
- [Rate limits retry mechanism](#rate-limits-retry-mechanism)
- [Get all fields](#get-all-fields)
- [Documentation for API Endpoints](#documentation-for-api-endpoints)
- [Documentation for Models](#documentation-for-models)


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.twitter</groupId>
  <artifactId>twitter-api-java-sdk</artifactId>
  <version>2.0.2</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
repositories {
mavenCentral()     // Needed if the 'twitter-api-java-sdk' jar has been published to maven central.
mavenLocal()       // Needed if the 'twitter-api-java-sdk' jar has been published to the local maven repo.
}

dependencies {
implementation "com.twitter:twitter-api-java-sdk:2.0.2"
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/twitter-api-java-sdk-2.0.2.jar`
* `target/lib/*.jar`

## Twitter Credentials

Twitter APIs support three types of authentications:

* #### OAuth 2.0 Authorization with PKCE

TWITTER_OAUTH2_CLIENT_ID

TWITTER_OAUTH2_CLIENT_SECRET

TWITTER_OAUTH2_ACCESS_TOKEN

TWITTER_OAUTH2_REFRESH_TOKEN

TWITTER_OAUTH2_IS_AUTO_REFRESH_TOKEN - default value is `false`

* #### OAuth 2.0 Bearer Token (app-only)

TWITTER_BEARER_TOKEN



You can use the following objects in order to set the credentials:
`TwitterCredentialsOAuth2` & `TwitterCredentialsBearer`.


```java

TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsOAuth2(
      System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
      System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
      System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
      System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN")));

```

Check the `security` tag of the required APIs in https://api.twitter.com/2/openapi.json in order to use the right credential object.


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import java.util.HashSet;
import java.util.Set;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.*;

public class TwitterApiExample {

  public static void main(String[] args) {
    /**
     * Set the credentials for the required APIs.
     * The Java SDK supports TwitterCredentialsOAuth2 & TwitterCredentialsBearer.
     * Check the 'security' tag of the required APIs in https://api.twitter.com/2/openapi.json in order
     * to use the right credential object.
     */
    TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsOAuth2(
          System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
          System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
          System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
          System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN")));

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
     // findTweetById
     Get2TweetsIdResponse result = apiInstance.tweets().findTweetById("20")
       .tweetFields(tweetFields)
       .execute();
     if(result.getErrors() != null && result.getErrors().size() > 0) {
       System.out.println("Error:");

       result.getErrors().forEach(e -> {
         System.out.println(e.toString());
         if (e instanceof ResourceUnauthorizedProblem) {
           System.out.println(((ResourceUnauthorizedProblem) e).getTitle() + " " + ((ResourceUnauthorizedProblem) e).getDetail());
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
    }
  }
}


```

## Authentication

The Twitter API has multiple authentication methods that support different endpoints.
To see what method an endpoint needs go [here](https://developer.twitter.com/en/docs/api-reference-index#twitter-api-v2).

This library has support for OAuth 2.0, use `TwitterOAuth20Service` in order to get the OAuth 2.0 services.
You can see various examples on how to use the authentication in [examples/](examples/)


### Auto Refresh Token


By default the OAuth 2.0 access token should be maintained and refreshed by the user.

In order to change it to be automatically refreshed, set the `TwitterCredentialsOAuth2.isOAuth2AutoRefreshToken` to be `true`.

You can implement the callback `ApiClientCallback.onAfterRefreshToken()` in order to maintain the refreshed access token.

Check this [example](examples/src/main/java/com/twitter/clientlib/auth/OAuth20RefreshToken.java) of implementing `ApiClientCallback`


## Rate limits retry mechanism


Everyday many thousands of developers make requests to the Twitter developer platform. To help manage the sheer volume of these requests, limits are placed on the number of requests that can be made. These limits help us provide the reliable and scalable API that our developer community relies on.

Each of our APIs use rate limits in different ways. To learn more about these differences between platforms, please review the specific rate limit pages within our specific API sections.

To check connection limits response will return [three headers](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/integrate/handling-disconnections#:~:text=Rate%20limits%20and%20usage). This is useful to understand how many times you can use the rule endpoint, and how many reconnections attempts are allowed for the streaming endpoint.

The Java SDK provides APIs with a build-in retry mechanism to handle the rate limits. In case of getting an http error code 429, the API will check the response headers and will wait until the rate limit is reset.

In order to use the retry mechanism call the APIs with an additional parameter `retries` as a first argument, check the following example:


```java
  int retries = 4;
  streamResult = apiInstance.tweets().sampleStream()
                      .tweetFields(tweetFields)
                      .execute(retries);

```
  
Read more about Filtered stream and [rate limits](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/integrate/handling-disconnections)


## Get all fields


The Twitter API v2 endpoints are equipped with a set of parameters called [fields](https://developer.twitter.com/en/docs/twitter-api/fields), which allows you to select just the data that you want from each of the objects in your endpoint response.

When you need to get many fields in the response object it can be a bit gruelling to define all the needed fields.
In order to make it easier, you can use the `excludeInputFields` approach. Instead of selecting the data that you want to get, you define which fields should be excluded from the response object.
Using `excludeInputFields()` will change the behaviour of the execution, in this case all response fields will be returned besides the ones that were sent as input parameters.


```java
    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("non_public_metrics");
    tweetFields.add("promoted_metrics");
    tweetFields.add("organic_metrics");

    // Get all available fields excluding Tweet Fields `non_public_metrics`, `promoted_metrics` & `organic_metrics`
    Get2TweetsIdResponse result = apiInstance.tweets().findTweetById("20")
        .tweetFields(tweetFields).excludeInputFields().execute();

    // Get all the response fields
    Get2TweetsIdResponse result2 = apiInstance.tweets().findTweetById("20").excludeInputFields().execute();

```


## Documentation for API Endpoints

All URIs are relative to *https://api.twitter.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookmarksApi* | [**getUsersIdBookmarks**](docs/BookmarksApi.md#getUsersIdBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
*BookmarksApi* | [**postUsersIdBookmarks**](docs/BookmarksApi.md#postUsersIdBookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
*BookmarksApi* | [**usersIdBookmarksDelete**](docs/BookmarksApi.md#usersIdBookmarksDelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet
*ComplianceApi* | [**createBatchComplianceJob**](docs/ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
*ComplianceApi* | [**getBatchComplianceJob**](docs/ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get Compliance Job
*ComplianceApi* | [**listBatchComplianceJobs**](docs/ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List Compliance Jobs
*GeneralApi* | [**getOpenApiSpec**](docs/GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the OpenAPI Specification document.
*ListsApi* | [**getUserListMemberships**](docs/ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
*ListsApi* | [**listAddMember**](docs/ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
*ListsApi* | [**listIdCreate**](docs/ListsApi.md#listIdCreate) | **POST** /2/lists | Create List
*ListsApi* | [**listIdDelete**](docs/ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
*ListsApi* | [**listIdGet**](docs/ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID.
*ListsApi* | [**listIdUpdate**](docs/ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List.
*ListsApi* | [**listRemoveMember**](docs/ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
*ListsApi* | [**listUserFollow**](docs/ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
*ListsApi* | [**listUserOwnedLists**](docs/ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists.
*ListsApi* | [**listUserPin**](docs/ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
*ListsApi* | [**listUserPinnedLists**](docs/ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
*ListsApi* | [**listUserUnfollow**](docs/ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
*ListsApi* | [**listUserUnpin**](docs/ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
*ListsApi* | [**userFollowedLists**](docs/ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists
*SpacesApi* | [**findSpaceById**](docs/SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
*SpacesApi* | [**findSpacesByCreatorIds**](docs/SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
*SpacesApi* | [**findSpacesByIds**](docs/SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
*SpacesApi* | [**searchSpaces**](docs/SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
*SpacesApi* | [**spaceBuyers**](docs/SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space
*SpacesApi* | [**spaceTweets**](docs/SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space.
*TweetsApi* | [**addOrDeleteRules**](docs/TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
*TweetsApi* | [**createTweet**](docs/TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
*TweetsApi* | [**deleteTweetById**](docs/TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
*TweetsApi* | [**findTweetById**](docs/TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
*TweetsApi* | [**findTweetsById**](docs/TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
*TweetsApi* | [**findTweetsThatQuoteATweet**](docs/TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve Tweets that quote a Tweet.
*TweetsApi* | [**getRules**](docs/TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
*TweetsApi* | [**hideReplyById**](docs/TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{tweet_id}/hidden | Hide replies
*TweetsApi* | [**listsIdTweets**](docs/TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID.
*TweetsApi* | [**sampleStream**](docs/TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
*TweetsApi* | [**searchStream**](docs/TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
*TweetsApi* | [**spaceBuyers**](docs/TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space
*TweetsApi* | [**spaceTweets**](docs/TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space.
*TweetsApi* | [**tweetCountsFullArchiveSearch**](docs/TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
*TweetsApi* | [**tweetCountsRecentSearch**](docs/TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
*TweetsApi* | [**tweetsFullarchiveSearch**](docs/TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
*TweetsApi* | [**tweetsRecentSearch**](docs/TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
*TweetsApi* | [**usersIdLike**](docs/TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the User (in the path) to like the specified Tweet
*TweetsApi* | [**usersIdLikedTweets**](docs/TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
*TweetsApi* | [**usersIdMentions**](docs/TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
*TweetsApi* | [**usersIdRetweets**](docs/TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the User (in the path) to retweet the specified Tweet.
*TweetsApi* | [**usersIdTimeline**](docs/TweetsApi.md#usersIdTimeline) | **GET** /2/users/{id}/timelines/reverse_chronological | User home timeline by User ID
*TweetsApi* | [**usersIdTweets**](docs/TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
*TweetsApi* | [**usersIdUnlike**](docs/TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the User (in the path) to unlike the specified Tweet
*TweetsApi* | [**usersIdUnretweets**](docs/TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the User (in the path) to unretweet the specified Tweet
*UsersApi* | [**findMyUser**](docs/UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me
*UsersApi* | [**findUserById**](docs/UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
*UsersApi* | [**findUserByUsername**](docs/UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
*UsersApi* | [**findUsersById**](docs/UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
*UsersApi* | [**findUsersByUsername**](docs/UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
*UsersApi* | [**listGetFollowers**](docs/UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns User objects that follow a List by the provided List ID
*UsersApi* | [**listGetMembers**](docs/UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns User objects that are members of a List by the provided List ID.
*UsersApi* | [**tweetsIdLikingUsers**](docs/UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns User objects that have liked the provided Tweet ID
*UsersApi* | [**tweetsIdRetweetingUsers**](docs/UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns User objects that have retweeted the provided Tweet ID
*UsersApi* | [**usersIdBlock**](docs/UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
*UsersApi* | [**usersIdBlocking**](docs/UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns User objects that are blocked by provided User ID
*UsersApi* | [**usersIdFollow**](docs/UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
*UsersApi* | [**usersIdFollowers**](docs/UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns User objects that follow a List by the provided User ID
*UsersApi* | [**usersIdFollowing**](docs/UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
*UsersApi* | [**usersIdMute**](docs/UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID.
*UsersApi* | [**usersIdMuting**](docs/UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns User objects that are muted by the provided User ID
*UsersApi* | [**usersIdUnblock**](docs/UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
*UsersApi* | [**usersIdUnfollow**](docs/UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
*UsersApi* | [**usersIdUnmute**](docs/UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


## Documentation for Models

 - [AddOrDeleteRulesRequest](docs/AddOrDeleteRulesRequest.md)
 - [AddOrDeleteRulesResponse](docs/AddOrDeleteRulesResponse.md)
 - [AddRulesRequest](docs/AddRulesRequest.md)
 - [AnimatedGif](docs/AnimatedGif.md)
 - [AnimatedGifAllOf](docs/AnimatedGifAllOf.md)
 - [BlockUserMutationResponse](docs/BlockUserMutationResponse.md)
 - [BlockUserMutationResponseData](docs/BlockUserMutationResponseData.md)
 - [BlockUserRequest](docs/BlockUserRequest.md)
 - [BookmarkAddRequest](docs/BookmarkAddRequest.md)
 - [BookmarkMutationResponse](docs/BookmarkMutationResponse.md)
 - [BookmarkMutationResponseData](docs/BookmarkMutationResponseData.md)
 - [CashtagEntity](docs/CashtagEntity.md)
 - [CashtagFields](docs/CashtagFields.md)
 - [ClientDisconnectedProblem](docs/ClientDisconnectedProblem.md)
 - [ClientForbiddenProblem](docs/ClientForbiddenProblem.md)
 - [ClientForbiddenProblemAllOf](docs/ClientForbiddenProblemAllOf.md)
 - [ComplianceJob](docs/ComplianceJob.md)
 - [ComplianceJobStatus](docs/ComplianceJobStatus.md)
 - [ComplianceJobType](docs/ComplianceJobType.md)
 - [ConflictProblem](docs/ConflictProblem.md)
 - [ConnectionExceptionProblem](docs/ConnectionExceptionProblem.md)
 - [ConnectionExceptionProblemAllOf](docs/ConnectionExceptionProblemAllOf.md)
 - [ContextAnnotation](docs/ContextAnnotation.md)
 - [ContextAnnotationDomainFields](docs/ContextAnnotationDomainFields.md)
 - [ContextAnnotationEntityFields](docs/ContextAnnotationEntityFields.md)
 - [CreateComplianceJobRequest](docs/CreateComplianceJobRequest.md)
 - [CreateComplianceJobResponse](docs/CreateComplianceJobResponse.md)
 - [DeleteRulesRequest](docs/DeleteRulesRequest.md)
 - [DeleteRulesRequestDelete](docs/DeleteRulesRequestDelete.md)
 - [DisallowedResourceProblem](docs/DisallowedResourceProblem.md)
 - [DisallowedResourceProblemAllOf](docs/DisallowedResourceProblemAllOf.md)
 - [DuplicateRuleProblem](docs/DuplicateRuleProblem.md)
 - [DuplicateRuleProblemAllOf](docs/DuplicateRuleProblemAllOf.md)
 - [EntityIndicesInclusiveExclusive](docs/EntityIndicesInclusiveExclusive.md)
 - [EntityIndicesInclusiveInclusive](docs/EntityIndicesInclusiveInclusive.md)
 - [Error](docs/Error.md)
 - [Expansions](docs/Expansions.md)
 - [FieldUnauthorizedProblem](docs/FieldUnauthorizedProblem.md)
 - [FieldUnauthorizedProblemAllOf](docs/FieldUnauthorizedProblemAllOf.md)
 - [FilteredStreamingTweetResponse](docs/FilteredStreamingTweetResponse.md)
 - [FilteredStreamingTweetResponseMatchingRules](docs/FilteredStreamingTweetResponseMatchingRules.md)
 - [FullTextEntities](docs/FullTextEntities.md)
 - [FullTextEntitiesAnnotations](docs/FullTextEntitiesAnnotations.md)
 - [FullTextEntitiesAnnotationsAllOf](docs/FullTextEntitiesAnnotationsAllOf.md)
 - [GenericProblem](docs/GenericProblem.md)
 - [Geo](docs/Geo.md)
 - [Get2ComplianceJobsIdResponse](docs/Get2ComplianceJobsIdResponse.md)
 - [Get2ComplianceJobsResponse](docs/Get2ComplianceJobsResponse.md)
 - [Get2ComplianceJobsResponseMeta](docs/Get2ComplianceJobsResponseMeta.md)
 - [Get2ListsIdFollowersResponse](docs/Get2ListsIdFollowersResponse.md)
 - [Get2ListsIdFollowersResponseMeta](docs/Get2ListsIdFollowersResponseMeta.md)
 - [Get2ListsIdMembersResponse](docs/Get2ListsIdMembersResponse.md)
 - [Get2ListsIdResponse](docs/Get2ListsIdResponse.md)
 - [Get2ListsIdTweetsResponse](docs/Get2ListsIdTweetsResponse.md)
 - [Get2SpacesByCreatorIdsResponse](docs/Get2SpacesByCreatorIdsResponse.md)
 - [Get2SpacesIdBuyersResponse](docs/Get2SpacesIdBuyersResponse.md)
 - [Get2SpacesIdResponse](docs/Get2SpacesIdResponse.md)
 - [Get2SpacesIdTweetsResponse](docs/Get2SpacesIdTweetsResponse.md)
 - [Get2SpacesResponse](docs/Get2SpacesResponse.md)
 - [Get2SpacesSearchResponse](docs/Get2SpacesSearchResponse.md)
 - [Get2TweetsCountsAllResponse](docs/Get2TweetsCountsAllResponse.md)
 - [Get2TweetsCountsAllResponseMeta](docs/Get2TweetsCountsAllResponseMeta.md)
 - [Get2TweetsCountsRecentResponse](docs/Get2TweetsCountsRecentResponse.md)
 - [Get2TweetsIdLikingUsersResponse](docs/Get2TweetsIdLikingUsersResponse.md)
 - [Get2TweetsIdQuoteTweetsResponse](docs/Get2TweetsIdQuoteTweetsResponse.md)
 - [Get2TweetsIdQuoteTweetsResponseMeta](docs/Get2TweetsIdQuoteTweetsResponseMeta.md)
 - [Get2TweetsIdResponse](docs/Get2TweetsIdResponse.md)
 - [Get2TweetsIdRetweetedByResponse](docs/Get2TweetsIdRetweetedByResponse.md)
 - [Get2TweetsResponse](docs/Get2TweetsResponse.md)
 - [Get2TweetsSampleStreamResponse](docs/Get2TweetsSampleStreamResponse.md)
 - [Get2TweetsSearchAllResponse](docs/Get2TweetsSearchAllResponse.md)
 - [Get2TweetsSearchAllResponseMeta](docs/Get2TweetsSearchAllResponseMeta.md)
 - [Get2TweetsSearchRecentResponse](docs/Get2TweetsSearchRecentResponse.md)
 - [Get2TweetsSearchStreamResponse](docs/Get2TweetsSearchStreamResponse.md)
 - [Get2UsersByResponse](docs/Get2UsersByResponse.md)
 - [Get2UsersByUsernameUsernameResponse](docs/Get2UsersByUsernameUsernameResponse.md)
 - [Get2UsersIdBlockingResponse](docs/Get2UsersIdBlockingResponse.md)
 - [Get2UsersIdBookmarksResponse](docs/Get2UsersIdBookmarksResponse.md)
 - [Get2UsersIdFollowedListsResponse](docs/Get2UsersIdFollowedListsResponse.md)
 - [Get2UsersIdFollowersResponse](docs/Get2UsersIdFollowersResponse.md)
 - [Get2UsersIdFollowingResponse](docs/Get2UsersIdFollowingResponse.md)
 - [Get2UsersIdLikedTweetsResponse](docs/Get2UsersIdLikedTweetsResponse.md)
 - [Get2UsersIdListMembershipsResponse](docs/Get2UsersIdListMembershipsResponse.md)
 - [Get2UsersIdMentionsResponse](docs/Get2UsersIdMentionsResponse.md)
 - [Get2UsersIdMentionsResponseMeta](docs/Get2UsersIdMentionsResponseMeta.md)
 - [Get2UsersIdMutingResponse](docs/Get2UsersIdMutingResponse.md)
 - [Get2UsersIdOwnedListsResponse](docs/Get2UsersIdOwnedListsResponse.md)
 - [Get2UsersIdPinnedListsResponse](docs/Get2UsersIdPinnedListsResponse.md)
 - [Get2UsersIdResponse](docs/Get2UsersIdResponse.md)
 - [Get2UsersIdTimelinesReverseChronologicalResponse](docs/Get2UsersIdTimelinesReverseChronologicalResponse.md)
 - [Get2UsersIdTweetsResponse](docs/Get2UsersIdTweetsResponse.md)
 - [Get2UsersMeResponse](docs/Get2UsersMeResponse.md)
 - [Get2UsersResponse](docs/Get2UsersResponse.md)
 - [HashtagEntity](docs/HashtagEntity.md)
 - [HashtagFields](docs/HashtagFields.md)
 - [InvalidRequestProblem](docs/InvalidRequestProblem.md)
 - [InvalidRequestProblemAllOf](docs/InvalidRequestProblemAllOf.md)
 - [InvalidRequestProblemAllOfErrors](docs/InvalidRequestProblemAllOfErrors.md)
 - [InvalidRuleProblem](docs/InvalidRuleProblem.md)
 - [ListAddUserRequest](docs/ListAddUserRequest.md)
 - [ListCreateRequest](docs/ListCreateRequest.md)
 - [ListCreateResponse](docs/ListCreateResponse.md)
 - [ListCreateResponseData](docs/ListCreateResponseData.md)
 - [ListDeleteResponse](docs/ListDeleteResponse.md)
 - [ListDeleteResponseData](docs/ListDeleteResponseData.md)
 - [ListFollowedRequest](docs/ListFollowedRequest.md)
 - [ListFollowedResponse](docs/ListFollowedResponse.md)
 - [ListFollowedResponseData](docs/ListFollowedResponseData.md)
 - [ListMutateResponse](docs/ListMutateResponse.md)
 - [ListMutateResponseData](docs/ListMutateResponseData.md)
 - [ListPinnedRequest](docs/ListPinnedRequest.md)
 - [ListPinnedResponse](docs/ListPinnedResponse.md)
 - [ListPinnedResponseData](docs/ListPinnedResponseData.md)
 - [ListUnpinResponse](docs/ListUnpinResponse.md)
 - [ListUpdateRequest](docs/ListUpdateRequest.md)
 - [ListUpdateResponse](docs/ListUpdateResponse.md)
 - [ListUpdateResponseData](docs/ListUpdateResponseData.md)
 - [Media](docs/Media.md)
 - [MentionEntity](docs/MentionEntity.md)
 - [MentionFields](docs/MentionFields.md)
 - [ModelList](docs/ModelList.md)
 - [MuteUserMutationResponse](docs/MuteUserMutationResponse.md)
 - [MuteUserMutationResponseData](docs/MuteUserMutationResponseData.md)
 - [MuteUserRequest](docs/MuteUserRequest.md)
 - [NonCompliantRulesProblem](docs/NonCompliantRulesProblem.md)
 - [OperationalDisconnectProblem](docs/OperationalDisconnectProblem.md)
 - [OperationalDisconnectProblemAllOf](docs/OperationalDisconnectProblemAllOf.md)
 - [Photo](docs/Photo.md)
 - [PhotoAllOf](docs/PhotoAllOf.md)
 - [Place](docs/Place.md)
 - [PlaceType](docs/PlaceType.md)
 - [Point](docs/Point.md)
 - [Poll](docs/Poll.md)
 - [PollOption](docs/PollOption.md)
 - [Problem](docs/Problem.md)
 - [ProblemErrors](docs/ProblemErrors.md)
 - [ProblemOrError](docs/ProblemOrError.md)
 - [ReplySettings](docs/ReplySettings.md)
 - [ReportUsersRequest](docs/ReportUsersRequest.md)
 - [ReportUsersResponse](docs/ReportUsersResponse.md)
 - [ReportUsersResponseData](docs/ReportUsersResponseData.md)
 - [ResourceNotFoundProblem](docs/ResourceNotFoundProblem.md)
 - [ResourceNotFoundProblemAllOf](docs/ResourceNotFoundProblemAllOf.md)
 - [ResourceUnauthorizedProblem](docs/ResourceUnauthorizedProblem.md)
 - [ResourceUnauthorizedProblemAllOf](docs/ResourceUnauthorizedProblemAllOf.md)
 - [ResourceUnavailableProblem](docs/ResourceUnavailableProblem.md)
 - [ResourceUnavailableProblemAllOf](docs/ResourceUnavailableProblemAllOf.md)
 - [Rule](docs/Rule.md)
 - [RuleNoId](docs/RuleNoId.md)
 - [RulesCapProblem](docs/RulesCapProblem.md)
 - [RulesLookupResponse](docs/RulesLookupResponse.md)
 - [RulesRequestSummary](docs/RulesRequestSummary.md)
 - [RulesRequestSummaryOneOf](docs/RulesRequestSummaryOneOf.md)
 - [RulesRequestSummaryOneOf1](docs/RulesRequestSummaryOneOf1.md)
 - [RulesResponseMetadata](docs/RulesResponseMetadata.md)
 - [SearchCount](docs/SearchCount.md)
 - [Space](docs/Space.md)
 - [SpaceTopics](docs/SpaceTopics.md)
 - [StreamingTweetResponse](docs/StreamingTweetResponse.md)
 - [Topic](docs/Topic.md)
 - [Tweet](docs/Tweet.md)
 - [TweetAttachments](docs/TweetAttachments.md)
 - [TweetCreateRequest](docs/TweetCreateRequest.md)
 - [TweetCreateRequestGeo](docs/TweetCreateRequestGeo.md)
 - [TweetCreateRequestMedia](docs/TweetCreateRequestMedia.md)
 - [TweetCreateRequestPoll](docs/TweetCreateRequestPoll.md)
 - [TweetCreateRequestReply](docs/TweetCreateRequestReply.md)
 - [TweetCreateResponse](docs/TweetCreateResponse.md)
 - [TweetCreateResponseData](docs/TweetCreateResponseData.md)
 - [TweetDeleteResponse](docs/TweetDeleteResponse.md)
 - [TweetDeleteResponseData](docs/TweetDeleteResponseData.md)
 - [TweetGeo](docs/TweetGeo.md)
 - [TweetHideRequest](docs/TweetHideRequest.md)
 - [TweetHideResponse](docs/TweetHideResponse.md)
 - [TweetHideResponseData](docs/TweetHideResponseData.md)
 - [TweetNonPublicMetrics](docs/TweetNonPublicMetrics.md)
 - [TweetOrganicMetrics](docs/TweetOrganicMetrics.md)
 - [TweetPromotedMetrics](docs/TweetPromotedMetrics.md)
 - [TweetPublicMetrics](docs/TweetPublicMetrics.md)
 - [TweetReferencedTweets](docs/TweetReferencedTweets.md)
 - [TweetWithheld](docs/TweetWithheld.md)
 - [UnsupportedAuthenticationProblem](docs/UnsupportedAuthenticationProblem.md)
 - [UrlEntity](docs/UrlEntity.md)
 - [UrlFields](docs/UrlFields.md)
 - [UrlImage](docs/UrlImage.md)
 - [UsageCapExceededProblem](docs/UsageCapExceededProblem.md)
 - [UsageCapExceededProblemAllOf](docs/UsageCapExceededProblemAllOf.md)
 - [User](docs/User.md)
 - [UserEntities](docs/UserEntities.md)
 - [UserEntitiesUrl](docs/UserEntitiesUrl.md)
 - [UserPublicMetrics](docs/UserPublicMetrics.md)
 - [UserWithheld](docs/UserWithheld.md)
 - [UsersFollowingCreateRequest](docs/UsersFollowingCreateRequest.md)
 - [UsersFollowingCreateResponse](docs/UsersFollowingCreateResponse.md)
 - [UsersFollowingCreateResponseData](docs/UsersFollowingCreateResponseData.md)
 - [UsersFollowingDeleteResponse](docs/UsersFollowingDeleteResponse.md)
 - [UsersLikesCreateRequest](docs/UsersLikesCreateRequest.md)
 - [UsersLikesCreateResponse](docs/UsersLikesCreateResponse.md)
 - [UsersLikesCreateResponseData](docs/UsersLikesCreateResponseData.md)
 - [UsersLikesDeleteResponse](docs/UsersLikesDeleteResponse.md)
 - [UsersRetweetsCreateRequest](docs/UsersRetweetsCreateRequest.md)
 - [UsersRetweetsCreateResponse](docs/UsersRetweetsCreateResponse.md)
 - [UsersRetweetsCreateResponseData](docs/UsersRetweetsCreateResponseData.md)
 - [UsersRetweetsDeleteResponse](docs/UsersRetweetsDeleteResponse.md)
 - [Variant](docs/Variant.md)
 - [Video](docs/Video.md)
 - [VideoAllOf](docs/VideoAllOf.md)
 - [VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)







