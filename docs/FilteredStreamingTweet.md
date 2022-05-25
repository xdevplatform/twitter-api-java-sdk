

# FilteredStreamingTweet

A tweet or error that can be returned by the streaming tweet API. The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Tweet**](Tweet.md) |  |  [optional]
**matchingRules** | [**List&lt;FilteredStreamingTweetMatchingRules&gt;**](FilteredStreamingTweetMatchingRules.md) | The list of rules which matched the tweet |  [optional]
**includes** | [**Expansions**](Expansions.md) |  |  [optional]
**errors** | [**List&lt;Problem&gt;**](Problem.md) |  |  [optional]



