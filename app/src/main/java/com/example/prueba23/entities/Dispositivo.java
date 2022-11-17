package com.example.prueba23.entities;

public class Dispositivo {
    private String numSerie, marca, modelo, localizacion, estado;
    private int idCategoria;

    public Dispositivo() {
        this("", "");
    }

    public Dispositivo(String numSerie, String modelo) {
        this.numSerie = numSerie;
        this.marca = "";
        this.modelo = modelo;
        this.localizacion = "";
        this.estado = "D";
        this.idCategoria = 0;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
