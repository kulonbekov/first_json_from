package com.company.microservice;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class OkHttpConnection {

    public String getJsonUser() {

        String urlHome = "https://jsonplaceholder.typicode.com/posts";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(urlHome)
                .build();

        Call call = client.newCall(request);

        Response response;
        try {
            response = call.execute();

            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
