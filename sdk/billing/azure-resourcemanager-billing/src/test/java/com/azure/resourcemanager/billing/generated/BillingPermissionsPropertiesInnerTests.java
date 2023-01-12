// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.BillingPermissionsPropertiesInner;

public final class BillingPermissionsPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingPermissionsPropertiesInner model =
            BinaryData
                .fromString("{\"actions\":[\"cmgyud\"],\"notActions\":[\"lmoyrx\",\"wfudwpzntxhdzhl\"]}")
                .toObject(BillingPermissionsPropertiesInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingPermissionsPropertiesInner model = new BillingPermissionsPropertiesInner();
        model = BinaryData.fromObject(model).toObject(BillingPermissionsPropertiesInner.class);
    }
}
