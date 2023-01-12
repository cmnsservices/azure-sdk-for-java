// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role assignment. */
@Fluent
public final class BillingRoleAssignmentInner extends ProxyResource {
    /*
     * The properties of the role assignment.
     */
    @JsonProperty(value = "properties")
    private BillingRoleAssignmentProperties innerProperties;

    /** Creates an instance of BillingRoleAssignmentInner class. */
    public BillingRoleAssignmentInner() {
    }

    /**
     * Get the innerProperties property: The properties of the role assignment.
     *
     * @return the innerProperties value.
     */
    private BillingRoleAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the createdOn property: The date the role assignment was created.
     *
     * @return the createdOn value.
     */
    public String createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the createdByPrincipalTenantId property: The tenant Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalTenantId value.
     */
    public String createdByPrincipalTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().createdByPrincipalTenantId();
    }

    /**
     * Get the createdByPrincipalId property: The principal Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalId value.
     */
    public String createdByPrincipalId() {
        return this.innerProperties() == null ? null : this.innerProperties().createdByPrincipalId();
    }

    /**
     * Get the createdByUserEmailAddress property: The email address of the user who created the role assignment.
     *
     * @return the createdByUserEmailAddress value.
     */
    public String createdByUserEmailAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().createdByUserEmailAddress();
    }

    /**
     * Get the principalId property: The principal id of the user to whom the role was assigned.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal id of the user to whom the role was assigned.
     *
     * @param principalId the principalId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingRoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the principalTenantId property: The principal tenant id of the user to whom the role was assigned.
     *
     * @return the principalTenantId value.
     */
    public String principalTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalTenantId();
    }

    /**
     * Set the principalTenantId property: The principal tenant id of the user to whom the role was assigned.
     *
     * @param principalTenantId the principalTenantId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withPrincipalTenantId(String principalTenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingRoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalTenantId(principalTenantId);
        return this;
    }

    /**
     * Get the roleDefinitionId property: The ID of the role definition.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The ID of the role definition.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingRoleAssignmentProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the scope property: The scope at which the role was assigned.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the userAuthenticationType property: The authentication type.
     *
     * @return the userAuthenticationType value.
     */
    public String userAuthenticationType() {
        return this.innerProperties() == null ? null : this.innerProperties().userAuthenticationType();
    }

    /**
     * Set the userAuthenticationType property: The authentication type.
     *
     * @param userAuthenticationType the userAuthenticationType value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withUserAuthenticationType(String userAuthenticationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingRoleAssignmentProperties();
        }
        this.innerProperties().withUserAuthenticationType(userAuthenticationType);
        return this;
    }

    /**
     * Get the userEmailAddress property: The email address of the user.
     *
     * @return the userEmailAddress value.
     */
    public String userEmailAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().userEmailAddress();
    }

    /**
     * Set the userEmailAddress property: The email address of the user.
     *
     * @param userEmailAddress the userEmailAddress value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withUserEmailAddress(String userEmailAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingRoleAssignmentProperties();
        }
        this.innerProperties().withUserEmailAddress(userEmailAddress);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
