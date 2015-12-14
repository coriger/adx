package com.xmxedu.oaken.aspect;

import com.google.gson.JsonObject;
import com.xmxedu.oaken.request.Source;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * sdk解析AOP的测试
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@BootstrapWith
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SdkAspectTest {

    @Autowired
    @Qualifier("sdkVersion10")
    private Source sdkVersion10; // attention,this must using interface, not a specific implementation

    @Test
    public void decryptSdkBodyTest(){
        JsonObject sdkBody = sdkVersion10.decryptSdkBody("the parameters that i pass to it~");
    }

    @Test
    public void verifySdkBodyTest(){
        JsonObject jo = new JsonObject();
        jo.addProperty("key","test");
        sdkVersion10.verifySdkBody(jo);
    }
}
