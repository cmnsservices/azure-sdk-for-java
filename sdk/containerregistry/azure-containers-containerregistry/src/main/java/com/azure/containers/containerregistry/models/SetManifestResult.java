// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.containers.containerregistry.models;

import com.azure.containers.containerregistry.implementation.ConstructorAccessors;

/**
 * The result from setting a manifest.
 */
public final class SetManifestResult {
    static {
        ConstructorAccessors.setSetManifestResultAccessor(SetManifestResult::new);
    }
    private final String digest;

    private SetManifestResult(String digest) {
        this.digest = digest;
    }

    /**
     * Get manifest digest.
     * @return The digest.
     */
    public String getDigest() {
        return this.digest;
    }
}
