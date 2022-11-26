package com.example.prueba23.ui.Configuracion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.prueba23.R;
import com.example.prueba23.databinding.FragmentConfiguracionBinding;
import com.example.prueba23.entities.Usuario;
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

        EditText editTextNombre = view.findViewById(R.id.inputNombre);
        EditText editTextCorreo = view.findViewById(R.id.inputCorreo);
        EditText editTextApe1 = view.findViewById(R.id.inputApellido1);
        EditText editTextApe2 = view.findViewById(R.id.inputApellido2);

        Button botonCategorias = view.findViewById(R.id.botonCategorias);
        Button botonUsuario = view.findViewById(R.id.botonUsuarios);
        botonCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SesionManagement sessSesionManagement = new SesionManagement(context.getApplicationContext());

                sessSesionManagement.removeSesion();

                moveToLogin();
            }
        });
        SesionManagement sesionManagement = new SesionManagement(context);
        int usuario = sesionManagement.getSession();
        Usuario user = new Usuario();


        if(usuario == 1){
            user.setIdUsuario(1);
            user.setNombre("Usuario");
            user.setCorreo("usuario@usuario.com");
            user.setPrimerApellido("usuario");
            user.setSegundoApellido("usuario2");
            botonCategorias.setVisibility(View.GONE);
            botonUsuario.setVisibility(View.GONE);
        }else{
            user.setIdUsuario(2);
            user.setNombre("Admin");
            user.setCorreo("admin@admin.com");
            user.setPrimerApellido("Admin");
            user.setSegundoApellido("Admin2");
            botonCategorias.setVisibility(View.VISIBLE);
            botonUsuario.setVisibility(View.VISIBLE);
        }





        editTextNombre.setText(user.getNombre());
        editTextCorreo.setText(user.getCorreo());
        editTextApe1.setText(user.getPrimerApellido());
        editTextApe2.setText(user.getSegundoApellido());
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