package com.example.prueba23.api;

import com.example.prueba23.entities.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiUsuarios {
    @GET("api/Usuarios")
    Call<List<Usuario>> getUsuarios();
}
