

# CreatePartnerAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerAccountUid** | **String** | A unique identifier for the end user&#39;s account to be provisioned. It can be up to 80 chars long and consist of alphanumeric characters and hyphens. |  |
|**accountType** | **String** | Specifies the type of 1Password account plan to provision - &#39;I&#39; for Individual, or &#39;F&#39; for family. |  |
|**domain** | **String** | Specifies the 1Password domain to provision the account for. For testing it can be one of &#39;b5test.com&#39;, &#39;b5test.ca&#39;, or &#39;b5test.eu&#39;. For production, it can be one of &#39;1password.com&#39;, &#39;1password.ca&#39;, or &#39;1password.eu&#39;. Note that domains can only be used after promotions have been created for a given partnership in the specific domain. |  |
|**endsAt** | **OffsetDateTime** | Specifies when the 1Password account will be frozen, formatted in RFC-3339. |  [optional] |



