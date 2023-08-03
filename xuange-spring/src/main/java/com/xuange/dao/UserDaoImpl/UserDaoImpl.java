package com.xuange.dao.UserDaoImpl;

import com.xuange.anno.Bean;
import com.xuange.anno.Di;
import com.xuange.dao.UserDao;
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao....");
    }
}
