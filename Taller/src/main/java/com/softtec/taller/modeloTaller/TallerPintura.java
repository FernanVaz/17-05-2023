package com.softtec.taller.modeloTaller;

import org.springframework.stereotype.Component;

@Component("tp")
public class TallerPintura implements Taller {

    public String reparar(Coche c) {
        return "REPARANDO LA PINTURA";
    }
}
