package com.softtek.web;

import com.softtek.web.Controlador.PacienteControlador;
import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Servicio.PacienteServiciolmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacientesApplication implements CommandLineRunner {

    @Autowired
    private PacienteServiciolmp PS;
    @Autowired
    private PacienteControlador PC;

    public static void main(String[] args) {
        SpringApplication.run(PacientesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Paciente paciente = new Paciente(1,"Fer",21);
        System.out.println(PS.obtenerUno(paciente));
        System.out.println(PC.obtenerUno(paciente));
    }
}
