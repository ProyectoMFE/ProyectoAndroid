package com.example.prueba23.ui.equipos;

public class claseEquipo {

    String dispositivos;
    String marca;
    String modelo;
    String estado;
    String localizacion;


    public claseEquipo(String dispositivos, String marca, String modelo, String estado, String localizacion) {

        this.dispositivos = dispositivos;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.localizacion = localizacion;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
