// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentWebTestLocationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the list of web test locations available to an Application Insights Component. */
@Fluent
public final class ApplicationInsightsWebTestLocationsListResult {
    /*
     * List of web test locations.
     */
    @JsonProperty(value = "value", required = true)
    private List<ApplicationInsightsComponentWebTestLocationInner> value;

    /**
     * Get the value property: List of web test locations.
     *
     * @return the value value.
     */
    public List<ApplicationInsightsComponentWebTestLocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of web test locations.
     *
     * @param value the value value to set.
     * @return the ApplicationInsightsWebTestLocationsListResult object itself.
     */
    public ApplicationInsightsWebTestLocationsListResult withValue(
        List<ApplicationInsightsComponentWebTestLocationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ApplicationInsightsWebTestLocationsListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationInsightsWebTestLocationsListResult.class);
}
