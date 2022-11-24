package com.company.dao;

import com.company.dao.impl.DbHelperRepImpl;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbHelperRep {
    DbHelperRep INSTANCE = new DbHelperRepImpl();

    Connection connect() throws SQLException;
}
