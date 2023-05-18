package com.softtek.web.Controlador;

import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Servicio.IPacienteServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/Paciente")
public class PacienteControlador {
    @Autowired
    IPacienteServicio servicio;

    @GetMapping
    public String obtenerUno(Paciente paciente) {
        return "Controlador "+ paciente.toString();
    }

}
