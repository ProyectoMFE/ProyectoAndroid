package com.example.prueba23.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.prueba23.MainActivity;
import com.example.prueba23.R;
import com.example.prueba23.entities.Dispositivo;
import com.example.prueba23.entities.HWRed;

public class DetalleHardRedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_hard_red_activiry);

        Button botonVolver = findViewById(R.id.botonVolverDetalles);
        Bundle bundle = getIntent().getExtras();

        String localizacion  = (String) bundle.get("loc");
        botonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();

                String localizacion  = (String) bundle.get("loc");




                if(localizacion.equals("Prestamos")){
                    Intent intent = new Intent(DetalleHardRedActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (localizacion.equals("Equipos")){
                    Intent intent = new Intent(DetalleHardRedActivity.this, MainActivity.class);
                    startActivity(intent);
                }else if (localizacion.equals("Solicitudes")){
                    Intent intent = new Intent(DetalleHardRedActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        Button botonAccion = findViewById(R.id.botonAccionDetalles);


        if(localizacion.equals("Prestamos")){
            botonAccion.setText("Devolver");
        } else if (localizacion.equals("Equipos")){
            botonAccion.setText("Reservar");
        }else if (localizacion.equals("Solicitudes")){
            botonAccion.setVisibility(View.GONE);
        }

        Dispositivo disp = new Dispositivo();
        disp.setEstado("Libre");
        disp.setIdCategoria(1);
        disp.setMarca("Marca Ejemplo");
        disp.setModelo("M3");
        disp.setLocalizacion("C3");
        disp.setNumSerie("n1");

        HWRed red = new HWRed();
        red.setCantPuertos(5);
        red.setNumSerie("n1");

        RellenarDatos(disp, red);

    }

    protected void RellenarDatos(Dispositivo disp, HWRed red){
        EditText inputNSerie = findViewById(R.id.inputNSerie);
        EditText inputCategoria = findViewById(R.id.inputCategoria);
        EditText inputMarca = findViewById(R.id.inputMarca);
        EditText inputModelo = findViewById(R.id.inputModelo);
        EditText inputEstado = findViewById(R.id.inputEstado);
        EditText inputLocalozacion = findViewById(R.id.inputLocalizacion);
        EditText inputPuertos = findViewById(R.id.inputPulgadas);
        EditText inputVelocidad = findViewById(R.id.inputVelocidad);

        inputNSerie.setEnabled(false);
        inputCategoria.setEnabled(false);
        inputMarca.setEnabled(false);
        inputEstado.setEnabled(false);
        inputLocalozacion.setEnabled(false);
        inputPuertos.setEnabled(false);
        inputVelocidad.setEnabled(false);
        inputModelo.setEnabled(false);
        inputNSerie.setText(disp.getNumSerie());
        if(disp.getIdCategoria() == 1){
            inputCategoria.setText("Ordenador");
        }else if(disp.getIdCategoria() == 2){
            inputCategoria.setText("Hardware de Red");
        }else if(disp.getIdCategoria() == 3){
            inputCategoria.setText("Pantalla");
        }else{
            inputCategoria.setText("General");
        }
        inputMarca.setText(disp.getMarca());
        inputModelo.setText(disp.getModelo());
        inputEstado.setText(disp.getEstado());
        inputLocalozacion.setText(disp.getLocalizacion());
        inputPuertos.setText(red.getCantPuertos()+"");
        inputVelocidad.setText(red.getVelocidad()+"");



    }
}