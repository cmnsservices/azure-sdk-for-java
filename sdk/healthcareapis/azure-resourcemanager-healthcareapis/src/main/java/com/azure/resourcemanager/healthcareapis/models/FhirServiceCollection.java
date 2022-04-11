// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.healthcareapis.fluent.models.FhirServiceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of Fhir services. */
@Fluent
public final class FhirServiceCollection {
    /*
     * The link used to get the next page of Fhir Services.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of Fhir Services.
     */
    @JsonProperty(value = "value")
    private List<FhirServiceInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of Fhir Services.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of Fhir Services.
     *
     * @param nextLink the nextLink value to set.
     * @return the FhirServiceCollection object itself.
     */
    public FhirServiceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of Fhir Services.
     *
     * @return the value value.
     */
    public List<FhirServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Fhir Services.
     *
     * @param value the value value to set.
     * @return the FhirServiceCollection object itself.
     */
    public FhirServiceCollection withValue(List<FhirServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
