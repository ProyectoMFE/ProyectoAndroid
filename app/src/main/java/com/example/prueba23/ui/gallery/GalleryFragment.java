package com.example.prueba23.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prueba23.R;
import com.example.prueba23.databinding.FragmentGalleryBinding;
import com.example.prueba23.entities.Dispositivo;
import com.example.prueba23.ui.equipos.adapterEquipos;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    // esto es para mostrar lo de las listas
    private RecyclerView mRecyclerView;
    private adapterSolicitudes  adapterEquipos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mRecyclerView = root.findViewById(R.id.recyclerViewSolicitudes);
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

        ArrayList<Dispositivo> listaEquipos = new ArrayList<>();

        Dispositivo equipo = new Dispositivo("1","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new Dispositivo("2","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new Dispositivo("3","2","3","4","5");
        listaEquipos.add(equipo);
        equipo = new Dispositivo("4","2","3","4","5");

        listaEquipos.add(equipo);
        adapterEquipos = new adapterSolicitudes(listaEquipos);
        mRecyclerView.setAdapter(adapterEquipos);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}