// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The external security solution properties for ATA solutions. */
@Fluent
public final class AtaSolutionProperties extends ExternalSecuritySolutionProperties {
    /*
     * The lastEventReceived property.
     */
    @JsonProperty(value = "lastEventReceived")
    private String lastEventReceived;

    /** Creates an instance of AtaSolutionProperties class. */
    public AtaSolutionProperties() {
    }

    /**
     * Get the lastEventReceived property: The lastEventReceived property.
     *
     * @return the lastEventReceived value.
     */
    public String lastEventReceived() {
        return this.lastEventReceived;
    }

    /**
     * Set the lastEventReceived property: The lastEventReceived property.
     *
     * @param lastEventReceived the lastEventReceived value to set.
     * @return the AtaSolutionProperties object itself.
     */
    public AtaSolutionProperties withLastEventReceived(String lastEventReceived) {
        this.lastEventReceived = lastEventReceived;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AtaSolutionProperties withDeviceVendor(String deviceVendor) {
        super.withDeviceVendor(deviceVendor);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AtaSolutionProperties withDeviceType(String deviceType) {
        super.withDeviceType(deviceType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AtaSolutionProperties withWorkspace(ConnectedWorkspace workspace) {
        super.withWorkspace(workspace);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
