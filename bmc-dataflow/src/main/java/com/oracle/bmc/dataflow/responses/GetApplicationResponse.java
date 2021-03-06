/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetApplicationResponse {

    /**
     * For optimistic concurrency control.
     * See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Application instance.
     */
    private Application application;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetApplicationResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            application(o.getApplication());

            return this;
        }
    }
}
