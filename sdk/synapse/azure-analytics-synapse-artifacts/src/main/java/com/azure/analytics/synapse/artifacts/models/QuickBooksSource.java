// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity QuickBooks server source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("QuickBooksSource")
@Fluent
public final class QuickBooksSource extends TabularSource {
    /*
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @param query the query value to set.
     * @return the QuickBooksSource object itself.
     */
    public QuickBooksSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuickBooksSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuickBooksSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuickBooksSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuickBooksSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public QuickBooksSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
