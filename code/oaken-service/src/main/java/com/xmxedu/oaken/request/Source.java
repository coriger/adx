package com.xmxedu.oaken.request;

import com.google.gson.JsonObject;

/**
 * SDK 中相关参数接口解析，去重，过滤，转化和解密等
 * @version 1.0.0
 */

public interface Source {
    public boolean verifySdkBody(String sdkBody);
    public JsonObject filterSdkJson(JsonObject sdkJson);
    public String decryptSdkBody(String sdkBody);
}
