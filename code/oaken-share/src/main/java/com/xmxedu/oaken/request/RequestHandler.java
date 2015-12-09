package com.xmxedu.oaken.request;

import org.springframework.stereotype.Component;

/**
 * 聚合平台请求方式，POST，GET的方式
 */
@Component
public abstract class RequestHandler {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public abstract String buildRequestParameters(String parameters);
}
