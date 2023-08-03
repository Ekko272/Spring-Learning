package com.xuange.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject(){
        //loading Spring configuration file, creating object
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //get object
        User user = (User)context.getBean("user");//得到对象（IOC）通过beanFactory
        System.out.println(user);
        user.add();
    }

    //反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        Class clazz = Class.forName("com.xuange.spring.User");
        //调用方法创建对象
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);


    }
}
