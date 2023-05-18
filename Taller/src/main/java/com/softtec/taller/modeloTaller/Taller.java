package com.softtec.taller.modeloTaller;

import org.springframework.stereotype.Component;

@Component
public interface Taller {
    String reparar(Coche c);
}
