package com.xmxedu.oaken.s2s;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.sdk.RequestSource;

/**
 * Server 2 Server的请求方式
 * @version 1.0.0
 */
public class Server2Server implements RequestSource {
    public boolean verifySdkBody(String sdkBody) {
        return false;
    }

    public JsonObject filterSdkJson(JsonObject sdkJson) {
        return null;
    }

    public String decryptSdkBody(String sdkBody) {
        return null;
    }
}
