

# TweetCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardUri** | **String** | Card Uri Parameter. This is mutually exclusive from Quote Tweet Id, Poll, Media, and Direct Message Deep Link. |  [optional] |
|**directMessageDeepLink** | **String** | Link to take the conversation from the public timeline to a private Direct Message. |  [optional] |
|**forSuperFollowersOnly** | **Boolean** | Exclusive Tweet for super followers. |  [optional] |
|**geo** | [**TweetCreateRequestGeo**](TweetCreateRequestGeo.md) |  |  [optional] |
|**media** | [**TweetCreateRequestMedia**](TweetCreateRequestMedia.md) |  |  [optional] |
|**nullcast** | **Boolean** | Nullcasted (promoted-only) Tweets do not appear in the public timeline and are not served to followers. |  [optional] |
|**poll** | [**TweetCreateRequestPoll**](TweetCreateRequestPoll.md) |  |  [optional] |
|**quoteTweetId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional] |
|**reply** | [**TweetCreateRequestReply**](TweetCreateRequestReply.md) |  |  [optional] |
|**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional] |
|**text** | **String** | The content of the Tweet. |  [optional] |



## Enum: ReplySettingsEnum

| Name | Value |
|---- | -----|
| FOLLOWING | &quot;following&quot; |
| MENTIONEDUSERS | &quot;mentionedUsers&quot; |



