package com.xuange.spring6.autowired;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userdao adding...");

    }
}
