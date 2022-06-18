

# UrlEntity

Represent the portion of text recognized as a URL, and its start and end position within the text.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**end** | **Integer** | Index (zero-based) at which position this entity ends.  The index is exclusive. |  |
|**start** | **Integer** | Index (zero-based) at which position this entity starts.  The index is inclusive. |  |
|**description** | **String** | Description of the URL landing page. |  [optional] |
|**displayUrl** | **String** | The URL as displayed in the Twitter client. |  [optional] |
|**expandedUrl** | **URL** | A validly formatted URL. |  [optional] |
|**images** | [**List&lt;UrlImage&gt;**](UrlImage.md) |  |  [optional] |
|**mediaKey** | **String** | The Media Key identifier for this attachment. |  [optional] |
|**status** | **Integer** | HTTP Status Code. |  [optional] |
|**title** | **String** | Title of the page the URL points to. |  [optional] |
|**unwoundUrl** | **URL** | Fully resolved url. |  [optional] |
|**url** | **URL** | A validly formatted URL. |  |



