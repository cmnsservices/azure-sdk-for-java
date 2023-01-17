// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Describes the basic properties for encoding the input video. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = Video.class)
@JsonTypeName("#Microsoft.Media.Video")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.H265Video", value = H265Video.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.Image", value = Image.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.H264Video", value = H264Video.class)
})
@Fluent
public class Video extends Codec {
    /*
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in
     * ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough
     * is set, where the KeyFrameInterval value will follow the input source setting.
     */
    @JsonProperty(value = "keyFrameInterval")
    private Duration keyFrameInterval;

    /*
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is
     * AutoSize
     */
    @JsonProperty(value = "stretchMode")
    private StretchMode stretchMode;

    /*
     * The Video Sync Mode
     */
    @JsonProperty(value = "syncMode")
    private VideoSyncMode syncMode;

    /** Creates an instance of Video class. */
    public Video() {
    }

    /**
     * Get the keyFrameInterval property: The distance between two key frames. The value should be non-zero in the range
     * [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is
     * ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source
     * setting.
     *
     * @return the keyFrameInterval value.
     */
    public Duration keyFrameInterval() {
        return this.keyFrameInterval;
    }

    /**
     * Set the keyFrameInterval property: The distance between two key frames. The value should be non-zero in the range
     * [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is
     * ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source
     * setting.
     *
     * @param keyFrameInterval the keyFrameInterval value to set.
     * @return the Video object itself.
     */
    public Video withKeyFrameInterval(Duration keyFrameInterval) {
        this.keyFrameInterval = keyFrameInterval;
        return this;
    }

    /**
     * Get the stretchMode property: The resizing mode - how the input video will be resized to fit the desired output
     * resolution(s). Default is AutoSize.
     *
     * @return the stretchMode value.
     */
    public StretchMode stretchMode() {
        return this.stretchMode;
    }

    /**
     * Set the stretchMode property: The resizing mode - how the input video will be resized to fit the desired output
     * resolution(s). Default is AutoSize.
     *
     * @param stretchMode the stretchMode value to set.
     * @return the Video object itself.
     */
    public Video withStretchMode(StretchMode stretchMode) {
        this.stretchMode = stretchMode;
        return this;
    }

    /**
     * Get the syncMode property: The Video Sync Mode.
     *
     * @return the syncMode value.
     */
    public VideoSyncMode syncMode() {
        return this.syncMode;
    }

    /**
     * Set the syncMode property: The Video Sync Mode.
     *
     * @param syncMode the syncMode value to set.
     * @return the Video object itself.
     */
    public Video withSyncMode(VideoSyncMode syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Video withLabel(String label) {
        super.withLabel(label);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
