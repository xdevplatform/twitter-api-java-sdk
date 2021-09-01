

# ComplianceJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Compliance Job ID | 
**type** | **ComplianceJobType** |  | 
**createdAt** | **OffsetDateTime** | Creation time of the compliance job. | 
**uploadUrl** | **URI** | URL to which the user will upload their tweet or user IDs | 
**uploadExpiresAt** | **OffsetDateTime** | Expiration time of the upload URL | 
**downloadUrl** | **URI** | URL from which the user will retrieve their compliance results | 
**downloadExpiresAt** | **OffsetDateTime** | Expiration time of the download URL | 
**name** | **String** | User-provided name for a compliance job |  [optional]
**status** | **ComplianceJobStatus** |  | 



