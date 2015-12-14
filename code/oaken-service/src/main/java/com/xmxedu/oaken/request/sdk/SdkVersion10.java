package com.xmxedu.oaken.request.sdk;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.xmxedu.oaken.request.Source;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * sdk 1.0 中相关协议解析，转换问题
 * @version 1.0.0
 */
@Service("sdkVersion10")
public class SdkVersion10 implements Source {

    private JsonParser parser = new JsonParser();

    public boolean verifySdkBody(JsonObject sdkBody) {
        return false;
    }

    public JsonObject filterSdkJson(JsonObject sdkJson) {
        if (null == sdkJson){
            return null;
        }

        return sdkJson;
    }

    public JsonObject decryptSdkBody (String sdkBody) {
        if (StringUtils.isBlank(sdkBody)){
            return null;
        }

        JsonElement element = parser.parse(sdkBody);
        return element.getAsJsonObject();
    }
}
