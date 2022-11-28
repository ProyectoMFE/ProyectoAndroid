package com.example.prueba23.entities;

import java.util.List;

public class Usuario {
    private int idUsuario;
    private String correo, nombre, primerApellido, segundoApellido, tipo, contrasenia;
    private List<Solicitud> solicitudes;

    public Usuario() {
        this(Integer.MIN_VALUE, "", "");
    }

    public Usuario(int idUsuario, String correo, String tipo) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.tipo = tipo;
        this.contrasenia = "";
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
