package com.softtec.taller.modeloTaller;

import org.springframework.stereotype.Component;

@Component("tm")
public class TallerMecanica implements Taller {
    @Override
    public String reparar(Coche c) {
        return "reparando la parte mecanica del coche";
    }
}
