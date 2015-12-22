package com.xmxedu.oaken.fetch;

import com.xmxedu.oaken.request.SpecialRequest;

import java.util.Map;

/**
 * 并发请求的基本方式，POST和GET请求，将并发请求的资源，提前准备好，类似于线程池一样的东西
 * @version 1.0
 */
public abstract class BaseRequest {
    // 上游平台请求物料地址
    private String url;
    // 上游平台请求类型
    private int requestType;
    // 上游平台请求头信息
    private Map<String,Object> headers;
    // 上游平台请求参数
    private String requestParameters;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public Map<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    // 请求参数实现
    public abstract String convertParameters(SpecialRequest request);
}
