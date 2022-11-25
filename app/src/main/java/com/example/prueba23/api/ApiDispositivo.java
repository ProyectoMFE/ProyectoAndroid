package com.example.prueba23.api;

import com.example.prueba23.entities.Dispositivo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiDispositivo {
    @GET("api/Dispositivos")
    Call<List<Dispositivo>> get();

    @GET("api/Dispositivos/{numSerie}")
    Call<List<Dispositivo>> get(@Path("numSerie") String numSerie);

    @POST("api/Dispositivos")
    Call<Dispositivo> post(@Body Dispositivo dispositivo);

    @PUT("api/Dispositivos/{numSerie}")
    Call<Dispositivo> put(@Path("numSerie") String numSerie, @Body Dispositivo dispositivo);

    @DELETE("api/Dispositivos/{numSerie}")
    Call<Dispositivo> delete(@Path("numSerie") String numSerie);
}
