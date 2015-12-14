package com.xmxedu.oaken.aspect;

import com.google.gson.JsonObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sdk Aspect implemention
 * @version 1.0.0
 */
@Aspect
public class SdkAspect {

    private final static Logger logger = LoggerFactory.getLogger(SdkAspect.class);

    @Around("execution(* com.xmxedu.oaken.request.sdk.SdkVersion10.decryptSdkBody(String)) && args(sdkBody)")
    public void logDecryptSdkBody(ProceedingJoinPoint joinPoint,String sdkBody){

        logger.info("######## A New Sdk Request Incoming #######");
        logger.info(" new sdk request body is: {}",sdkBody);
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error(" decrypt sdk body encounter an throwable: {}",throwable.getMessage());
            return;
        }

        logger.info(" decrypt sdk body correctly: {}",(JsonObject)result);
    }

    @Around("execution(* com.xmxedu.oaken.request.sdk.SdkVersion10.verifySdkBody(..))")
    public void logVerifySdkBody(ProceedingJoinPoint joinPoint){

        try {
            Object verify = joinPoint.proceed();
            logger.info("verify sdk body status: {}",verify);
        }
        catch (Throwable throwable){
            logger.error(" verify sdk body encounter an throwable: {}",throwable.getMessage());
        }
    }

    @Around("execution(* com.xmxedu.oaken.request.sdk.SdkVersion10.filterSdkJson(String)) && args(sdkJson)")
    public void logFilterSdkJson(ProceedingJoinPoint joinPoint,JsonObject sdkJson){
        logger.info("filter sdk json and its source is {}",sdkJson);
        Object result = null;
        try {
            result = joinPoint.proceed();
        }
        catch (Throwable throwable){
            logger.error("filter sdkJson encounter an throwable: {}",throwable.getMessage());
            return;
        }

        logger.info("filter sdk Json correctly: {}",(JsonObject)result);

    }
}
