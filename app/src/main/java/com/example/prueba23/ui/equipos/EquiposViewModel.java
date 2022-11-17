package com.example.prueba23.ui.equipos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class EquiposViewModel {

    private final MutableLiveData<String> mText;

    public EquiposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
