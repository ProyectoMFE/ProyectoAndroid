package com.example.prueba23.api;

import com.example.prueba23.entities.Categoria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiCategoria {
    @GET("api/Categorias")
    Call<List<Categoria>> get();

    @GET("api/Categorias/{idCategoria}")
    Call<List<Categoria>> get(@Path("idCategoria") int idCategoria);

    @POST("api/Categorias")
    Call<Categoria> post(@Body Categoria categoria);

    @PUT("api/Categorias/{idCategoria}")
    Call<Categoria> put(@Path("idCategoria") int idCategoria, @Body Categoria categoria);

    @DELETE("api/Categorias/{idCategoria}")
    Call<Categoria> delete(@Path("idCategoria") int idCategoria);
}
