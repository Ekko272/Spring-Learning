package com.xuange.spring6.junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestUser {

    //注入
    @Autowired
    private User user;


    @Test
    public void test(){
        System.out.println(user);
    }
}
