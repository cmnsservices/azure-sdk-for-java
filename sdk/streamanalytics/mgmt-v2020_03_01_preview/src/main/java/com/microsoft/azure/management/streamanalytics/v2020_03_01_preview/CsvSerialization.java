/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes how data from an input is serialized or how data is serialized
 * when written to an output in CSV format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CsvSerialization.class)
@JsonTypeName("Csv")
@JsonFlatten
public class CsvSerialization extends Serialization {
    /**
     * Specifies the delimiter that will be used to separate comma-separated
     * value (CSV) records. See
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input
     * or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output
     * for a list of supported values. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.fieldDelimiter")
    private String fieldDelimiter;

    /**
     * Specifies the encoding of the incoming data in the case of input and the
     * encoding of outgoing data in the case of output. Required on PUT
     * (CreateOrReplace) requests. Possible values include: 'UTF8'.
     */
    @JsonProperty(value = "properties.encoding")
    private Encoding encoding;

    /**
     * Get specifies the delimiter that will be used to separate comma-separated value (CSV) records. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported values. Required on PUT (CreateOrReplace) requests.
     *
     * @return the fieldDelimiter value
     */
    public String fieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * Set specifies the delimiter that will be used to separate comma-separated value (CSV) records. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported values. Required on PUT (CreateOrReplace) requests.
     *
     * @param fieldDelimiter the fieldDelimiter value to set
     * @return the CsvSerialization object itself.
     */
    public CsvSerialization withFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
        return this;
    }

    /**
     * Get specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests. Possible values include: 'UTF8'.
     *
     * @return the encoding value
     */
    public Encoding encoding() {
        return this.encoding;
    }

    /**
     * Set specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests. Possible values include: 'UTF8'.
     *
     * @param encoding the encoding value to set
     * @return the CsvSerialization object itself.
     */
    public CsvSerialization withEncoding(Encoding encoding) {
        this.encoding = encoding;
        return this;
    }

}
