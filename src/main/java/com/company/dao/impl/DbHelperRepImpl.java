package com.company.dao.impl;

import com.company.dao.DbHelperRep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelperRepImpl implements DbHelperRep {

    private final String url = "jdbc:postgresql://localhost/json_1";
    private final String user = "postgres";
    private final String password = "postgres";
    @Override
    public Connection connect() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
