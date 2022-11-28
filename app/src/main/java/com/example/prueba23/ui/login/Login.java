package com.example.prueba23.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prueba23.MainActivity;

import com.example.prueba23.R;
import com.example.prueba23.api.ApiClient;
import com.example.prueba23.api.ApiUsuarios;
import com.example.prueba23.entities.Usuario;
import com.example.prueba23.management.UsuarioManagement;
import com.example.prueba23.ui.equipos.equipos;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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


    /*public void RealizaLogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        Button boton = (Button) view;
        TextView usu = findViewById(R.id.inputUsuarios);
        TextView pass = findViewById(R.id.editTextTextPassword);
        String correo = usu.getText().toString();
        UsuarioManagement m = new UsuarioManagement();

        try {
            Usuario u = m.realizarGet().get(0);

            if (u.getContrasenia().equals(pass.getText().toString())){
                guardarSesion(checkGuardarSesion.isChecked());
                loginPasado();
                startActivity(intent);
            }else{
                Toast.makeText(this, "No se pudo iniciar sesión", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e){
            Toast.makeText(this, "No se pudo conectar con la API", Toast.LENGTH_LONG).show();
        }
    }*/

    public void RealizaLogin(View view) {
        ApiUsuarios api = ApiClient.getRetrofit().create(ApiUsuarios.class);
        Call<List<Usuario>> call = api.get();
        final String[] a = {"alejandro sanz"};

        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                if (response.isSuccessful()) {
                    a[0] = response.body().get(0).getCorreo();
                } else{
                    a[0] = "odios";
                }
            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                a[0] = t.getMessage();
            }
        });

        Toast.makeText(this, a[0], Toast.LENGTH_LONG).show();
    }

    public void loginPasado(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}