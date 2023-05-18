package com.softtec.taller.modeloTaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {
    @Autowired
    @Qualifier("tp")
    Taller taller;
    private String nonbre;
    public SeguroCoche(){}
    public SeguroCoche( String nonbre,Taller taller) {
        this.nonbre = nonbre;
        this.taller = taller;
    }
    public String reparar(Coche c,Taller t){
        return t.reparar(c);
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public Taller getTaller() {
        return taller;
    }

    public String getNonbre() {
        return nonbre;
    }
}
