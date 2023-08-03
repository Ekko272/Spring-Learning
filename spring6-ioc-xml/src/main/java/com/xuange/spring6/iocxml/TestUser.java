package com.xuange.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取bean的三种方式：

        //根据id获取
        User user = (User)context.getBean("user");
        System.out.println("User......"+user);

        //根据类型获取
        User user2 = context.getBean(User.class);
        System.out.println("User2....."+user2);

        //根据id与类型获取
        User user3 = context.getBean("user", User.class);
        System.out.println("User3....."+user3);
    }
}
