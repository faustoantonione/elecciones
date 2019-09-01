package com.elecciones.model;

import java.util.Date;

public class Partido {

    private String nombre;
    private Date conformacion;
    private boolean vigente;

    public Partido() {
    }

    public Partido(String nombre, Date conformacion, Boolean vigente) {
        this.nombre = nombre;
        this.conformacion = conformacion;
        this.vigente = vigente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getConformacion() {
        return conformacion;
    }

    public void setConformacion(Date conformacion) {
        this.conformacion = conformacion;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

}
