// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for EnrollmentAccounts Get. */
public final class EnrollmentAccountsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/preview/2018-03-01-preview/examples/EnrollmentAccountsGet.json
     */
    /**
     * Sample code: EnrollmentAccountsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void enrollmentAccountsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .enrollmentAccounts()
            .getWithResponse("e1bf1c8c-5ac6-44a0-bdcd-aa7c1cf60556", com.azure.core.util.Context.NONE);
    }
}
