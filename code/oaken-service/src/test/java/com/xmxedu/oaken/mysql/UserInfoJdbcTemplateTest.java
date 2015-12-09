package com.xmxedu.oaken.mysql;

import com.xmxedu.oaken.sql.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserInfoJdbcTemplateTest {

    @Test
    public void getUserInfoByUserIdTest(){

    }
}
