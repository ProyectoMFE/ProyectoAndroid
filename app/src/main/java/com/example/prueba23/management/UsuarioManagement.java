package com.example.prueba23.management;

import com.example.prueba23.api.ApiClient;
import com.example.prueba23.api.ApiUsuarios;
import com.example.prueba23.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsuarioManagement {
    private  List<Usuario> lista;
    private ApiUsuarios api;
    private boolean accionRealizada;

    public UsuarioManagement(){
        api = ApiClient.getRetrofit().create(ApiUsuarios.class);
    }

    public List<Usuario> realizarGet(){
        Call<List<Usuario>> call = api.get();

        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                if (response.isSuccessful()){
                    lista = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                lista = new ArrayList<>();
            }
        });

        return lista;
    }
/*
    public Usuario realizarGet(String correo){
        Call<List<Usuario>> call = api.get(correo);

        // No entra aquí, aunque falle o no.
        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                lista = response.body();
            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                lista = new ArrayList<>();
                t.printStackTrace();
                lista.add(new Usuario());
            }
        });

        return lista.get(0);
    }*/

    public Usuario realizarGet(String correo){
        Call<List<Usuario>> call = api.get(correo);

        try {
            Response<List<Usuario>> res = call.execute();

            lista = res.body();
        } catch (Exception ex){
            lista = new ArrayList<>();
            lista.add(new Usuario());
        }

        return lista.get(0);
    }

    public boolean realizarPost(Usuario usuario){
        Call<Usuario> call = api.post(usuario);

        return ejecutar(call);
    }

    public boolean realizarPut(Usuario usuario){
        Call<Usuario> call = api.put(usuario.getCorreo(), usuario);

        return ejecutar(call);
    }

    public boolean realizarDelete(String correo){
        Call<Usuario> call = api.delete(correo);

        return ejecutar(call);
    }

    private boolean ejecutar(Call<Usuario> call){
        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if (response.isSuccessful()){
                    accionRealizada = true;
                }
                accionRealizada = false;
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                accionRealizada = false;
            }
        });

        return accionRealizada;
    }
}
