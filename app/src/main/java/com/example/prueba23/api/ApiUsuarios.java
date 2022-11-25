package com.example.prueba23.api;

import com.example.prueba23.entities.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiUsuarios {
    @GET("api/Usuarios")
    Call<List<Usuario>> get();

    @GET("api/Usuarios/{correo}")
    Call<List<Usuario>> get(@Path("correo") String correo);

    @POST("api/Usuarios")
    Call<Usuario> post(@Body Usuario usuario);

    @PUT("api/Usuarios/{correo}")
    Call<Usuario> put(@Path("correo") String correo, @Body Usuario usuario);

    @DELETE("api/Usuarios/{correo}")
    Call<Usuario> delete(@Path("correo") String correo);
}
