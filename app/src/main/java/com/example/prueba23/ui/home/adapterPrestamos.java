package com.example.prueba23.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba23.R;
import com.example.prueba23.entities.Dispositivo;

import java.util.ArrayList;

public class adapterPrestamos extends RecyclerView.Adapter<adapterPrestamos.PrestamosHolder>{



    private ArrayList<Dispositivo> mDataSet;

    // Obtener referencias de los componentes visuales para cada elemento
    // Es decir, referencias de los EditText, TextViews, Buttons
    public static class PrestamosHolder extends RecyclerView.ViewHolder {
        // en este ejemplo cada elemento consta solo de un título
        TextView dispositivo;
        TextView marca;
        TextView modelo;
        TextView localizacion;
        Button boton;

        public PrestamosHolder(View v) {
            super(v);
            dispositivo = v.findViewById(R.id.contenidoDispositivos);
            marca = v.findViewById(R.id.contenidoMarca);
            modelo = v.findViewById(R.id.contenidoModelo);
            localizacion = v.findViewById(R.id.contenidoLocalizacion);
            boton   =  v.findViewById(R.id.contenidoBoton);

        }
    }

    // Este es nuestro constructor (puede variar según lo que queremos mostrar)
    public adapterPrestamos(ArrayList<Dispositivo> myDataSet) {
        mDataSet = myDataSet;
    }

    // El layout manager invoca este método
    // para renderizar cada elemento del RecyclerView
    @Override
    public adapterPrestamos.PrestamosHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // Creamos una nueva vista
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemetolistaprestamos, parent, false);
        return new adapterPrestamos.PrestamosHolder(v);
    }



    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull adapterPrestamos.PrestamosHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido usando tales datos
        Dispositivo equipo = mDataSet.get(position);

        // Hay que activar cuando tenga la conexion a la api y tengo que recibir la categoria
        // holder.dispositivo.setText(equipo.getIdCategoria().isEmpty() ? "" :  equipo.getIdCategoria());
        holder.dispositivo.setText("Categoria");
        holder.marca.setText(equipo.getMarca().isEmpty() ? "" :  equipo.getMarca());
        holder.modelo.setText(equipo.getModelo().isEmpty() ? "" :  equipo.getModelo());
        holder.localizacion.setText(equipo.getLocalizacion().isEmpty() ? "" :  equipo.getLocalizacion());



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
