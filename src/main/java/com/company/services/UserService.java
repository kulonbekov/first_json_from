package com.company.services;

import com.company.models.User;
import com.company.services.impl.UserServiceImpl;

import java.util.List;

public interface UserService {
    UserService INSTANCE = new UserServiceImpl();

    User createUser(List<User> list);

    void outputList(List<User> list);
}
