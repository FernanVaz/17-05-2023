package com.softtek.web.Servicio;

import com.softtek.web.Modelo.Paciente;
import org.springframework.stereotype.Component;


public interface IPacienteServicio {
    String obtenerUno(Paciente paciente);
}
