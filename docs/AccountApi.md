# AccountApi

All URIs are relative to *https://billing.b5test.eu*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beginProvisioningProcess**](AccountApi.md#beginProvisioningProcess) | **POST** /api/v1/partners/accounts |  |
| [**getByUid**](AccountApi.md#getByUid) | **GET** /api/v1/partners/accounts/{customer_account_uid} |  |
| [**removeFromPartnership**](AccountApi.md#removeFromPartnership) | **DELETE** /api/v1/partners/accounts/{customer_account_uid} |  |
| [**updateEndsAtByUid**](AccountApi.md#updateEndsAtByUid) | **PATCH** /api/v1/partners/accounts/{customer_account_uid} |  |


<a name="beginProvisioningProcess"></a>
# **beginProvisioningProcess**
> Account beginProvisioningProcess(createPartnerAccountRequest).execute();



Begins provisioning process for a new partner associated 1Password account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordPartnership;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://billing.b5test.eu";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    OnePasswordPartnership client = new OnePasswordPartnership(configuration);
    String customerAccountUid = "customerAccountUid_example"; // A unique identifier for the end user's account to be provisioned. It can be up to 80 chars long and consist of alphanumeric characters and hyphens.
    String accountType = "accountType_example"; // Specifies the type of 1Password account plan to provision - 'I' for Individual, or 'F' for family.
    String domain = "domain_example"; // Specifies the 1Password domain to provision the account for. For testing it can be one of 'b5test.com', 'b5test.ca', or 'b5test.eu'. For production, it can be one of '1password.com', '1password.ca', or '1password.eu'. Note that domains can only be used after promotions have been created for a given partnership in the specific domain.
    OffsetDateTime endsAt = OffsetDateTime.now(); // Specifies when the 1Password account will be frozen, formatted in RFC-3339.
    try {
      Account result = client
              .account
              .beginProvisioningProcess(customerAccountUid, accountType, domain)
              .endsAt(endsAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerAccountUid());
      System.out.println(result.getAccountType());
      System.out.println(result.getActivationToken());
      System.out.println(result.getDomain());
      System.out.println(result.getStatus());
      System.out.println(result.getDeployedMembers());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getEndsAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#beginProvisioningProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Account> response = client
              .account
              .beginProvisioningProcess(customerAccountUid, accountType, domain)
              .endsAt(endsAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#beginProvisioningProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createPartnerAccountRequest** | [**CreatePartnerAccountRequest**](CreatePartnerAccountRequest.md)| Request to initialize a partner account. | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An Account object is returned upon successful initialization of a partner account. |  * location - Location of the newly created resource. <br>  |

<a name="getByUid"></a>
# **getByUid**
> Account getByUid(customerAccountUid).execute();



Returns an account based on an UID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordPartnership;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://billing.b5test.eu";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    OnePasswordPartnership client = new OnePasswordPartnership(configuration);
    String customerAccountUid = "customerAccountUid_example"; // Unique ID of an account to retrieve.
    try {
      Account result = client
              .account
              .getByUid(customerAccountUid)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerAccountUid());
      System.out.println(result.getAccountType());
      System.out.println(result.getActivationToken());
      System.out.println(result.getDomain());
      System.out.println(result.getStatus());
      System.out.println(result.getDeployedMembers());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getEndsAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getByUid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Account> response = client
              .account
              .getByUid(customerAccountUid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getByUid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerAccountUid** | **String**| Unique ID of an account to retrieve. | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Account object is returned upon successful retrieval of a partner account. |  -  |

<a name="removeFromPartnership"></a>
# **removeFromPartnership**
> removeFromPartnership(customerAccountUid).execute();



Removes an account from the partnership domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordPartnership;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://billing.b5test.eu";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    OnePasswordPartnership client = new OnePasswordPartnership(configuration);
    String customerAccountUid = "customerAccountUid_example"; // Unique ID of partner_account to delete.
    try {
      client
              .account
              .removeFromPartnership(customerAccountUid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#removeFromPartnership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .removeFromPartnership(customerAccountUid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#removeFromPartnership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerAccountUid** | **String**| Unique ID of partner_account to delete. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned upon successful deactivation of a partnership account. |  -  |

<a name="updateEndsAtByUid"></a>
# **updateEndsAtByUid**
> Account updateEndsAtByUid(customerAccountUid).updatePartnerAccountRequest(updatePartnerAccountRequest).execute();



Updates the ends_at attribute of an account based on an UID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OnePasswordPartnership;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://billing.b5test.eu";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    OnePasswordPartnership client = new OnePasswordPartnership(configuration);
    OffsetDateTime endsAt = OffsetDateTime.now(); // Specifies when the 1Password account will be frozen, formatted in RFC-3339.
    String customerAccountUid = "customerAccountUid_example"; // Unique ID of partner_account to update.
    try {
      Account result = client
              .account
              .updateEndsAtByUid(endsAt, customerAccountUid)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomerAccountUid());
      System.out.println(result.getAccountType());
      System.out.println(result.getActivationToken());
      System.out.println(result.getDomain());
      System.out.println(result.getStatus());
      System.out.println(result.getDeployedMembers());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getEndsAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateEndsAtByUid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Account> response = client
              .account
              .updateEndsAtByUid(endsAt, customerAccountUid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateEndsAtByUid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerAccountUid** | **String**| Unique ID of partner_account to update. | |
| **updatePartnerAccountRequest** | [**UpdatePartnerAccountRequest**](UpdatePartnerAccountRequest.md)| Request to update the ends_at attribute of a partner account. | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Account object is returned upon successful update of a partner account. |  -  |

