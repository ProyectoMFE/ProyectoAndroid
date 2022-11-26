package com.example.prueba23.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.prueba23.entities.Usuario;
import com.example.prueba23.management.SesionManagement;

import com.example.prueba23.MainActivity;

import com.example.prueba23.R;

public class Login extends AppCompatActivity {


    Button buttonIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        inicializarVariables();

        Button boton = findViewById(R.id.botonLogin);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RealizaLogin();
            }
        });

    }

    private void inicializarVariables(){
        buttonIniciarSesion = (Button) findViewById(R.id.botonLogin);

        buttonIniciarSesion.setBackgroundColor(0xFFFFFFFF);


    }

    @Override
    protected void onStart() {
        super.onStart();

        checkLogin();


    }

    public void checkLogin(){
        // comporbar si el usuario esta loggeado
        // si esta loggeado que se dirija a main
        SesionManagement sesionManagement = new SesionManagement(Login.this);
        int userID = sesionManagement.getSession();

        if(userID != -1){
            moveToMain();
        }
    }

    public void RealizaLogin() {
        // login to app

        Usuario user = new Usuario();

        user.setIdUsuario(12);
        user.setNombre("Eduardo");

        SesionManagement sessionManagement = new SesionManagement(Login.this);
        sessionManagement.saveSession(user);

        moveToMain();


    }

    public void moveToMain(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}