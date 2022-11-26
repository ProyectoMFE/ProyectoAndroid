package com.example.prueba23.ui.Configuracion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.prueba23.R;
import com.example.prueba23.databinding.FragmentConfiguracionBinding;
import com.example.prueba23.management.SesionManagement;
import com.example.prueba23.ui.login.Login;

public class ConfiguracionFragment extends Fragment {

    private FragmentConfiguracionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentConfiguracionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();




        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button botonCerrarSesion = view.findViewById(R.id.logout_button);
        Context context = this.getContext();

        botonCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SesionManagement sessSesionManagement = new SesionManagement(context);
                sessSesionManagement.removeSesion();

                moveToLogin();
            }
        });
    }



    public void moveToLogin(){
        Intent intent = new Intent(this.getContext(), Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}