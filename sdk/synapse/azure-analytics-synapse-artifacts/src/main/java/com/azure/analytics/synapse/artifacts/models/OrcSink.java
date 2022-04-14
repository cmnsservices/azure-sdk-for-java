// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity ORC sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OrcSink")
@Fluent
public final class OrcSink extends CopySink {
    /*
     * ORC store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /*
     * ORC format settings.
     */
    @JsonProperty(value = "formatSettings")
    private OrcWriteSettings formatSettings;

    /**
     * Get the storeSettings property: ORC store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: ORC store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the OrcSink object itself.
     */
    public OrcSink setStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: ORC format settings.
     *
     * @return the formatSettings value.
     */
    public OrcWriteSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: ORC format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the OrcSink object itself.
     */
    public OrcSink setFormatSettings(OrcWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
