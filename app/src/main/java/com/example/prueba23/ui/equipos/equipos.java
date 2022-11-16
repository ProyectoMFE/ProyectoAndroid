package com.example.prueba23.ui.equipos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prueba23.R;
import com.example.prueba23.databinding.FragmentEquiposBinding;
import com.example.prueba23.databinding.FragmentGalleryBinding;


public class equipos extends Fragment {

    FragmentEquiposBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //GalleryViewModel galleryViewModel =
        //        new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentEquiposBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // final TextView textView = binding.textEquipos;
        // galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}