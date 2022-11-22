package com.example.prueba23.entities;

public class Ordenador {
    private String numSerie, procesador, ram, discoPrincipal, discoSecundario;

    public Ordenador() {
        this("", "");
    }

    public Ordenador(String numSerie, String procesador) {
        this.numSerie = numSerie;
        this.procesador = procesador;
        this.ram = "";
        this.discoPrincipal = "";
        this.discoSecundario = "";
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiscoPrincipal() {
        return discoPrincipal;
    }

    public void setDiscoPrincipal(String discoPrincipal) {
        this.discoPrincipal = discoPrincipal;
    }

    public String getDiscoSecundario() {
        return discoSecundario;
    }

    public void setDiscoSecundario(String discoSecundario) {
        this.discoSecundario = discoSecundario;
    }
}
