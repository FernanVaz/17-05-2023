package com.softtek.web.Repositorio;

import com.softtek.web.Modelo.Paciente;
import org.springframework.stereotype.Component;


public interface IPacienteRepo {
    String obtenerUno(Paciente paciente);
}
