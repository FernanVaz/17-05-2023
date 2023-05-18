package com.softtek.web.Servicio;

import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Repositorio.IPacienteRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PacienteServiciolmp implements IPacienteServicio{
    @Autowired
    IPacienteRepo IPR;

    @Override
    public String obtenerUno(Paciente paciente) {
        return  "Servicio " + paciente.toString();
    }
}
