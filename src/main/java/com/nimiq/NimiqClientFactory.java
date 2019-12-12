package com.nimiq;

import java.net.URL;
import java.util.Base64;
import java.util.Collections;
import java.util.Map;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;

/**
 * Factory class that can create instances of {@link NimiqClient}.
 */
public class NimiqClientFactory {

    private final JsonRpcHttpClient jsonRpcClient;

    public NimiqClientFactory(URL url) {
        jsonRpcClient = new JsonRpcHttpClient(url);
    }

    public NimiqClientFactory(URL url, String userName, String password) {
        String credentials = Base64.getEncoder().encodeToString((userName + ":" + password).getBytes());
        Map<String, String> headers = Collections.singletonMap("Authorization", "Basic " + credentials);
        jsonRpcClient = new JsonRpcHttpClient(url, headers);
    }

    public NimiqClient getClient() {
        return ProxyUtil.createClientProxy(NimiqClient.class.getClassLoader(), NimiqClient.class, jsonRpcClient);
    }
}
