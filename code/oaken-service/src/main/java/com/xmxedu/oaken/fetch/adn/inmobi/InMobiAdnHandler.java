package com.xmxedu.oaken.fetch.adn.inmobi;

import com.xmxedu.oaken.fetch.Bidder;
import com.xmxedu.oaken.fetch.request.PostRequest;
import com.xmxedu.oaken.fetch.response.PostResponse;

/**
 * InMobi向上游平台发送请求的具体实现和初始化对象
 * @version 1.0
 */
public class InMobiAdnHandler extends Bidder {
    private PostRequest request;
    private PostResponse response;

    @Override
    public PostRequest getRequest() {
        return request;
    }

    public void setRequest(PostRequest request) {
        this.request = request;
    }

    @Override
    public PostResponse getResponse() {
        return response;
    }

    public void setResponse(PostResponse response) {
        this.response = response;
    }
}
