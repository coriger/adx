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

    @Around("execution(** com.xmxedu.oaken.request.sdk.SdkVersion10.decryptSdkBody(..))")
    public void logDecryptSdkBody(ProceedingJoinPoint joinPoint){
        logger.info("######## A New Sdk Request Incoming #######");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error(" decrypt sdk body encounter an throwable: {}",throwable.getMessage());
        }

        logger.info(" decrypt sdk body correctly: {}");
    }

}
