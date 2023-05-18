package com.softteck.modelo;

public class Alumno {
    private String nombreCompleto;
    private double [] parciales;

    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }

    public void setParciales(double[] calificaciones) {
        if (calificaciones.length == parciales.length) {
            this.parciales = calificaciones;
        } else {
            System.out.println("La cantidad de calificaciones no coincide con la cantidad de parciales.");
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : parciales) {
            suma += calificacion;
        }
        return suma / parciales.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de los parciales:");
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + parciales[i]);
        }
    }
}
