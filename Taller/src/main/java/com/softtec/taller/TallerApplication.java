package com.softtec.taller;

import com.softtec.taller.modeloCoche.Coches;
import com.softtec.taller.modeloCoche.Conductor;
import com.softtec.taller.modeloCoche.IVehiculo;
import com.softtec.taller.modeloDAO.AccesoDesarrollo;
import com.softtec.taller.modeloDAO.AccesoProduccion;
import com.softtec.taller.modeloDAO.Cliente;
import com.softtec.taller.modeloDAO.ClienteDAO;
import com.softtec.taller.modeloTaller.Coche;
import com.softtec.taller.modeloTaller.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerApplication implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Conductor Fer;
    @Autowired
    private ClienteDAO clienteDAO;
    public static void main(String[] args) {
        SpringApplication.run(TallerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Coche();
        DAO();
    }
    public void Taller() {
        Coche c1 = new Coche("123123","qweqweqe","qweqweqwe");
    }
    public void Coche() {

        ((Coches) Fer.getIv()).setDeposito(100);
        System.out.println(Fer.Conducir());
    }
    public void DAO() {
        Cliente client =new Cliente("Fer","123456789Q");
        System.out.println(clienteDAO.Insertar(client));
        clienteDAO.setID(new AccesoDesarrollo());
        System.out.println(clienteDAO.Insertar(client));
    }
}
