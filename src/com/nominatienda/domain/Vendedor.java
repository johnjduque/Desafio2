package com.nominatienda.domain;

public class Vendedor extends Directo{
    private static final long TOPE_BAJO_SALARIO = 999999;
    private static final long TOPE_ALTO_SALARIO = 1000000;
    private static final double PORCENTAJE_ALTO_COMISION = 4;
    private static final double PORCENTAJE_BAJO_COMISION = 3.5;
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        long comision = 0;
        if (getSalario() <= TOPE_BAJO_SALARIO){
            comision = (long) (ventasDelMes * (PORCENTAJE_ALTO_COMISION / 100));
            return comision;
        }
        else {
            comision = (long) (ventasDelMes * (PORCENTAJE_BAJO_COMISION / 100));
            return comision;
        }
    }

    @Override
    public long calcularSalud() {
        long deduccionSalud = (long) (getSalario() * (getPorcentajeDeduccionSalud() / 100));
        return deduccionSalud;
    }

    @Override
    public long calcularPension() {
        long deduccionPension = (long) (getSalario() * (getPorcentajeDeduccionPension() / 100));
        return deduccionPension;
    }

    @Override
    public long calcularSalario() {
        long salarioAPagar = (getSalario() + calcularComision()) - (calcularSalud() + calcularPension());
        return salarioAPagar;
    }


    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    public static long getTopeBajoSalario() {
        return TOPE_BAJO_SALARIO;
    }

    public static long getTopeAltoSalario() {
        return TOPE_ALTO_SALARIO;
    }

    public static double getPorcentajeAltoComision() {
        return PORCENTAJE_ALTO_COMISION;
    }

    public static double getPorcentajeBajoComision() {
        return PORCENTAJE_BAJO_COMISION;
    }
}
