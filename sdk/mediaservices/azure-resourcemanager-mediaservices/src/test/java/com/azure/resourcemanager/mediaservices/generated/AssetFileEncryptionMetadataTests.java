// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.AssetFileEncryptionMetadata;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AssetFileEncryptionMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssetFileEncryptionMetadata model =
            BinaryData
                .fromString(
                    "{\"initializationVector\":\"hmgkbrpyy\",\"assetFileName\":\"ibnuqqkpik\",\"assetFileId\":\"3c4ccbd1-1b62-414a-af01-184e1c622094\"}")
                .toObject(AssetFileEncryptionMetadata.class);
        Assertions.assertEquals("hmgkbrpyy", model.initializationVector());
        Assertions.assertEquals("ibnuqqkpik", model.assetFileName());
        Assertions.assertEquals(UUID.fromString("3c4ccbd1-1b62-414a-af01-184e1c622094"), model.assetFileId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssetFileEncryptionMetadata model =
            new AssetFileEncryptionMetadata()
                .withInitializationVector("hmgkbrpyy")
                .withAssetFileName("ibnuqqkpik")
                .withAssetFileId(UUID.fromString("3c4ccbd1-1b62-414a-af01-184e1c622094"));
        model = BinaryData.fromObject(model).toObject(AssetFileEncryptionMetadata.class);
        Assertions.assertEquals("hmgkbrpyy", model.initializationVector());
        Assertions.assertEquals("ibnuqqkpik", model.assetFileName());
        Assertions.assertEquals(UUID.fromString("3c4ccbd1-1b62-414a-af01-184e1c622094"), model.assetFileId());
    }
}
