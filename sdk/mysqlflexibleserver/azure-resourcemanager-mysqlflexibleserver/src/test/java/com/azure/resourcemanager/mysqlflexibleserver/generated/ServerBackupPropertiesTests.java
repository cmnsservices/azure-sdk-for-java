// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerBackupProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ServerBackupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerBackupProperties model =
            BinaryData
                .fromString(
                    "{\"backupType\":\"bejhphoycmsxa\",\"completedTime\":\"2021-05-13T08:05:39Z\",\"source\":\"xbmtqioqjz\"}")
                .toObject(ServerBackupProperties.class);
        Assertions.assertEquals("bejhphoycmsxa", model.backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T08:05:39Z"), model.completedTime());
        Assertions.assertEquals("xbmtqioqjz", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerBackupProperties model =
            new ServerBackupProperties()
                .withBackupType("bejhphoycmsxa")
                .withCompletedTime(OffsetDateTime.parse("2021-05-13T08:05:39Z"))
                .withSource("xbmtqioqjz");
        model = BinaryData.fromObject(model).toObject(ServerBackupProperties.class);
        Assertions.assertEquals("bejhphoycmsxa", model.backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-13T08:05:39Z"), model.completedTime());
        Assertions.assertEquals("xbmtqioqjz", model.source());
    }
}
