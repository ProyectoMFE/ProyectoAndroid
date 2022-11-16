package com.example.prueba23.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prueba23.MainActivity;
import com.example.prueba23.R;
import com.example.prueba23.ui.equipos.equipos;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button) findViewById(R.id.botonLogin);

        button.setBackgroundColor(0xFFFFFFFF);
    }


    public void RealizaLogin(View view) {
        Button boton = (Button) view;

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}