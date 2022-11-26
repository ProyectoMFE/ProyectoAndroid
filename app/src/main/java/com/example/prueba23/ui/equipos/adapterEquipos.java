package com.example.prueba23.ui.equipos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba23.R;
import com.example.prueba23.entities.Dispositivo;
import com.example.prueba23.ui.DetalleGeneralActivity;
import com.example.prueba23.ui.DetalleHardRedActivity;
import com.example.prueba23.ui.DetalleOrdenadorActivity;
import com.example.prueba23.ui.DetallePantallaActivity;

import java.util.ArrayList;

public class adapterEquipos extends RecyclerView.Adapter<adapterEquipos.VistaHolder>{

    private ArrayList<Dispositivo> mDataSet;
    Context context;
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
    public adapterEquipos(Context context , ArrayList<Dispositivo> myDataSet) {
        mDataSet = myDataSet;
        this.context = context;
    }

    // El layout manager invoca este método
    // para renderizar cada elemento del RecyclerView
    @Override
    public adapterEquipos.VistaHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // Creamos una nueva vista
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elementolistaequipos, parent, false);
        return new VistaHolder(v);
    }



    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull adapterEquipos.VistaHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido usando tales datos
        Dispositivo equipo = mDataSet.get(position);

        // Hay que activar cuando tenga la conexion a la api y tengo que recibir la categoria
        // holder.dispositivo.setText(equipo.getIdCategoria().isEmpty() ? "" :  equipo.getIdCategoria());
        holder.dispositivo.setText("Categoria");
        holder.marca.setText(equipo.getMarca().isEmpty() ? "" :  equipo.getMarca());
        holder.modelo.setText(equipo.getModelo().isEmpty() ? "" :  equipo.getModelo());
        holder.estado.setText(equipo.getEstado().isEmpty() ? "" :  equipo.getEstado());
        holder.localizacion.setText(equipo.getLocalizacion().isEmpty() ? "" :  equipo.getLocalizacion());

        holder.boton.setText("Reservar");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equipo.getIdCategoria() == 1){
                    Intent intent = new Intent(context, DetalleOrdenadorActivity.class);

                    intent.putExtra("id", equipo.getNumSerie());
                    intent.putExtra("loc", "Equipos");
                    context.startActivity(intent);
                }else  if(equipo.getIdCategoria() == 2){
                    Intent intent = new Intent(context, DetalleHardRedActivity.class);

                    intent.putExtra("id", equipo.getNumSerie());
                    intent.putExtra("loc", "Equipos");
                    context.startActivity(intent);
                }else  if(equipo.getIdCategoria() == 3){
                    Intent intent = new Intent(context, DetallePantallaActivity.class);

                    intent.putExtra("id", equipo.getNumSerie());
                    intent.putExtra("loc", "Equipos");
                    context.startActivity(intent);
                }else {
                    Intent intent = new Intent(context, DetalleGeneralActivity.class);

                    intent.putExtra("id", equipo.getNumSerie());
                    intent.putExtra("loc", "Equipos");
                    context.startActivity(intent);
                }

            }
        });
    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejem, si implementamos filtros o búsquedas)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
