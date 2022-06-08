

# FilteredStreamingTweetResponse

A Tweet or error that can be returned by the streaming Tweet API. The values returned with a successful streamed Tweet includes the user provided rules that the Tweet matched.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**Tweet**](Tweet.md) |  |  [optional] |
|**errors** | [**List&lt;Problem&gt;**](Problem.md) |  |  [optional] |
|**includes** | [**Expansions**](Expansions.md) |  |  [optional] |
|**matchingRules** | [**List&lt;FilteredStreamingTweetResponseMatchingRulesInner&gt;**](FilteredStreamingTweetResponseMatchingRulesInner.md) | The list of rules which matched the Tweet |  [optional] |



