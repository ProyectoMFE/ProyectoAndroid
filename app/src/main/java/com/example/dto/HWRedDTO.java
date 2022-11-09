package com.example.dto;

public class HWRedDTO implements CaracteristicaDTO{
    private String numSerie;
    private int cantPuertos, velocidad;

    public HWRedDTO() {
        this("", 0, 0);
    }

    public HWRedDTO(String numSerie, int cantPuertos, int velocidad) {
        this.numSerie = numSerie;
        this.cantPuertos = cantPuertos;
        this.velocidad = velocidad;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getCantPuertos() {
        return cantPuertos;
    }

    public void setCantPuertos(int cantPuertos) {
        this.cantPuertos = cantPuertos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
