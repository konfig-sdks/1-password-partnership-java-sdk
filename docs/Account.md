

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerAccountUid** | **String** | The unique identifier for the end user&#39;s account. It can be up to 80 chars long and consist of alphanumeric characters and hyphens. |  [optional] |
|**accountType** | **String** | The current type of the 1Password account - &#39;I&#39; for Individual, or &#39;F&#39; for family. |  [optional] |
|**activationToken** | **String** | The activation token is a coupon code to link a new or existing 1Password account to a partnership promotion. For example, it can be used for 1Password account creation at https://start.{{1password_domain}}/partnership/redeem?t&#x3D;{{account_type}}&amp;c&#x3D;{{activation_token}} during end-user signup. |  [optional] |
|**domain** | **String** | The 1Password domain for which the account was provisioned for. For testing domains, it can be one of &#39;b5test.com&#39;, &#39;b5test.ca&#39;, or &#39;b5test.eu&#39;. For production, it can be one of &#39;1password.com&#39;, &#39;1password.ca&#39;, or &#39;1password.eu&#39;. |  [optional] |
|**status** | **String** | The provisioning status of the partner account. It can be either &#39;entitled&#39; for accounts that have been initialized but have not completed 1Password signup, or &#39;provisioned&#39; for accounts that have completed the 1Password signup process. |  [optional] |
|**deployedMembers** | **Integer** | The number of provisioned users for the 1Password account. |  [optional] |
|**createdAt** | **OffsetDateTime** | The timestamp of when the partnership account was created, formatted in RFC-3339. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The timestamp of when the partner account was last updated, formatted in RFC-3339. This field will be updated during account status changes. |  [optional] |
|**endsAt** | **OffsetDateTime** | The timestamp of when the partner account will be frozen, formatted in RFC-3339. |  [optional] |



