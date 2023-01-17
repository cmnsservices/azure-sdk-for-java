// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.resourcemanager.mediaservices.models.AssetContainerPermission;
import com.azure.resourcemanager.mediaservices.models.ListContainerSasInput;
import java.time.OffsetDateTime;

/** Samples for Assets ListContainerSas. */
public final class AssetsListContainerSasSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/assets-list-sas-urls.json
     */
    /**
     * Sample code: List Asset SAS URLs.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listAssetSASURLs(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .assets()
            .listContainerSasWithResponse(
                "contoso",
                "contosomedia",
                "ClimbingMountBaker",
                new ListContainerSasInput()
                    .withPermissions(AssetContainerPermission.READ_WRITE)
                    .withExpiryTime(OffsetDateTime.parse("2018-01-01T10:00:00.007Z")),
                com.azure.core.util.Context.NONE);
    }
}
