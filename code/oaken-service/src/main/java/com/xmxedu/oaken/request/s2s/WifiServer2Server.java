package com.xmxedu.oaken.request.s2s;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.request.Source;

/**
 * wifi万能钥匙 to Server的请求方式
 * @version 1.0.0
 */
public class WifiServer2Server implements Source {
    public boolean verifySdkBody(JsonObject sdkJson) {
        return false;
    }

    public JsonObject filterSdkJson(JsonObject sdkJson) {
        return null;
    }

    public JsonObject decryptSdkBody(String sdkBody) {
        return null;
    }
}
