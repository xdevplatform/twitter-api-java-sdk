

# UrlEntity

Represent the portion of text recognized as a URL, and its start and end position within the text.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **Integer** | Index (zero-based) at which position this entity starts.  The index is inclusive. | 
**end** | **Integer** | Index (zero-based) at which position this entity ends.  The index is exclusive. | 
**url** | **URI** | A validly formatted URL. | 
**expandedUrl** | **URI** | A validly formatted URL. |  [optional]
**displayUrl** | **String** | The URL as displayed in the Twitter client. |  [optional]
**unwoundUrl** | **URI** | Fully resolved url |  [optional]
**status** | **Integer** | HTTP Status Code. |  [optional]
**title** | **String** | Title of the page the URL points to. |  [optional]
**description** | **String** | Description of the URL landing page. |  [optional]
**images** | [**List&lt;URLImage&gt;**](URLImage.md) |  |  [optional]



