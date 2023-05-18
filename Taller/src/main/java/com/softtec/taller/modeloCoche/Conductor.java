package com.softtec.taller.modeloCoche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    IVehiculo iv;

    public Conductor(){}
     public Conductor(IVehiculo iv){
         this.iv = iv;
     }
    public String Conducir(){
        return iv.moverse();
    }

    public IVehiculo getIv() {
        return iv;
    }
    public void setIv(IVehiculo iv) {
        this.iv = iv;
    }
}
