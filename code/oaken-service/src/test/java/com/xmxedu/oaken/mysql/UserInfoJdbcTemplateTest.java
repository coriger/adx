package com.xmxedu.oaken.mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml"})
public class UserInfoJdbcTemplateTest {

    @Test
    public void getUserInfoByUserIdTest(){

    }
}
