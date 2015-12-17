package com.xmxedu.oaken.request.sdk;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.request.Source;

/**
 * sdk 2.0
 * @version 1.0
 */
public class SdkVersion20 implements Source {
    public boolean verifySdkBody(JsonObject sdkBody) {
        return false;
    }

    public JsonObject filterSdkJson(JsonObject sdkJson) {
        return null;
    }

    public JsonObject decryptSdkBody(String sdkBody) {
        return null;
    }
}
