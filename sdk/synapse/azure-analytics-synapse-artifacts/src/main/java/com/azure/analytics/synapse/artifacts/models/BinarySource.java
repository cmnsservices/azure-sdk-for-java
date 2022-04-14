// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Binary source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BinarySource")
@Fluent
public final class BinarySource extends CopySource {
    /*
     * Binary store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /*
     * Binary format settings.
     */
    @JsonProperty(value = "formatSettings")
    private BinaryReadSettings formatSettings;

    /**
     * Get the storeSettings property: Binary store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Binary store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource setStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Binary format settings.
     *
     * @return the formatSettings value.
     */
    public BinaryReadSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Binary format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource setFormatSettings(BinaryReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
