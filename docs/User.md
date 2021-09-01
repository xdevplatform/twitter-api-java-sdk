

# User

The Twitter User object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**createdAt** | **OffsetDateTime** | Creation time of this user. |  [optional]
**name** | **String** | The friendly name of this user, as shown on their profile. | 
**username** | **String** | The Twitter handle (screen name) of this user. | 
**_protected** | **Boolean** | Indicates if this user has chosen to protect their Tweets (in other words, if this user&#39;s Tweets are private). |  [optional]
**verified** | **Boolean** | Indicate if this user is a verified Twitter User. |  [optional]
**withheld** | [**UserWithheld**](UserWithheld.md) |  |  [optional]
**profileImageUrl** | **URI** | The URL to the profile image for this user. |  [optional]
**location** | **String** | The location specified in the user&#39;s profile, if the user provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries. |  [optional]
**url** | **String** | The URL specified in the user&#39;s profile. |  [optional]
**description** | **String** | The text of this user&#39;s profile description (also known as bio), if the user provided one. |  [optional]
**entities** | [**UserEntities**](UserEntities.md) |  |  [optional]
**pinnedTweetId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**publicMetrics** | [**UserPublicMetrics**](UserPublicMetrics.md) |  |  [optional]



