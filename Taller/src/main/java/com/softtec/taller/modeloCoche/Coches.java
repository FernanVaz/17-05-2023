package com.softtec.taller.modeloCoche;

import org.springframework.stereotype.Component;

@Component("C")
public class Coches implements IVehiculo{
    int deposito;
    public Coches() {}
    public Coches(int deposito) {
        this.deposito = deposito;
    }
    @Override
    public String moverse() {
        if (deposito > 0) {

            return "el coche se esta moviendo";
        }else{
            return "el coche no se esta moviendo xk no tinene gasolina";
        }
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
