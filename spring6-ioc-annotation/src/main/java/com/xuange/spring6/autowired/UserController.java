package com.xuange.spring6.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void add(){
        System.out.println("controller....");
        userService.add();
    }
}
