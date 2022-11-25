package com.example.prueba23.api;

import com.example.prueba23.entities.HWRed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiHWRed {
    @GET("api/HwReds")
    Call<List<HWRed>> get();

    @GET("api/HwReds/{numSerie}")
    Call<List<HWRed>> get(@Path("numSerie") String numSerie);

    @POST("api/HwReds")
    Call<HWRed> post(@Body HWRed hwred);

    @PUT("api/HwReds/{numSerie}")
    Call<HWRed> put(@Path("numSerie") String numSerie, @Body HWRed hwred);

    @DELETE("api/HwReds/{numSerie}")
    Call<HWRed> delete(@Path("numSerie") String numSerie);
}
