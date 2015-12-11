package com.xmxedu.oaken.request.sdk;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.request.Source;

/**
 * sdk 1.0 中相关协议解析，转换问题
 * @version 1.0.0
 */
public class SdkVersion10 implements Source {
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
