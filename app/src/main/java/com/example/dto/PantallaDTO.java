package com.example.dto;

public class PantallaDTO implements CaracteristicaDTO{
    private String numSerie;
    private  int pulgadas;

    public PantallaDTO() {
        this("", 0);
    }

    public PantallaDTO(String numSerie, int pulgadas) {
        this.numSerie = numSerie;
        this.pulgadas = pulgadas;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
