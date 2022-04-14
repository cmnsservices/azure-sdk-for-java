// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Mapping data flow. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MappingDataFlow")
@JsonFlatten
@Fluent
public class MappingDataFlow extends DataFlow {
    /*
     * List of sources in data flow.
     */
    @JsonProperty(value = "typeProperties.sources")
    private List<DataFlowSource> sources;

    /*
     * List of sinks in data flow.
     */
    @JsonProperty(value = "typeProperties.sinks")
    private List<DataFlowSink> sinks;

    /*
     * List of transformations in data flow.
     */
    @JsonProperty(value = "typeProperties.transformations")
    private List<Transformation> transformations;

    /*
     * DataFlow script.
     */
    @JsonProperty(value = "typeProperties.script")
    private String script;

    /*
     * Data flow script lines.
     */
    @JsonProperty(value = "typeProperties.scriptLines")
    private List<String> scriptLines;

    /**
     * Get the sources property: List of sources in data flow.
     *
     * @return the sources value.
     */
    public List<DataFlowSource> getSources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of sources in data flow.
     *
     * @param sources the sources value to set.
     * @return the MappingDataFlow object itself.
     */
    public MappingDataFlow setSources(List<DataFlowSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the sinks property: List of sinks in data flow.
     *
     * @return the sinks value.
     */
    public List<DataFlowSink> getSinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: List of sinks in data flow.
     *
     * @param sinks the sinks value to set.
     * @return the MappingDataFlow object itself.
     */
    public MappingDataFlow setSinks(List<DataFlowSink> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Get the transformations property: List of transformations in data flow.
     *
     * @return the transformations value.
     */
    public List<Transformation> getTransformations() {
        return this.transformations;
    }

    /**
     * Set the transformations property: List of transformations in data flow.
     *
     * @param transformations the transformations value to set.
     * @return the MappingDataFlow object itself.
     */
    public MappingDataFlow setTransformations(List<Transformation> transformations) {
        this.transformations = transformations;
        return this;
    }

    /**
     * Get the script property: DataFlow script.
     *
     * @return the script value.
     */
    public String getScript() {
        return this.script;
    }

    /**
     * Set the script property: DataFlow script.
     *
     * @param script the script value to set.
     * @return the MappingDataFlow object itself.
     */
    public MappingDataFlow setScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the scriptLines property: Data flow script lines.
     *
     * @return the scriptLines value.
     */
    public List<String> getScriptLines() {
        return this.scriptLines;
    }

    /**
     * Set the scriptLines property: Data flow script lines.
     *
     * @param scriptLines the scriptLines value to set.
     * @return the MappingDataFlow object itself.
     */
    public MappingDataFlow setScriptLines(List<String> scriptLines) {
        this.scriptLines = scriptLines;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MappingDataFlow setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MappingDataFlow setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MappingDataFlow setFolder(DataFlowFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
