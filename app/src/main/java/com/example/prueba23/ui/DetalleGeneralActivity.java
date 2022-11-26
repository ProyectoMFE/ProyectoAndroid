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
import com.example.prueba23.management.SesionManagement;

public class DetalleGeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_general);
        Bundle bundle = getIntent().getExtras();

        Button botonVolver = findViewById(R.id.botonVolverDetalles);
        Button botonCentral = findViewById(R.id.botonAccionCentral);
        Button botonAccion = findViewById(R.id.botonAccionDetalles);


        String localizacion  = (String) bundle.get("loc");
        botonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(DetalleGeneralActivity.this, MainActivity.class);
                    startActivity(intent);
            }
        });




        SesionManagement sesionManagement = new SesionManagement(getApplicationContext());
        int usuario = sesionManagement.getSession();





        if(usuario == 1){
            if(localizacion.equals("Prestamos")){
                botonAccion.setVisibility(View.VISIBLE);
                botonAccion.setText("Devolver");
            } else if (localizacion.equals("Equipos")){
                botonAccion.setText("Reservar");
                botonAccion.setVisibility(View.VISIBLE);
            }else if (localizacion.equals("Solicitudes")){
                botonAccion.setVisibility(View.GONE);

            }
        }else{
            if(localizacion.equals("Prestamos")){
                botonAccion.setVisibility(View.GONE);
                botonAccion.setBackgroundColor(0000);
                botonCentral.setVisibility(View.GONE);
            } else if (localizacion.equals("Equipos")){
                botonAccion.setText("Eliminar");
                botonCentral.setVisibility(View.VISIBLE);
            }else if (localizacion.equals("Solicitudes")){
                botonCentral.setVisibility(View.VISIBLE);
                botonCentral.setText("Aceptar");
                botonAccion.setText("Rechazar");
            }
        }





        Dispositivo disp = new Dispositivo();
        disp.setEstado("Libre");
        disp.setIdCategoria(1);
        disp.setMarca("Marca Ejemplo");
        disp.setModelo("M3");
        disp.setLocalizacion("C3");
        disp.setNumSerie("n1");


        RellenarDatos(disp);
    }

    protected void RellenarDatos(Dispositivo disp){
        EditText inputNSerie = findViewById(R.id.inputNombre);
        EditText inputCategoria = findViewById(R.id.inputCorreo);
        EditText inputMarca = findViewById(R.id.inputApellido1);
        EditText inputModelo = findViewById(R.id.inputApellido2);
        EditText inputEstado = findViewById(R.id.inputEstado);
        EditText inputLocalozacion = findViewById(R.id.inputLocalizacion);

        inputNSerie.setEnabled(false);
        inputCategoria.setEnabled(false);
        inputMarca.setEnabled(false);
        inputModelo.setEnabled(false);
        inputEstado.setEnabled(false);
        inputLocalozacion.setEnabled(false);
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



    }
}