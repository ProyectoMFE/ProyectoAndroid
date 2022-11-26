package com.example.prueba23.management;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.prueba23.entities.Usuario;

public class SesionManagement {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String SHARED_PREF_NAME = "session";
    String SESION_KEY = "session_user";

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

}
