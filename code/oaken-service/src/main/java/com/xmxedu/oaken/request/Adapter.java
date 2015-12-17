package com.xmxedu.oaken.request;

import com.google.gson.JsonObject;

/**
 * 协议适配，将不同的SDK，server2server的协议进行统一转换，
 * @version 1.0.0
 */
public interface Adapter {
    public SpecialRequest convert(JsonObject jsonObject);
}
