package com.xmxedu.oaken.fetch.adn.lomark;

import com.xmxedu.oaken.fetch.Bidder;
import com.xmxedu.oaken.fetch.request.GetRequest;
import com.xmxedu.oaken.fetch.response.GetResponse;

/**
 * 点媒平台请求处理类
 * @version 1.0
 */
public class LoMarkAdnHandler extends Bidder {
    private GetRequest request;
    private GetResponse response;

    @Override
    public GetRequest getRequest() {
        return request;
    }

    public void setRequest(GetRequest request) {
        this.request = request;
    }

    @Override
    public GetResponse getResponse() {
        return response;
    }

    public void setResponse(GetResponse response) {
        this.response = response;
    }
}
