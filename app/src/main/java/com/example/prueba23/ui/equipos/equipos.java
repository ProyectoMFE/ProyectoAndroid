package com.example.prueba23.ui.equipos;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prueba23.R;
import com.example.prueba23.databinding.FragmentEquiposBinding;
import com.example.prueba23.databinding.FragmentGalleryBinding;

import java.util.ArrayList;


public class equipos extends Fragment {

    FragmentEquiposBinding binding;

    // esto es para mostrar lo de las listas
    private RecyclerView mRecyclerView;
    private adapterEquipos  adapterEquipos;

    private static final String[] myDataSet = {
            "PHP",
            "Javascript",
            "Go",
            "Python"
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentEquiposBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mRecyclerView = root.findViewById(R.id.recyclerView);

        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // RecyclerView imageView = (RecyclerView) getView().findViewById(R.id.recyclerView);

        // Esto no es necesario se puede eliminar pero mejora el rendimiento.


        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        // Asociamos un adapter (ver más adelante cómo definirlo)

        ArrayList<claseEquipo> listaEquipos = new ArrayList<>();

        claseEquipo equipo = new claseEquipo("1","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new claseEquipo("2","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new claseEquipo("3","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new claseEquipo("4","2","3","4","5");

        listaEquipos.add(equipo);
         adapterEquipos = new adapterEquipos(listaEquipos);
         mRecyclerView.setAdapter(adapterEquipos);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}