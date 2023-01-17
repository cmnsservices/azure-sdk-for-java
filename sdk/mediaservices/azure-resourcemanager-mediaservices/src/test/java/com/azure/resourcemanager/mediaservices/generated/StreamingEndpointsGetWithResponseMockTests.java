// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpoint;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StreamingEndpointsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"description\":\"lvyjtcvuwkas\",\"scaleUnits\":995011489,\"availabilitySetName\":\"esfuught\",\"accessControl\":{},\"maxCacheAge\":2167381976519679602,\"customHostNames\":[\"gtuhxuicbu\",\"wmrswnjlxuzrh\"],\"hostName\":\"usxjbaqehg\",\"cdnEnabled\":true,\"cdnProvider\":\"zjqatucoig\",\"cdnProfile\":\"xncnwfe\",\"provisioningState\":\"nwgfmxjgcgbjbgd\",\"resourceState\":\"Starting\",\"crossSiteAccessPolicies\":{\"clientAccessPolicy\":\"y\",\"crossDomainPolicy\":\"aquflqbctqha\"},\"freeTrialEndTime\":\"2021-06-19T04:47:09Z\",\"created\":\"2021-09-20T20:27:03Z\",\"lastModified\":\"2021-08-07T06:35:11Z\"},\"sku\":{\"name\":\"qy\",\"capacity\":1179923211},\"location\":\"zi\",\"tags\":{\"eg\":\"xdfzantkw\",\"uooqjagmdit\":\"amlbnseqacjjvpil\",\"kjbsah\":\"ueio\",\"oebn\":\"tdtpdelqacslmo\"},\"id\":\"xofvcjk\",\"name\":\"dirazf\",\"type\":\"xejw\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        StreamingEndpoint response =
            manager
                .streamingEndpoints()
                .getWithResponse("tjxtxr", "cq", "jvidttge", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("zi", response.location());
        Assertions.assertEquals("xdfzantkw", response.tags().get("eg"));
        Assertions.assertEquals(1179923211, response.sku().capacity());
        Assertions.assertEquals("lvyjtcvuwkas", response.description());
        Assertions.assertEquals(995011489, response.scaleUnits());
        Assertions.assertEquals("esfuught", response.availabilitySetName());
        Assertions.assertEquals(2167381976519679602L, response.maxCacheAge());
        Assertions.assertEquals("gtuhxuicbu", response.customHostNames().get(0));
        Assertions.assertEquals(true, response.cdnEnabled());
        Assertions.assertEquals("zjqatucoig", response.cdnProvider());
        Assertions.assertEquals("xncnwfe", response.cdnProfile());
        Assertions.assertEquals("y", response.crossSiteAccessPolicies().clientAccessPolicy());
        Assertions.assertEquals("aquflqbctqha", response.crossSiteAccessPolicies().crossDomainPolicy());
    }
}
