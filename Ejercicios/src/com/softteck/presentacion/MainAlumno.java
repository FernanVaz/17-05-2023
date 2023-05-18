package com.softteck.presentacion;

import com.softteck.modelo.Alumno;

public class MainAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Fernando Vaz", 3);
        double[] calificaciones = {8.5, 9.0, 7.5};
        alumno.setParciales(calificaciones);

        alumno.mostrarCalificaciones();
        System.out.println("Promedio: " + alumno.calcularPromedio());
    }
}
