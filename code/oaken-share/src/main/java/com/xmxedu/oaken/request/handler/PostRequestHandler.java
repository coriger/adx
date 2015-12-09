package com.xmxedu.oaken.request.handler;

import com.xmxedu.oaken.request.RequestHandler;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 对于聚合平台是Post请求方式的进行组装或者拼接
 * @version 1.0.0
 */

@Service
@Scope("Prototype")
public class PostRequestHandler extends RequestHandler {

    @Override
    public String buildRequestParameters(String parameters) {
        return null;
    }
}
