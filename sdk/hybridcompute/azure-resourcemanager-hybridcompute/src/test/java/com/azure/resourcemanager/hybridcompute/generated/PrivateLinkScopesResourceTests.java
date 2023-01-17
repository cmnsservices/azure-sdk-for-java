// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkScopesResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkScopesResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkScopesResource model =
            BinaryData
                .fromString(
                    "{\"location\":\"pfhyhl\",\"tags\":{\"atuokthfuiu\":\"mopjmc\",\"zydagfuaxbezyiuo\":\"odsfcpkvxodpuozm\"},\"id\":\"ktwh\",\"name\":\"dxwzywqsmbsurexi\",\"type\":\"o\"}")
                .toObject(PrivateLinkScopesResource.class);
        Assertions.assertEquals("pfhyhl", model.location());
        Assertions.assertEquals("mopjmc", model.tags().get("atuokthfuiu"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkScopesResource model =
            new PrivateLinkScopesResource()
                .withLocation("pfhyhl")
                .withTags(mapOf("atuokthfuiu", "mopjmc", "zydagfuaxbezyiuo", "odsfcpkvxodpuozm"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkScopesResource.class);
        Assertions.assertEquals("pfhyhl", model.location());
        Assertions.assertEquals("mopjmc", model.tags().get("atuokthfuiu"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
