package com.company.dao.impl;

import com.company.dao.DbHelperRep;
import com.company.dao.UserRep;
import com.company.models.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserRepImpl implements UserRep {
    DbHelperRep dbHelperRep = DbHelperRep.INSTANCE;
    @Override
    public void createUserDao(List<User> list) throws SQLException {
        for (int i = 0; i < list.size(); i++) {
            try (PreparedStatement sqlInsert = dbHelperRep.connect().prepareStatement("insert into tb_user (id,user_id,title,body) VALUES (?,?,?,?)")){
                sqlInsert.setLong(1,list.get(i).getId());
                sqlInsert.setLong(2,list.get(i).getUserId());
                sqlInsert.setString(3,list.get(i).getTitle());
                sqlInsert.setString(4,list.get(i).getBody());
                sqlInsert.execute();

            }
        }
    }
}
