package com.xmxedu.oaken.biz;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xmzheng on 15/12/11.
 */
@Aspect
public class SdkAspect {

    private final static Logger logger = LoggerFactory.getLogger(SdkAspect.class);

    @Around("execution(String com.xmxedu.oaken.request.sdk.SdkVersion10.decryptSdkBody(String)) && args(sdkBody)")
    public void logDecryptSdkBody(ProceedingJoinPoint joinPoint,String sdkBody){

        logger.info("######## A New Sdk Request Incoming #######");
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error(" decrypt sdk body encounter an throwable: {}",throwable.getMessage());
            return;
        }

        logger.info(" decrypt sdk body correctly: {}",(String)result);
    }

}
