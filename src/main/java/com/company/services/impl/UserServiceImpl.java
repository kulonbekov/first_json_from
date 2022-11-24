package com.company.services.impl;

import com.company.dao.UserRep;
import com.company.models.User;
import com.company.services.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRep userRep = UserRep.INSTANCE;
    @Override
    public User createUser(List<User> list) {
        try {
            userRep.createUserDao(list);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables.getMessage());
        }
        return null;
    }

    public void outputList(List<User> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" userId = " + list.get(i).getUserId());
            System.out.print(", id = " + list.get(i).getId());
            System.out.println(";\n title = " + list.get(i).getTitle());
            System.out.println(" body = " + list.get(i).getBody());
            System.out.println("-----------------------------------");;
        }
    }
}
