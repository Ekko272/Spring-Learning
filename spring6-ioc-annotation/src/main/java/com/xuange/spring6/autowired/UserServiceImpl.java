package com.xuange.spring6.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service dao...");
        userDao.add();
    }
}
