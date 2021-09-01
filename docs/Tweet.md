

# Tweet


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**createdAt** | **OffsetDateTime** | Creation time of the Tweet. |  [optional]
**text** | **String** | The content of the Tweet. | 
**authorId** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**inReplyToUserId** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**conversationId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**replySettings** | **ReplySettings** |  |  [optional]
**referencedTweets** | [**List&lt;TweetReferencedTweets&gt;**](TweetReferencedTweets.md) | A list of Tweets this Tweet refers to. For example, if the parent Tweet is a Retweet, a Quoted Tweet or a Reply, it will include the related Tweet referenced to by its parent. |  [optional]
**attachments** | [**TweetAttachments**](TweetAttachments.md) |  |  [optional]
**contextAnnotations** | [**List&lt;ContextAnnotation&gt;**](ContextAnnotation.md) |  |  [optional]
**withheld** | [**TweetWithheld**](TweetWithheld.md) |  |  [optional]
**geo** | [**TweetGeo**](TweetGeo.md) |  |  [optional]
**entities** | [**FullTextEntities**](FullTextEntities.md) |  |  [optional]
**publicMetrics** | [**TweetPublicMetrics**](TweetPublicMetrics.md) |  |  [optional]
**possiblySensitive** | **Boolean** | Indicates if this Tweet contains URLs marked as sensitive, for example content suitable for mature audiences. |  [optional]
**lang** | **String** | Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag. |  [optional]
**source** | **String** | The name of the app the user Tweeted from. |  [optional]
**nonPublicMetrics** | [**TweetNonPublicMetrics**](TweetNonPublicMetrics.md) |  |  [optional]
**promotedMetrics** | [**TweetPromotedMetrics**](TweetPromotedMetrics.md) |  |  [optional]
**organicMetrics** | [**TweetOrganicMetrics**](TweetOrganicMetrics.md) |  |  [optional]



