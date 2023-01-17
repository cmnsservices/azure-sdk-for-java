// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/** Samples for PrivateLinkScopes ListByResourceGroup. */
public final class PrivateLinkScopesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2021-03-25-preview/examples/PrivateLinkScopesListByResourceGroup.json
     */
    /**
     * Sample code: PrivateLinkScopeListByResourceGroup.
     *
     * @param manager Entry point to HybridComputeManager.
     */
    public static void privateLinkScopeListByResourceGroup(
        com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.privateLinkScopes().listByResourceGroup("my-resource-group", com.azure.core.util.Context.NONE);
    }
}
