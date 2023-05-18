package com.softtek.web.Repositorio;

import com.softtek.web.Modelo.Paciente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteRepolmpl implements IPacienteRepo{


    @Override
    public String obtenerUno(Paciente paciente) {
        return "Repo" + paciente.toString();
    }
}
