// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;

/** Samples for Certificates ListByIotHub. */
public final class CertificatesListByIotHubSamples {
    /**
     * Sample code: Certificates_ListByIotHub.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void certificatesListByIotHub(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager.certificates().listByIotHubWithResponse("myResourceGroup", "testhub", Context.NONE);
    }
}
