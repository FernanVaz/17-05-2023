package com.softtec.taller.modeloDAO;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
    String nombre, NIF;

    public Cliente() {}
    public Cliente(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}
