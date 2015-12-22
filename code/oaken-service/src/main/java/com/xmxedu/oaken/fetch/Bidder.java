package com.xmxedu.oaken.fetch;

/**
 * 第三方上游平台的基础Bidder类，用以去组织并发请求
 * @version 1.0
 */
public abstract class Bidder {
    private BaseRequest request;
    private BaseResponse response;

    public BaseRequest getRequest() {
        return request;
    }

    public void setRequest(BaseRequest request) {
        this.request = request;
    }

    public BaseResponse getResponse() {
        return response;
    }

    public void setResponse(BaseResponse response) {
        this.response = response;
    }
}
