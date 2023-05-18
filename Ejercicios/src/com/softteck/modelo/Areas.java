package com.softteck.modelo;

public class Areas {
    float alto;
    float largo;
    float radio;
    public Areas(){}

    public Areas(float alto, float largo) {
        this.alto = alto;
        this.largo = largo;
    }
    public Areas(float radio){
        this.radio = radio;

    }

    public float getAlto() {
        return alto;
    }

    public float getLargo() {
        return largo;
    }

    public float getRadio() {
        return radio;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void CalcularRectangulo(float a,float l){
        this.alto = a;
        this.largo = l;
        System.out.println("El are del rectangulo es:" + alto*largo);

    }
    public void CalcularCirculo(float r){
        this.radio = r;
        System.out.println("El are del circulo es:" + (Math.PI)*Math.pow(radio, 2));

    }
}
