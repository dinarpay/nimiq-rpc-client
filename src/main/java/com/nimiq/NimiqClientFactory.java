package com.nimiq;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;

/**
 * 
 */
public class NimiqClientFactory {

    private final JsonRpcHttpClient jsonRpcClient;

    public NimiqClientFactory(URL url) {
        ObjectMapper mapper = new ObjectMapper();
        // or use @JsonIgnoreProperties(ignoreUnknown=true) in POJOs
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Map<String, String> headers = new HashMap<>();
        // TODO Basic Auth
        jsonRpcClient = new JsonRpcHttpClient(mapper, url, headers);
    }

    public NimiqClient getClient() {
        return ProxyUtil.createClientProxy(NimiqClient.class.getClassLoader(), NimiqClient.class, jsonRpcClient);
    }
}
