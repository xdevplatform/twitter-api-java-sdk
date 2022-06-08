

# CreateComplianceJobRequest

A request to create a new batch compliance job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | User-provided name for a compliance job. |  [optional] |
|**resumable** | **Boolean** | If true, this endpoint will return a pre-signed URL with resumable uploads enabled. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of compliance job to list. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TWEETS | &quot;tweets&quot; |
| USERS | &quot;users&quot; |



