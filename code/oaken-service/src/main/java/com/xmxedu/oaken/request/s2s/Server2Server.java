package com.xmxedu.oaken.request.s2s;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.request.Source;

/**
 * Server 2 Server的请求方式
 * @version 1.0.0
 */
public class Server2Server implements Source {
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
