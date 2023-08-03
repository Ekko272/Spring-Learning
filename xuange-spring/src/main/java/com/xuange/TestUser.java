package com.xuange;

import com.xuange.Bean.AnnotationApplicationContext;
import com.xuange.Bean.ApplicationContext;
import com.xuange.service.UserService;

public class TestUser {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationApplicationContext("com.xuange");
        UserService userService = (UserService) context.getBean(UserService.class);//接口class作为key
        System.out.println(userService);
        userService.add();
    }
}
