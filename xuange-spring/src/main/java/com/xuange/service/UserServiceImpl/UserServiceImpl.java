package com.xuange.service.UserServiceImpl;

import com.xuange.anno.Bean;
import com.xuange.anno.Di;
import com.xuange.dao.UserDao;
import com.xuange.service.UserService;

@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service.....");
        userDao.add();
        //调用dao
    }
}
