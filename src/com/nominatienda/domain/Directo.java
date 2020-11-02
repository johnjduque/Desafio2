package com.nominatienda.domain;

public class Directo extends Empleado {
    private static final double PORCENTAJE_DEDUCCION_SALUD = 5;
    private static final double PORCENTAJE_DEDUCCION_PENSION = 6.5;
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud(){
        long deduccionSalud = (long) (salario * (PORCENTAJE_DEDUCCION_SALUD / 100));
        return deduccionSalud;
    }

    public long calcularPension(){
        long deduccionPension = (long) (salario * (PORCENTAJE_DEDUCCION_PENSION / 100));
        return deduccionPension;
    }

    @Override
    public long calcularSalario() {
        long salarioAPagar = salario - (calcularSalud() + calcularPension());
        return salarioAPagar;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public static double getPorcentajeDeduccionSalud() {
        return PORCENTAJE_DEDUCCION_SALUD;
    }

    public static double getPorcentajeDeduccionPension() {
        return PORCENTAJE_DEDUCCION_PENSION;
    }
}
