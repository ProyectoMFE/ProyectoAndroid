package com.example.prueba23.api;

import com.example.prueba23.entities.Solicitud;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiSolicitudes {
    @GET("api/Solicitudes")
    Call<List<Solicitud>> get();

    @FormUrlEncoded
    @POST("api/Solicitudes")
    Call<Solicitud> post(@Field("numSerie") String numSerie, @Field("correo") String correo);
}
