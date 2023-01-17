// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.CopyVideo;
import org.junit.jupiter.api.Assertions;

public final class CopyVideoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyVideo model =
            BinaryData
                .fromString("{\"@odata.type\":\"#Microsoft.Media.CopyVideo\",\"label\":\"fvoow\"}")
                .toObject(CopyVideo.class);
        Assertions.assertEquals("fvoow", model.label());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyVideo model = new CopyVideo().withLabel("fvoow");
        model = BinaryData.fromObject(model).toObject(CopyVideo.class);
        Assertions.assertEquals("fvoow", model.label());
    }
}
