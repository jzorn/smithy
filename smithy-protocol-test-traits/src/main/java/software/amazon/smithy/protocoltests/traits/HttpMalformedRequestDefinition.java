/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.smithy.protocoltests.traits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import software.amazon.smithy.model.node.ArrayNode;
import software.amazon.smithy.model.node.Node;
import software.amazon.smithy.model.node.ObjectNode;
import software.amazon.smithy.model.node.StringNode;
import software.amazon.smithy.model.node.ToNode;
import software.amazon.smithy.utils.ListUtils;
import software.amazon.smithy.utils.MapUtils;
import software.amazon.smithy.utils.SmithyBuilder;
import software.amazon.smithy.utils.SmithyUnstableApi;
import software.amazon.smithy.utils.ToSmithyBuilder;

/**
 * Defines a request to be used by an HttpMalformedRequest test case.
 */
@SmithyUnstableApi
public final class HttpMalformedRequestDefinition implements ToNode, ToSmithyBuilder<HttpMalformedRequestDefinition> {

    private static final String BODY = "body";
    private static final String HEADERS = "headers";
    private static final String HOST = "host";
    private static final String METHOD = "method";
    private static final String QUERY_PARAMS = "queryParams";
    private static final String URI = "uri";

    private final String body;
    private final Map<String, String> headers;
    private final String host;
    private final String method;
    private final List<String> queryParams;
    private final String uri;

    private HttpMalformedRequestDefinition(Builder builder) {
        body = builder.body;
        host = builder.host;
        headers = MapUtils.copyOf(builder.headers);
        method = SmithyBuilder.requiredState(METHOD, builder.method);
        queryParams = ListUtils.copyOf(builder.queryParams);
        uri = builder.uri;
    }

    public Optional<String> getBody() {
        return Optional.ofNullable(body);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(host);
    }

    public String getMethod() {
        return method;
    }

    public List<String> getQueryParams() {
        return queryParams;
    }

    public Optional<String> getUri() {
        return Optional.ofNullable(uri);
    }

    public static HttpMalformedRequestDefinition fromNode(Node node) {
        HttpMalformedRequestDefinition.Builder builder = builder();
        ObjectNode o = node.expectObjectNode();
        o.getStringMember(BODY).map(StringNode::getValue).ifPresent(builder::body);
        o.getObjectMember(HEADERS).ifPresent(headers -> {
            headers.getStringMap().forEach((k, v) -> {
                builder.putHeader(k, v.expectStringNode().getValue());
            });
        });
        o.getStringMember(HOST).ifPresent(stringNode -> builder.host(stringNode.getValue()));
        builder.method(o.expectStringMember(METHOD).getValue());
        o.getStringMember(URI).map(StringNode::getValue).ifPresent(builder::uri);
        o.getArrayMember(QUERY_PARAMS).ifPresent(queryParams -> {
            builder.queryParams(queryParams.getElementsAs(StringNode::getValue));
        });
        return builder.build();
    }

    @Override
    public Node toNode() {
        return Node.objectNodeBuilder()
                .withOptionalMember(BODY, getBody().map(Node::from))
                .withOptionalMember(HEADERS,
                        headers.isEmpty() ? Optional.empty() : Optional.of(ObjectNode.fromStringMap(getHeaders())))
                .withOptionalMember(HOST, getHost().map(StringNode::from))
                .withMember(METHOD, getMethod())
                .withOptionalMember(URI, getUri().map(Node::from))
                .withOptionalMember(QUERY_PARAMS,
                        queryParams.isEmpty() ? Optional.empty() : Optional.of(ArrayNode.fromStrings(getQueryParams())))
                .build();
    }

    @Override
    public Builder toBuilder() {
        Builder builder = builder()
                .headers(getHeaders())
                .method(getMethod())
                .queryParams(getQueryParams());
        getBody().ifPresent(builder::body);
        getHost().ifPresent(builder::host);
        getUri().ifPresent(builder::uri);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder used to create a HttpRequestTestsTrait.
     */
    public static final class Builder implements SmithyBuilder<HttpMalformedRequestDefinition> {

        private String body;
        private String host;
        private final Map<String, String> headers = new HashMap<>();
        private String method;
        private final List<String> queryParams = new ArrayList<>();
        private String uri;

        private Builder() {}

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder headers(Map<String, String> headers) {
            this.headers.clear();
            this.headers.putAll(headers);
            return this;
        }

        public Builder putHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder queryParams(List<String> queryParams) {
            this.queryParams.clear();
            this.queryParams.addAll(queryParams);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        @Override
        public HttpMalformedRequestDefinition build() {
            return new HttpMalformedRequestDefinition(this);
        }
    }
}
