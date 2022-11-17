package com.example.prueba23.entities;

public class Pantalla {
    private String numSerie;
    private  int pulgadas;

    public Pantalla() {
        this("", 0);
    }

    public Pantalla(String numSerie, int pulgadas) {
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
