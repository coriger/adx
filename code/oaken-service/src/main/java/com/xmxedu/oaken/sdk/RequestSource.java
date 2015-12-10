package com.xmxedu.oaken.sdk;

import com.google.gson.JsonObject;

/**
 * SDK 中相关参数接口解析，去重，过滤，转化和解密等
 * @version 1.0.0
 */

public interface RequestSource {
    public boolean verifySdkBody(String sdkBody);
    public JsonObject filterSdkJson(JsonObject sdkJson);
    public String decryptSdkBody(String sdkBody);
}
