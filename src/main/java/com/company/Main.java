package com.company;

import com.company.microservice.OkHttpConnection;
import com.company.models.User;
import com.company.services.UserService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = UserService.INSTANCE;
        OkHttpConnection connection = new OkHttpConnection();
        Gson gson = new Gson();


        Type collectionType = new TypeToken<List<User>>(){}.getType();
        List<User> list = gson.fromJson(connection.getJsonUser(), collectionType);

        userService.outputList(list);
        userService.createUser(list);






    }
}
