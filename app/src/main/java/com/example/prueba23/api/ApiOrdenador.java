package com.example.prueba23.api;

import com.example.prueba23.entities.*;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiOrdenador {
    @GET("api/Ordenadores")
    Call<List<Ordenador>> get();

    @GET("api/Ordenadores/{numSerie}")
    Call<List<Ordenador>> get(@Path("numSerie") String numSerie);

    @POST("api/Ordenadores")
    Call<Ordenador> post(@Body Ordenador ordenador);

    @PUT("api/Ordenadores/{numSerie}")
    Call<Ordenador> put(@Path("numSerie") String numSerie, @Body Ordenador ordenador);

    @DELETE("api/Ordenadores/{numSerie}")
    Call<Ordenador> delete(@Path("numSerie") String numSerie);
}
