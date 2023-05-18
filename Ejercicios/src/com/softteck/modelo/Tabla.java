package com.softteck.modelo;

public class Tabla {
    int t;
    String tabla;
    public Tabla(){}

    public String CalcularNumero(int n){
        this.t= n;
        for (int i = 1; i <= 10; i++) {
            this.tabla = tabla+"\n" + t*i;
        }
        return tabla;
    }
}
