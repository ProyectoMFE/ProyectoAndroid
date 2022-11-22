package com.example.prueba23.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://localhost:7033/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
