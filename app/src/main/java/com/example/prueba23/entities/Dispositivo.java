package com.example.prueba23.entities;

import java.util.List;

public class Dispositivo {
    private String numSerie, marca, modelo, localizacion, estado;
    private int idCategoria;
    private List<Solicitud> solicitudes;
    private HWRed hwRed;
    private Ordenador ordenadores;
    private Pantalla pantallas;

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

    public Dispositivo(String numSerie, String marca, String modelo, String localizacion, String estado) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.localizacion = localizacion;
        this.estado = estado;
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

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public HWRed getHwRed() {
        return hwRed;
    }

    public Ordenador getOrdenadores() {
        return ordenadores;
    }

    public Pantalla getPantallas() {
        return pantallas;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void setHwRed(HWRed hwRed) {
        this.hwRed = hwRed;
    }

    public void setOrdenadores(Ordenador ordenadores) {
        this.ordenadores = ordenadores;
    }

    public void setPantallas(Pantalla pantallas) {
        this.pantallas = pantallas;
    }
}
