// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.ReservationPropertyUtilization;
import com.azure.resourcemanager.billing.models.ReservationUtilizationAggregates;
import java.util.Arrays;

public final class ReservationPropertyUtilizationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationPropertyUtilization model =
            BinaryData
                .fromString(
                    "{\"trend\":\"ckh\",\"aggregates\":[{\"grain\":5.347806,\"grainUnit\":\"ffwafq\",\"value\":61.13735,\"valueUnit\":\"aspavehhr\"}]}")
                .toObject(ReservationPropertyUtilization.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationPropertyUtilization model =
            new ReservationPropertyUtilization().withAggregates(Arrays.asList(new ReservationUtilizationAggregates()));
        model = BinaryData.fromObject(model).toObject(ReservationPropertyUtilization.class);
    }
}
