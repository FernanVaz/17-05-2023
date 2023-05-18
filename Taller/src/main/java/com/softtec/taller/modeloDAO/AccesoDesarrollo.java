package com.softtec.taller.modeloDAO;

import org.springframework.stereotype.Component;

@Component("AD")
public class AccesoDesarrollo implements DAO {
    @Override
    public String insertar(Cliente C) {
        return "AD";
    }
}
