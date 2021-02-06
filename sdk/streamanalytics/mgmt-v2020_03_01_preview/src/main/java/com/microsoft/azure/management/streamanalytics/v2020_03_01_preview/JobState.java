/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for JobState.
 */
public final class JobState extends ExpandableStringEnum<JobState> {
    /** Static value Created for JobState. */
    public static final JobState CREATED = fromString("Created");

    /** Static value Starting for JobState. */
    public static final JobState STARTING = fromString("Starting");

    /** Static value Running for JobState. */
    public static final JobState RUNNING = fromString("Running");

    /** Static value Stopping for JobState. */
    public static final JobState STOPPING = fromString("Stopping");

    /** Static value Stopped for JobState. */
    public static final JobState STOPPED = fromString("Stopped");

    /** Static value Deleting for JobState. */
    public static final JobState DELETING = fromString("Deleting");

    /** Static value Failed for JobState. */
    public static final JobState FAILED = fromString("Failed");

    /** Static value Degraded for JobState. */
    public static final JobState DEGRADED = fromString("Degraded");

    /** Static value Restarting for JobState. */
    public static final JobState RESTARTING = fromString("Restarting");

    /** Static value Scaling for JobState. */
    public static final JobState SCALING = fromString("Scaling");

    /**
     * Creates or finds a JobState from its string representation.
     * @param name a name to look for
     * @return the corresponding JobState
     */
    @JsonCreator
    public static JobState fromString(String name) {
        return fromString(name, JobState.class);
    }

    /**
     * @return known JobState values
     */
    public static Collection<JobState> values() {
        return values(JobState.class);
    }
}
