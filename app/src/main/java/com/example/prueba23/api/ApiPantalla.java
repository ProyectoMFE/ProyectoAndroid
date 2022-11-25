package com.example.prueba23.api;

import com.example.prueba23.entities.Pantalla;
import com.example.prueba23.entities.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiPantalla {
    @GET("api/Pantallas")
    Call<List<Pantalla>> get();

    @GET("api/Pantallas/{numSerie}")
    Call<List<Pantalla>> get(@Path("numSerie") String numSerie);

    @POST("api/Pantallas")
    Call<Pantalla> post(@Body Pantalla pantalla);

    @PUT("api/Pantallas/{numSerie}")
    Call<Pantalla> put(@Path("numSerie") String numSerie, @Body Pantalla pantalla);

    @DELETE("api/Pantallas/{numSerie}")
    Call<Pantalla> delete(@Path("numSerie") String numSerie);
}
