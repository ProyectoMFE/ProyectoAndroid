package com.example.prueba23.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.se.omapi.Session;
import android.text.Editable;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

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
                EditText inputusuario = findViewById(R.id.inputUsuarios);
                Editable email = inputusuario.getText();
                String emailString = email.toString();
                if(emailString.equals("usuario@usuario.com") || emailString.equals("admin@admin.com")){
                    RealizaLogin();
                }else {
                    Toast toast1 =Toast.makeText(getApplicationContext(),"El usuario no cuadra Escribe un usuario o admin", Toast.LENGTH_SHORT);

                    toast1.show();
                }

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

        EditText inputusuario = findViewById(R.id.inputUsuarios);
        Usuario user = new Usuario();
        if(inputusuario.equals("usuario@usuario.com")){
            user.setIdUsuario(1);
            user.setNombre("Usuario");
        }else if(inputusuario.equals("admin@admin.com")) {
            user.setIdUsuario(2);
            user.setNombre("admin");
        }


        Toast toast1 =Toast.makeText(getApplicationContext(),"Bienvenido", Toast.LENGTH_SHORT);

        toast1.show();

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