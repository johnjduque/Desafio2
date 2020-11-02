package com.nominatienda.domain;

public class Freelance extends Empleado {
    private long valorHora;
    private int horasTrabajadas;

    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        long salarioAPagar = valorHora * horasTrabajadas;
        return salarioAPagar;
    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
