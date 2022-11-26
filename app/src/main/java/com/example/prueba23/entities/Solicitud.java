package com.example.prueba23.entities;

public class Solicitud {
    private int idUsuario;
    private String numSerie;
    private char estado;
    private Usuario idUsuarioNavigation;
    private Dispositivo numSerieNavigation;

    public Solicitud() {
        this(0, "", 'R');
    }

    public Solicitud(int idUsuario, String numSerie, char estado) {
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

    public Usuario getIdUsuarioNavigation() {
        return idUsuarioNavigation;
    }

    public Dispositivo getNumSerieNavigation() {
        return numSerieNavigation;
    }

    public void setIdUsuarioNavigation(Usuario idUsuarioNavigation) {
        this.idUsuarioNavigation = idUsuarioNavigation;
    }

    public void setNumSerieNavigation(Dispositivo numSerieNavigation) {
        this.numSerieNavigation = numSerieNavigation;
    }
}
