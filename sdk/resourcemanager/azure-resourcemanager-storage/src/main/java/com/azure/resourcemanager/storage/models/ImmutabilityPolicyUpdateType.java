// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImmutabilityPolicyUpdateType. */
public final class ImmutabilityPolicyUpdateType extends ExpandableStringEnum<ImmutabilityPolicyUpdateType> {
    /** Static value put for ImmutabilityPolicyUpdateType. */
    public static final ImmutabilityPolicyUpdateType PUT = fromString("put");

    /** Static value lock for ImmutabilityPolicyUpdateType. */
    public static final ImmutabilityPolicyUpdateType LOCK = fromString("lock");

    /** Static value extend for ImmutabilityPolicyUpdateType. */
    public static final ImmutabilityPolicyUpdateType EXTEND = fromString("extend");

    /**
     * Creates or finds a ImmutabilityPolicyUpdateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImmutabilityPolicyUpdateType.
     */
    @JsonCreator
    public static ImmutabilityPolicyUpdateType fromString(String name) {
        return fromString(name, ImmutabilityPolicyUpdateType.class);
    }

    /**
     * Gets known ImmutabilityPolicyUpdateType values.
     *
     * @return known ImmutabilityPolicyUpdateType values.
     */
    public static Collection<ImmutabilityPolicyUpdateType> values() {
        return values(ImmutabilityPolicyUpdateType.class);
    }
}
