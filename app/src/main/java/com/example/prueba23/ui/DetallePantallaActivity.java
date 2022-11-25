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
import com.example.prueba23.entities.Pantalla;

public class DetallePantallaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pantalla);


        Button botonVolver = findViewById(R.id.botonVolverDetalles);

        botonVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();

                String localizacion  = (String) bundle.get("loc");




                if(localizacion.equals("Prestamos")){
                    Intent intent = new Intent(DetallePantallaActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (localizacion.equals("Equipos")){
                    Intent intent = new Intent(DetallePantallaActivity.this, MainActivity.class);
                    startActivity(intent);
                }else if (localizacion.equals("Solicitudes")){
                    Intent intent = new Intent(DetallePantallaActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        Dispositivo disp = new Dispositivo();
        disp.setEstado("Libre");
        disp.setIdCategoria(1);
        disp.setMarca("Marca Ejemplo");
        disp.setModelo("M3");
        disp.setLocalizacion("C3");
        disp.setNumSerie("n1");

        Pantalla pan = new Pantalla();
        pan.setPulgadas(40);
        pan.setNumSerie("n1");

        RellenarDatos(disp, pan);

    }

    protected void RellenarDatos(Dispositivo disp, Pantalla pan){
        EditText inputNSerie = findViewById(R.id.inputNSerie);
        EditText inputCategoria = findViewById(R.id.inputCategoria);
        EditText inputMarca = findViewById(R.id.inputMarca);
        EditText inputModelo = findViewById(R.id.inputModelo);
        EditText inputEstado = findViewById(R.id.inputEstado);
        EditText inputLocalozacion = findViewById(R.id.inputLocalizacion);

        EditText inputPulgadas = findViewById(R.id.inputPulgadas);


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
        inputPulgadas.setText(pan.getPulgadas() + "");
        inputPulgadas.setText(pan.getNumSerie());



    }

}