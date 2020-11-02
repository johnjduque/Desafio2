package com.nominatienda.domain;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina(){
        empleados.forEach(empleado ->{
            System.out.println(empleado.toString() + "- Salario a pagar: " + empleado.calcularSalario());
        });

    }

    public void listarDirectos(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Directo){
                System.out.println(empleado.toString() + "- Salario a pagar: " + empleado.calcularSalario() + "- Tipo: Directo");
            }
        });
    }

    public void listarFreelance(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Freelance){
                System.out.println(empleado.toString() + "- Salario a pagar: " + empleado.calcularSalario() + "- Tipo: Freelance");
            }
        });
    }

    public void listarPromotores(){
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor){
                System.out.println(empleado.toString() + "- Salario a pagar: " + empleado.calcularSalario() + "- Tipo: Promotor");
            }
        });
    }
}
