package com.company.dao;

import com.company.dao.impl.UserRepImpl;
import com.company.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRep {
    UserRep INSTANCE = new UserRepImpl();

    void createUserDao(List<User> list) throws SQLException;
}
