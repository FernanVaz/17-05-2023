package com.softtec.taller.modeloDAO;

import org.springframework.stereotype.Component;

@Component("AP")
public class AccesoProduccion implements DAO {
    @Override
    public String insertar(Cliente C) {
        return "AP";
    }
}
