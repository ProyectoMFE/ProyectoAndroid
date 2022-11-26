package com.example.prueba23.api;

import android.widget.Toast;

import com.example.prueba23.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://192.168.1.10:7033/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }


}
