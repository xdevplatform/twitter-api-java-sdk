

# TweetWithheld

Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**copyright** | **Boolean** | Indicates if the content is being withheld for on the basis of copyright infringement. |  |
|**countryCodes** | **Set&lt;String&gt;** | Provides a list of countries where this content is not available. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Indicates whether the content being withheld is the &#x60;tweet&#x60; or a &#x60;user&#x60;. |  [optional] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| TWEET | &quot;tweet&quot; |
| USER | &quot;user&quot; |



