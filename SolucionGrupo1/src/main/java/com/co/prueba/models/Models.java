package com.co.prueba.models;

public class Models {


    private String entrada_detexto;
    private String contrasena;
    private String tarea;

    public Models(String entrada_detexto, String contrasena, String tarea) {
        this.entrada_detexto = entrada_detexto;
        this.contrasena = contrasena;
        this.tarea = tarea;
    }

    public String getEntrada_detexto() {
        return entrada_detexto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTarea() {
        return tarea;
    }
}
