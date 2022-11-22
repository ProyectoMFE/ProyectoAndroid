package com.example.prueba23.entities;

import java.util.Date;

public class HistoricoSolicitudes {
    private int idUsuario;
    private String numSerie;
    private Date fecha;
    private char ultimatum;

    public HistoricoSolicitudes() {
        this(0, "", new Date(), 'R');
    }

    public HistoricoSolicitudes(int idUsuario, String numSerie, Date fecha, char ultimatum) {
        this.idUsuario = idUsuario;
        this.numSerie = numSerie;
        this.fecha = fecha;
        this.ultimatum = ultimatum;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getUltimatum() {
        return ultimatum;
    }

    public void setUltimatum(char ultimatum) {
        this.ultimatum = ultimatum;
    }
}
