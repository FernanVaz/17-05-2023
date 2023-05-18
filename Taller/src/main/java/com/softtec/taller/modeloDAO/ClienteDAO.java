package com.softtec.taller.modeloDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {
    @Autowired
    @Qualifier("AP")
    DAO id;
    public ClienteDAO(){}
    public ClienteDAO(DAO d){
        this.id = d;
    }
    public String Insertar(Cliente c){
        return id.insertar(c);
    }

    public void setID(DAO id){ this.id = id;}

    public DAO getId() {
        return id;
    }
}
