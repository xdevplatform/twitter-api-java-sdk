

# ComplianceJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Creation time of the compliance job. |  |
|**downloadExpiresAt** | **OffsetDateTime** | Expiration time of the download URL. |  |
|**downloadUrl** | **URL** | URL from which the user will retrieve their compliance results. |  |
|**id** | **String** | Compliance Job ID. |  |
|**name** | **String** | User-provided name for a compliance job. |  [optional] |
|**status** | **ComplianceJobStatus** |  |  |
|**type** | **ComplianceJobType** |  |  |
|**uploadExpiresAt** | **OffsetDateTime** | Expiration time of the upload URL. |  |
|**uploadUrl** | **URL** | URL to which the user will upload their Tweet or user IDs. |  |



