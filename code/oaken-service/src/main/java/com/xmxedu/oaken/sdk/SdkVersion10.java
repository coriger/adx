package com.xmxedu.oaken.sdk;

import com.google.gson.JsonObject;

/**
 * sdk 1.0 中相关协议解析，转换问题
 * @version 1.0.0
 */
public class SdkVersion10 implements RequestSource {
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
