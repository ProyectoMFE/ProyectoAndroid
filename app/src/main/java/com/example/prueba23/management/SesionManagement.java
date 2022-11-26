package com.example.prueba23.management;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.example.prueba23.entities.Usuario;

public class SesionManagement {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Usuario user;
    String SHARED_PREF_NAME = "session";
    String SESION_KEY = "session_user";
    Context context;
    public SesionManagement(Context context){
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    public void saveSession(Usuario user){
        // guardar la session del usuario cuando este iniciado Session
        int id = user.getIdUsuario();


        editor.putInt(SESION_KEY, id).commit();

    }

    public int getSession(){
        // devuelve el usuariom que tenga la sesion iniciada
      return sharedPreferences.getInt(SESION_KEY, -1);
    }

    public void removeSesion(){
        editor.putInt(SESION_KEY, -1).commit();
    }

    public void guardarUsuario(Usuario user){
        this.user = user;
    }

    public Usuario getUsuario(){
        return user;
    }

}
