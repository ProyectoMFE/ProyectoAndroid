package com.example.prueba23.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.prueba23.MainActivity;
import com.example.prueba23.R;
import com.example.prueba23.ui.equipos.equipos;

public class Login extends AppCompatActivity {

    CheckBox checkGuardarSesion;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String llave = "sesion";
    Button buttonIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        inicializarVariables();


        revisarSesion();
    }

    private void inicializarVariables(){
        buttonIniciarSesion = (Button) findViewById(R.id.botonLogin);

        buttonIniciarSesion.setBackgroundColor(0xFFFFFFFF);

        // Esto de abajo es para hacer el login y guardar la sesion.
        checkGuardarSesion = (CheckBox) findViewById(R.id.checkboxGuardarSesion);
        preferences = this.getPreferences(Context.MODE_PRIVATE);
        editor = preferences.edit();
    }


    private void guardarSesion(boolean checked){
        editor.putBoolean(llave,checked );
        editor.apply();
    }

    private boolean revisarSesion(){
        boolean sesion = this.preferences.getBoolean(llave, false);
        return false;
    }


    public void RealizaLogin(View view) {
        Button boton = (Button) view;

        guardarSesion(checkGuardarSesion.isChecked());

        loginPasado();


    }


    public void loginPasado(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}