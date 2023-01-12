// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The property of reservation sku object. */
@Immutable
public final class ReservationSkuProperty {
    /*
     * The name of the reservation sku.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of ReservationSkuProperty class. */
    public ReservationSkuProperty() {
    }

    /**
     * Get the name property: The name of the reservation sku.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
