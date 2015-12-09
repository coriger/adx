package com.xmxedu.oaken.bidder;

import com.xmxedu.oaken.request.RequestHandler;
import com.xmxedu.oaken.response.ResponseHandler;

/**
 * 用来继承第三方平台的基础Bidder,提供对外的接口，名称，平台id，请求参数，返回参数等
 * @version 1.0.0
 */
public abstract class Bidder {
    private int id;
    private String name;

    // http request handler, post or get
    public abstract RequestHandler buildRequestHandler();

    // 物料返回内容
    public abstract ResponseHandler parseResponseHandler();
}
