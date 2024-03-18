package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;

public class OnePasswordPartnership {
    private ApiClient apiClient;
    public final AccountApi account;

    public OnePasswordPartnership() {
        this(null);
    }

    public OnePasswordPartnership(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
    }

}
