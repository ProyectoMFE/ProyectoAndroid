package com.example.dto;

import java.util.Date;

public class SolicitudDTO {
    private int idUsuario;
    private String numSerie;
    private char estado;

    public SolicitudDTO() {
        this(0, "", 'R');
    }

    public SolicitudDTO(int idUsuario, String numSerie, char estado) {
        this.idUsuario = idUsuario;
        this.numSerie = numSerie;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
