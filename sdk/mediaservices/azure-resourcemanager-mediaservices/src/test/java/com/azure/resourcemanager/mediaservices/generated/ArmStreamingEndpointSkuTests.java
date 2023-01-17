// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ArmStreamingEndpointSku;

public final class ArmStreamingEndpointSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmStreamingEndpointSku model =
            BinaryData.fromString("{\"name\":\"lmdjrkvfgbvfvpdb\"}").toObject(ArmStreamingEndpointSku.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmStreamingEndpointSku model = new ArmStreamingEndpointSku();
        model = BinaryData.fromObject(model).toObject(ArmStreamingEndpointSku.class);
    }
}
