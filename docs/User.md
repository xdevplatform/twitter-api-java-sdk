

# User

The Twitter User object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Creation time of this User. |  [optional] |
|**description** | **String** | The text of this User&#39;s profile description (also known as bio), if the User provided one. |  [optional] |
|**entities** | [**UserEntities**](UserEntities.md) |  |  [optional] |
|**id** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  |
|**location** | **String** | The location specified in the User&#39;s profile, if the User provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries. |  [optional] |
|**name** | **String** | The friendly name of this User, as shown on their profile. |  |
|**pinnedTweetId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional] |
|**profileImageUrl** | **URL** | The URL to the profile image for this User. |  [optional] |
|**_protected** | **Boolean** | Indicates if this User has chosen to protect their Tweets (in other words, if this User&#39;s Tweets are private). |  [optional] |
|**publicMetrics** | [**UserPublicMetrics**](UserPublicMetrics.md) |  |  [optional] |
|**url** | **String** | The URL specified in the User&#39;s profile. |  [optional] |
|**username** | **String** | The Twitter handle (screen name) of this user. |  |
|**verified** | **Boolean** | Indicate if this User is a verified Twitter User. |  [optional] |
|**withheld** | [**UserWithheld**](UserWithheld.md) |  |  [optional] |



