package com.nominatienda.App;

import com.nominatienda.domain.*;

import java.util.ArrayList;
import java.util.List;

public class AppNominaTienda {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Empleado juan = new Directo("Juan",4840000);
        Empleado julian = new Vendedor("Julián",2050000,45510000);
        Empleado johana = new Freelance("Johana",71000,89);
        Empleado carolina = new Vendedor("Carolina",980000, 35989000);
        Empleado pedro = new Promotor("Pedro",1200 ,300,62);
        Empleado david = new Directo("David", 3975000);
        Empleado gustavo = new Freelance("Gustavo", 42500, 65);

        empleados.add(juan);
        empleados.add(julian);
        empleados.add(johana);
        empleados.add(carolina);
        empleados.add(pedro);
        empleados.add(david);
        empleados.add(gustavo);

        Nomina nomina = new Nomina(empleados);

        System.out.println("Nómina a Pagar:");
        nomina.calcularNomina();
        System.out.println();
        System.out.println("Empleados Directos:");
        nomina.listarDirectos();
        System.out.println();
        System.out.println("Empleados Freelance:");
        nomina.listarFreelance();
        System.out.println();
        System.out.println("Empleados Promotores:");
        nomina.listarPromotores();

    }
}
