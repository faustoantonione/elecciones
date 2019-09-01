package com.elecciones.model;

public class Postulante extends Persona {

    private Cargo cargo;

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public Postulante(String dni, String nombre, String apellido, Cargo cargo) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.cargo = cargo;
    }
}
