package com.elecciones.model;

import java.util.List;

public class Lista {

    private String numero;
    private String nombre;
    private Partido partido;
    private List<Postulante> postulantes;

    public Lista() {
    }

    public Lista(String numero, String nombre, Partido partido, List<Postulante> postulantes) {
        this.numero = numero;
        this.nombre = nombre;
        this.partido = partido;
        this.postulantes = postulantes;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public List<Postulante> getPostulantes() {
        return postulantes;
    }

    public void setPostulantes(List<Postulante> postulantes) {
        this.postulantes = postulantes;
    }

}
