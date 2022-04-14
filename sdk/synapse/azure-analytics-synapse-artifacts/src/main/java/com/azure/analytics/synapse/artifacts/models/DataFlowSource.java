// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Transformation for data flow source. */
@Fluent
public final class DataFlowSource extends Transformation {
    /*
     * Schema linked service reference.
     */
    @JsonProperty(value = "schemaLinkedService")
    private LinkedServiceReference schemaLinkedService;

    /**
     * Get the schemaLinkedService property: Schema linked service reference.
     *
     * @return the schemaLinkedService value.
     */
    public LinkedServiceReference getSchemaLinkedService() {
        return this.schemaLinkedService;
    }

    /**
     * Set the schemaLinkedService property: Schema linked service reference.
     *
     * @param schemaLinkedService the schemaLinkedService value to set.
     * @return the DataFlowSource object itself.
     */
    public DataFlowSource setSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        this.schemaLinkedService = schemaLinkedService;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSource setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSource setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSource setDataset(DatasetReference dataset) {
        super.setDataset(dataset);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSource setLinkedService(LinkedServiceReference linkedService) {
        super.setLinkedService(linkedService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSource setFlowlet(DataFlowReference flowlet) {
        super.setFlowlet(flowlet);
        return this;
    }
}
