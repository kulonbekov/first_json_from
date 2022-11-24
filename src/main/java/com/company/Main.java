package com.company;

import com.company.microservice.OkHttpConnection;
import com.company.models.User;
import com.google.gson.Gson;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OkHttpConnection connection = new OkHttpConnection();
        Gson gson = new Gson();

        List<User> read = gson.fromJson(connection.getJsonUser(), List.class);

        System.out.println(read);
    }
}
