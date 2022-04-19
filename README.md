# Twitter API Client Library for Java.

**Note: This SDK is in beta and is not ready for production**

You can find examples of using the SDK under the [examples/](examples/) directory

**Note: Only Twitter API V2 is supported**



Twitter API v2 available endpoints

  For more information, please visit [https://developer.twitter.com/](https://developer.twitter.com/)


## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

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
  <version>1.1.4</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.twitter:twitter-api-java-sdk:1.1.4"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/twitter-api-java-sdk-1.1.4.jar`
- `target/lib/*.jar`

## Twitter Credentials

Twitter APIs support three types of authentications:

* OAuth 2.0 Authorization with PKCE

TWITTER_OAUTH2_CLIENT_ID

TWITTER_OAUTH2_CLIENT_SECRET

TWITTER_OAUTH2_ACCESS_TOKEN

TWITTER_OAUTH2_REFRESH_TOKEN

TWITTER_OAUTH2_IS_AUTO_REFRESH_TOKEN - default value is `false`

* OAuth 2.0 Bearer Token (app-only)

TWITTER_BEARER_TOKEN

* OAuth 1.0a

TWITTER_CONSUMER_KEY

TWITTER_CONSUMER_SECRET

TWITTER_TOKEN

TWITTER_TOKEN_SECRET



You can use the following objects in order to set the credentials:
`TwitterCredentialsOAuth2`, `TwitterCredentialsBearer` & `TwitterCredentialsOAuth1`.


```java

TwitterApi apiInstance = new TwitterApi();
TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
        System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
        System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
        System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
apiInstance.setTwitterCredentials(credentials);

```

Check the `security` tag of the required APIs in https://api.twitter.com/2/openapi.json in order to use the right credential object.


## Getting Started

Please follow the [installation](#installation) instructions and execute the following Java code:

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
     * The Java SDK supports TwitterCredentialsOAuth2, TwitterCredentialsBearer & TwitterCredentialsOAuth1.
     * Check the 'security' tag of the required APIs in https://api.twitter.com/2/openapi.json in order
     * to use the right credential object.
     */
    TwitterApi apiInstance = new TwitterApi();
    TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
          System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
          System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
          System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    apiInstance.setTwitterCredentials(credentials);

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
     // findTweetById
     SingleTweetLookupResponse result = apiInstance.tweets().findTweetById("20", null, tweetFields, null , null, null, null);
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
  streamResult = apiInstance.tweets().sampleStream(retries, null, tweetFields, null, null, null, null, 0);

```
  
Read more about Filtered stream and [rate limits](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/integrate/handling-disconnections)


## Documentation for API Endpoints

All URIs are relative to *https://api.twitter.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookmarksApi* | [**getUsersIdBookmarks**](docs/BookmarksApi.md#getUsersIdBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
*BookmarksApi* | [**postUsersIdBookmarks**](docs/BookmarksApi.md#postUsersIdBookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
*BookmarksApi* | [**usersIdBookmarksDelete**](docs/BookmarksApi.md#usersIdBookmarksDelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet
*ComplianceApi* | [**createBatchComplianceJob**](docs/ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
*ComplianceApi* | [**getBatchComplianceJob**](docs/ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
*ComplianceApi* | [**listBatchComplianceJobs**](docs/ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs
*GeneralApi* | [**getOpenApiSpec**](docs/GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the open api spec document.
*ListsApi* | [**getUserListMemberships**](docs/ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
*ListsApi* | [**listAddMember**](docs/ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
*ListsApi* | [**listIdCreate**](docs/ListsApi.md#listIdCreate) | **POST** /2/lists | Create List
*ListsApi* | [**listIdDelete**](docs/ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
*ListsApi* | [**listIdGet**](docs/ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID
*ListsApi* | [**listIdUpdate**](docs/ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List
*ListsApi* | [**listRemoveMember**](docs/ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
*ListsApi* | [**listUserFollow**](docs/ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
*ListsApi* | [**listUserOwnedLists**](docs/ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
*ListsApi* | [**listUserPin**](docs/ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
*ListsApi* | [**listUserPinnedLists**](docs/ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
*ListsApi* | [**listUserUnfollow**](docs/ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
*ListsApi* | [**listUserUnpin**](docs/ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
*ListsApi* | [**userFollowedLists**](docs/ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists
*SpacesApi* | [**findSpaceById**](docs/SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
*SpacesApi* | [**findSpacesByCreatorIds**](docs/SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
*SpacesApi* | [**findSpacesByIds**](docs/SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
*SpacesApi* | [**searchSpaces**](docs/SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
*SpacesApi* | [**spaceBuyers**](docs/SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
*SpacesApi* | [**spaceTweets**](docs/SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
*TweetsApi* | [**addOrDeleteRules**](docs/TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
*TweetsApi* | [**createTweet**](docs/TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
*TweetsApi* | [**deleteTweetById**](docs/TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
*TweetsApi* | [**findTweetById**](docs/TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
*TweetsApi* | [**findTweetsById**](docs/TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
*TweetsApi* | [**findTweetsThatQuoteATweet**](docs/TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve tweets that quote a tweet.
*TweetsApi* | [**getRules**](docs/TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
*TweetsApi* | [**hideReplyById**](docs/TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
*TweetsApi* | [**listsIdTweets**](docs/TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
*TweetsApi* | [**sampleStream**](docs/TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
*TweetsApi* | [**searchStream**](docs/TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
*TweetsApi* | [**spaceBuyers**](docs/TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
*TweetsApi* | [**spaceTweets**](docs/TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
*TweetsApi* | [**tweetCountsFullArchiveSearch**](docs/TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
*TweetsApi* | [**tweetCountsRecentSearch**](docs/TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
*TweetsApi* | [**tweetsFullarchiveSearch**](docs/TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
*TweetsApi* | [**tweetsRecentSearch**](docs/TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
*TweetsApi* | [**usersIdLike**](docs/TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
*TweetsApi* | [**usersIdLikedTweets**](docs/TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
*TweetsApi* | [**usersIdMentions**](docs/TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
*TweetsApi* | [**usersIdRetweets**](docs/TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
*TweetsApi* | [**usersIdTweets**](docs/TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
*TweetsApi* | [**usersIdUnlike**](docs/TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
*TweetsApi* | [**usersIdUnretweets**](docs/TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet
*UsersApi* | [**findMyUser**](docs/UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me
*UsersApi* | [**findUserById**](docs/UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
*UsersApi* | [**findUserByUsername**](docs/UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
*UsersApi* | [**findUsersById**](docs/UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
*UsersApi* | [**findUsersByUsername**](docs/UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
*UsersApi* | [**listGetFollowers**](docs/UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
*UsersApi* | [**listGetMembers**](docs/UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
*UsersApi* | [**tweetsIdLikingUsers**](docs/UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
*UsersApi* | [**tweetsIdRetweetingUsers**](docs/UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
*UsersApi* | [**usersIdBlock**](docs/UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
*UsersApi* | [**usersIdBlocking**](docs/UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
*UsersApi* | [**usersIdFollow**](docs/UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
*UsersApi* | [**usersIdFollowers**](docs/UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
*UsersApi* | [**usersIdFollowing**](docs/UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
*UsersApi* | [**usersIdMute**](docs/UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID
*UsersApi* | [**usersIdMuting**](docs/UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
*UsersApi* | [**usersIdUnblock**](docs/UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
*UsersApi* | [**usersIdUnfollow**](docs/UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
*UsersApi* | [**usersIdUnmute**](docs/UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


## Documentation for Models

 - [AddBookmarkRequest](docs/AddBookmarkRequest.md)
 - [AddOrDeleteRulesRequest](docs/AddOrDeleteRulesRequest.md)
 - [AddOrDeleteRulesResponse](docs/AddOrDeleteRulesResponse.md)
 - [AddRulesRequest](docs/AddRulesRequest.md)
 - [AnimatedGif](docs/AnimatedGif.md)
 - [AnimatedGifAllOf](docs/AnimatedGifAllOf.md)
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
 - [CreateBatchComplianceJobRequest](docs/CreateBatchComplianceJobRequest.md)
 - [CreateTweetRequest](docs/CreateTweetRequest.md)
 - [CreateTweetRequestGeo](docs/CreateTweetRequestGeo.md)
 - [CreateTweetRequestMedia](docs/CreateTweetRequestMedia.md)
 - [CreateTweetRequestPoll](docs/CreateTweetRequestPoll.md)
 - [CreateTweetRequestReply](docs/CreateTweetRequestReply.md)
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
 - [FilteredStreamingTweet](docs/FilteredStreamingTweet.md)
 - [FilteredStreamingTweetOneOf](docs/FilteredStreamingTweetOneOf.md)
 - [FilteredStreamingTweetOneOf1](docs/FilteredStreamingTweetOneOf1.md)
 - [FilteredStreamingTweetOneOfMatchingRules](docs/FilteredStreamingTweetOneOfMatchingRules.md)
 - [FullTextEntities](docs/FullTextEntities.md)
 - [GenericMultipleUsersLookupResponse](docs/GenericMultipleUsersLookupResponse.md)
 - [GenericMultipleUsersLookupResponseMeta](docs/GenericMultipleUsersLookupResponseMeta.md)
 - [GenericProblem](docs/GenericProblem.md)
 - [GenericTweetsTimelineResponse](docs/GenericTweetsTimelineResponse.md)
 - [GenericTweetsTimelineResponseMeta](docs/GenericTweetsTimelineResponseMeta.md)
 - [Geo](docs/Geo.md)
 - [GetRulesResponse](docs/GetRulesResponse.md)
 - [Granularity](docs/Granularity.md)
 - [HashtagEntity](docs/HashtagEntity.md)
 - [HashtagFields](docs/HashtagFields.md)
 - [HideReplyByIdRequest](docs/HideReplyByIdRequest.md)
 - [HideReplyByIdResponse](docs/HideReplyByIdResponse.md)
 - [HideReplyByIdResponseData](docs/HideReplyByIdResponseData.md)
 - [InvalidRequestProblem](docs/InvalidRequestProblem.md)
 - [InvalidRequestProblemAllOf](docs/InvalidRequestProblemAllOf.md)
 - [InvalidRequestProblemAllOfErrors](docs/InvalidRequestProblemAllOfErrors.md)
 - [InvalidRuleProblem](docs/InvalidRuleProblem.md)
 - [ListAddMemberRequest](docs/ListAddMemberRequest.md)
 - [ListCreateRequest](docs/ListCreateRequest.md)
 - [ListCreateResponse](docs/ListCreateResponse.md)
 - [ListDeleteResponse](docs/ListDeleteResponse.md)
 - [ListDeleteResponseData](docs/ListDeleteResponseData.md)
 - [ListFollowRequest](docs/ListFollowRequest.md)
 - [ListFollowedResponse](docs/ListFollowedResponse.md)
 - [ListFollowedResponseData](docs/ListFollowedResponseData.md)
 - [ListLookupMultipleUsersLookupResponse](docs/ListLookupMultipleUsersLookupResponse.md)
 - [ListLookupMultipleUsersLookupResponseMeta](docs/ListLookupMultipleUsersLookupResponseMeta.md)
 - [ListMemberResponse](docs/ListMemberResponse.md)
 - [ListMemberResponseData](docs/ListMemberResponseData.md)
 - [ListPinRequest](docs/ListPinRequest.md)
 - [ListPinnedResponse](docs/ListPinnedResponse.md)
 - [ListPinnedResponseData](docs/ListPinnedResponseData.md)
 - [ListUpdateRequest](docs/ListUpdateRequest.md)
 - [ListUpdateResponse](docs/ListUpdateResponse.md)
 - [ListUpdateResponseData](docs/ListUpdateResponseData.md)
 - [ListsIdTweetsResponse](docs/ListsIdTweetsResponse.md)
 - [Media](docs/Media.md)
 - [MentionEntity](docs/MentionEntity.md)
 - [MentionFields](docs/MentionFields.md)
 - [ModelList](docs/ModelList.md)
 - [MultiComplianceJobResponse](docs/MultiComplianceJobResponse.md)
 - [MultiListNoPaginationResponse](docs/MultiListNoPaginationResponse.md)
 - [MultiListNoPaginationResponseMeta](docs/MultiListNoPaginationResponseMeta.md)
 - [MultiListResponse](docs/MultiListResponse.md)
 - [MultiListResponseMeta](docs/MultiListResponseMeta.md)
 - [MultiSpaceLookupResponse](docs/MultiSpaceLookupResponse.md)
 - [MultiTweetLookupResponse](docs/MultiTweetLookupResponse.md)
 - [MultiTweetLookupResponseMeta](docs/MultiTweetLookupResponseMeta.md)
 - [MultiUserLookupResponse](docs/MultiUserLookupResponse.md)
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
 - [ProblemOrError](docs/ProblemOrError.md)
 - [QuoteTweetLookupResponse](docs/QuoteTweetLookupResponse.md)
 - [QuoteTweetLookupResponseMeta](docs/QuoteTweetLookupResponseMeta.md)
 - [ReplySettings](docs/ReplySettings.md)
 - [ResourceNotFoundProblem](docs/ResourceNotFoundProblem.md)
 - [ResourceNotFoundProblemAllOf](docs/ResourceNotFoundProblemAllOf.md)
 - [ResourceUnauthorizedProblem](docs/ResourceUnauthorizedProblem.md)
 - [ResourceUnauthorizedProblemAllOf](docs/ResourceUnauthorizedProblemAllOf.md)
 - [ResourceUnavailableProblem](docs/ResourceUnavailableProblem.md)
 - [ResourceUnavailableProblemAllOf](docs/ResourceUnavailableProblemAllOf.md)
 - [Rule](docs/Rule.md)
 - [RuleNoId](docs/RuleNoId.md)
 - [RulesCapProblem](docs/RulesCapProblem.md)
 - [RulesRequestSummary](docs/RulesRequestSummary.md)
 - [RulesRequestSummaryOneOf](docs/RulesRequestSummaryOneOf.md)
 - [RulesRequestSummaryOneOf1](docs/RulesRequestSummaryOneOf1.md)
 - [RulesResponseMetadata](docs/RulesResponseMetadata.md)
 - [SearchCount](docs/SearchCount.md)
 - [SingleComplianceJobResponse](docs/SingleComplianceJobResponse.md)
 - [SingleListLookupResponse](docs/SingleListLookupResponse.md)
 - [SingleListLookupResponseIncludes](docs/SingleListLookupResponseIncludes.md)
 - [SingleSpaceLookupResponse](docs/SingleSpaceLookupResponse.md)
 - [SingleTweetLookupResponse](docs/SingleTweetLookupResponse.md)
 - [SingleUserLookupResponse](docs/SingleUserLookupResponse.md)
 - [Space](docs/Space.md)
 - [SpaceTopics](docs/SpaceTopics.md)
 - [StreamingTweet](docs/StreamingTweet.md)
 - [Tweet](docs/Tweet.md)
 - [TweetAttachments](docs/TweetAttachments.md)
 - [TweetCountsResponse](docs/TweetCountsResponse.md)
 - [TweetCountsResponseMeta](docs/TweetCountsResponseMeta.md)
 - [TweetCreateResponse](docs/TweetCreateResponse.md)
 - [TweetCreateResponseData](docs/TweetCreateResponseData.md)
 - [TweetDeleteResponse](docs/TweetDeleteResponse.md)
 - [TweetDeleteResponseData](docs/TweetDeleteResponseData.md)
 - [TweetGeo](docs/TweetGeo.md)
 - [TweetNonPublicMetrics](docs/TweetNonPublicMetrics.md)
 - [TweetOrganicMetrics](docs/TweetOrganicMetrics.md)
 - [TweetPromotedMetrics](docs/TweetPromotedMetrics.md)
 - [TweetPublicMetrics](docs/TweetPublicMetrics.md)
 - [TweetReferencedTweets](docs/TweetReferencedTweets.md)
 - [TweetSearchResponse](docs/TweetSearchResponse.md)
 - [TweetSearchResponseMeta](docs/TweetSearchResponseMeta.md)
 - [TweetWithheld](docs/TweetWithheld.md)
 - [URLFields](docs/URLFields.md)
 - [URLImage](docs/URLImage.md)
 - [UnsupportedAuthenticationProblem](docs/UnsupportedAuthenticationProblem.md)
 - [UrlEntity](docs/UrlEntity.md)
 - [UsageCapExceededProblem](docs/UsageCapExceededProblem.md)
 - [UsageCapExceededProblemAllOf](docs/UsageCapExceededProblemAllOf.md)
 - [User](docs/User.md)
 - [UserEntities](docs/UserEntities.md)
 - [UserEntitiesUrl](docs/UserEntitiesUrl.md)
 - [UserPublicMetrics](docs/UserPublicMetrics.md)
 - [UserWithheld](docs/UserWithheld.md)
 - [UsersBlockingMutationResponse](docs/UsersBlockingMutationResponse.md)
 - [UsersBlockingMutationResponseData](docs/UsersBlockingMutationResponseData.md)
 - [UsersFollowingCreateResponse](docs/UsersFollowingCreateResponse.md)
 - [UsersFollowingCreateResponseData](docs/UsersFollowingCreateResponseData.md)
 - [UsersFollowingDeleteResponse](docs/UsersFollowingDeleteResponse.md)
 - [UsersFollowingLookupResponse](docs/UsersFollowingLookupResponse.md)
 - [UsersIdBlockRequest](docs/UsersIdBlockRequest.md)
 - [UsersIdFollowRequest](docs/UsersIdFollowRequest.md)
 - [UsersIdLikedTweetsResponse](docs/UsersIdLikedTweetsResponse.md)
 - [UsersIdLikedTweetsResponseMeta](docs/UsersIdLikedTweetsResponseMeta.md)
 - [UsersIdMuteRequest](docs/UsersIdMuteRequest.md)
 - [UsersLikesCreateRequest](docs/UsersLikesCreateRequest.md)
 - [UsersLikesCreateResponse](docs/UsersLikesCreateResponse.md)
 - [UsersLikesCreateResponseData](docs/UsersLikesCreateResponseData.md)
 - [UsersLikesDeleteResponse](docs/UsersLikesDeleteResponse.md)
 - [UsersMutingMutationResponse](docs/UsersMutingMutationResponse.md)
 - [UsersMutingMutationResponseData](docs/UsersMutingMutationResponseData.md)
 - [UsersRetweetsCreateRequest](docs/UsersRetweetsCreateRequest.md)
 - [UsersRetweetsCreateResponse](docs/UsersRetweetsCreateResponse.md)
 - [UsersRetweetsCreateResponseData](docs/UsersRetweetsCreateResponseData.md)
 - [UsersRetweetsDeleteResponse](docs/UsersRetweetsDeleteResponse.md)
 - [Video](docs/Video.md)
 - [VideoAllOf](docs/VideoAllOf.md)
 - [VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)













