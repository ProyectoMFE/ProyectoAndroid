package com.example.prueba23.ui.equipos;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba23.R;

import java.util.ArrayList;

public class adapterEquipos extends RecyclerView.Adapter<adapterEquipos.VistaHolder>{

    private ArrayList<claseEquipo> mDataSet;

    // Obtener referencias de los componentes visuales para cada elemento
    // Es decir, referencias de los EditText, TextViews, Buttons
    public static class VistaHolder extends RecyclerView.ViewHolder {
        // en este ejemplo cada elemento consta solo de un título
         TextView dispositivo;
         TextView marca;
         TextView modelo;
         TextView estado;
         TextView localizacion;
         Button boton;

        public VistaHolder(View v) {
            super(v);
            dispositivo = v.findViewById(R.id.contenidoDispositivos);
            marca = v.findViewById(R.id.contenidoMarca);
            modelo = v.findViewById(R.id.contenidoModelo);
            estado = v.findViewById(R.id.contenidoEstado);
            localizacion = v.findViewById(R.id.contenidoLocalizacion);
            boton   =  v.findViewById(R.id.contenidoBoton);

        }
    }

    // Este es nuestro constructor (puede variar según lo que queremos mostrar)
    public adapterEquipos(ArrayList<claseEquipo> myDataSet) {
        mDataSet = myDataSet;
    }

    // El layout manager invoca este método
    // para renderizar cada elemento del RecyclerView
    @Override
    public adapterEquipos.VistaHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // Creamos una nueva vista
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elementolista, parent, false);
        return new VistaHolder(v);
    }



    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull adapterEquipos.VistaHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido usando tales datos
        claseEquipo equipo = mDataSet.get(position);
        holder.dispositivo.setText(equipo.dispositivos.isEmpty() ? "" :  equipo.dispositivos);
        holder.marca.setText(equipo.marca.isEmpty() ? "" :  equipo.marca);
        holder.modelo.setText(equipo.modelo.isEmpty() ? "" :  equipo.modelo);
        holder.estado.setText(equipo.estado.isEmpty() ? "" :  equipo.estado);
        holder.localizacion.setText(equipo.localizacion.isEmpty() ? "" :  equipo.localizacion);

        holder.boton.setText("Reservar");

        /*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, DetalleEquipo.class);

                intent.putExtra("id", id);
                contexto.startActivity(intent);
            }
        }); */
    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejem, si implementamos filtros o búsquedas)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
