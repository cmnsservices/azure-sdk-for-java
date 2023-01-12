// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.models.Department;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of an enrollment account. */
@Fluent
public final class EnrollmentAccountProperties {
    /*
     * The name of the enrollment account.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * The cost center associated with the enrollment account.
     */
    @JsonProperty(value = "costCenter")
    private String costCenter;

    /*
     * The owner of the enrollment account.
     */
    @JsonProperty(value = "accountOwner")
    private String accountOwner;

    /*
     * The enrollment account owner email address.
     */
    @JsonProperty(value = "accountOwnerEmail")
    private String accountOwnerEmail;

    /*
     * The status of the enrollment account.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The start date of the enrollment account.
     */
    @JsonProperty(value = "startDate")
    private OffsetDateTime startDate;

    /*
     * The end date of the enrollment account.
     */
    @JsonProperty(value = "endDate")
    private OffsetDateTime endDate;

    /*
     * Associated department. By default this is not populated, unless it's specified in $expand.
     */
    @JsonProperty(value = "department")
    private Department department;

    /** Creates an instance of EnrollmentAccountProperties class. */
    public EnrollmentAccountProperties() {
    }

    /**
     * Get the accountName property: The name of the enrollment account.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The name of the enrollment account.
     *
     * @param accountName the accountName value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the costCenter property: The cost center associated with the enrollment account.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the costCenter property: The cost center associated with the enrollment account.
     *
     * @param costCenter the costCenter value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Get the accountOwner property: The owner of the enrollment account.
     *
     * @return the accountOwner value.
     */
    public String accountOwner() {
        return this.accountOwner;
    }

    /**
     * Set the accountOwner property: The owner of the enrollment account.
     *
     * @param accountOwner the accountOwner value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
        return this;
    }

    /**
     * Get the accountOwnerEmail property: The enrollment account owner email address.
     *
     * @return the accountOwnerEmail value.
     */
    public String accountOwnerEmail() {
        return this.accountOwnerEmail;
    }

    /**
     * Set the accountOwnerEmail property: The enrollment account owner email address.
     *
     * @param accountOwnerEmail the accountOwnerEmail value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withAccountOwnerEmail(String accountOwnerEmail) {
        this.accountOwnerEmail = accountOwnerEmail;
        return this;
    }

    /**
     * Get the status property: The status of the enrollment account.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the enrollment account.
     *
     * @param status the status value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startDate property: The start date of the enrollment account.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The start date of the enrollment account.
     *
     * @param startDate the startDate value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The end date of the enrollment account.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The end date of the enrollment account.
     *
     * @param endDate the endDate value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the department property: Associated department. By default this is not populated, unless it's specified in
     * $expand.
     *
     * @return the department value.
     */
    public Department department() {
        return this.department;
    }

    /**
     * Set the department property: Associated department. By default this is not populated, unless it's specified in
     * $expand.
     *
     * @param department the department value to set.
     * @return the EnrollmentAccountProperties object itself.
     */
    public EnrollmentAccountProperties withDepartment(Department department) {
        this.department = department;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (department() != null) {
            department().validate();
        }
    }
}
