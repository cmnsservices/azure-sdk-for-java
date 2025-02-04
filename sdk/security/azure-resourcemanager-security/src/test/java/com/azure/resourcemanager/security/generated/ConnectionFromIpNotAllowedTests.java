// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectionFromIpNotAllowed;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConnectionFromIpNotAllowedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionFromIpNotAllowed model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"ConnectionFromIpNotAllowed\",\"allowlistValues\":[\"lubses\"],\"valueType\":\"IpCidr\",\"displayName\":\"artr\",\"description\":\"nlp\",\"isEnabled\":true}")
                .toObject(ConnectionFromIpNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("lubses", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionFromIpNotAllowed model =
            new ConnectionFromIpNotAllowed().withIsEnabled(true).withAllowlistValues(Arrays.asList("lubses"));
        model = BinaryData.fromObject(model).toObject(ConnectionFromIpNotAllowed.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("lubses", model.allowlistValues().get(0));
    }
}
