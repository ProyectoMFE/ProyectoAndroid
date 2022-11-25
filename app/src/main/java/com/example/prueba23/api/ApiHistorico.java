package com.example.prueba23.api;

import com.example.prueba23.entities.HistoricoSolicitudes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiHistorico {
    @GET("api/HistoricoSolicitudes")
    Call<List<HistoricoSolicitudes>> get();
}
