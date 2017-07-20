/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The listener's configuration.
 * For more information on backend set configuration, see
 * [Managing Load Balancer Listeners](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managinglisteners.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Listener.Builder.class)
public class Listener {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public Listener build() {
            return new Listener(defaultBackendSetName, name, port, protocol, sslConfiguration);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Listener o) {
            return defaultBackendSetName(o.getDefaultBackendSetName())
                    .name(o.getName())
                    .port(o.getPort())
                    .protocol(o.getProtocol())
                    .sslConfiguration(o.getSslConfiguration());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the associated backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String defaultBackendSetName;

    /**
     * A friendly name for the listener. It must be unique and it cannot be changed.
     * <p>
     * Example: `My listener`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;

    /**
     * The communication port for the listener.
     * <p>
     * Example: `80`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer port;

    /**
     * The protocol on which the listener accepts connection requests.
     * To get a list of valid protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols}
     * operation.
     * <p>
     * Example: `HTTP`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfiguration sslConfiguration;
}
