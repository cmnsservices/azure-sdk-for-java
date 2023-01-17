// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a hybrid machine Update. */
@Fluent
public final class MachineUpdate extends ResourceUpdate {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Hybrid Compute Machine properties
     */
    @JsonProperty(value = "properties")
    private MachineUpdateProperties properties;

    /** Creates an instance of MachineUpdate class. */
    public MachineUpdate() {
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the MachineUpdate object itself.
     */
    public MachineUpdate withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Hybrid Compute Machine properties.
     *
     * @return the properties value.
     */
    public MachineUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Hybrid Compute Machine properties.
     *
     * @param properties the properties value to set.
     * @return the MachineUpdate object itself.
     */
    public MachineUpdate withProperties(MachineUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MachineUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
