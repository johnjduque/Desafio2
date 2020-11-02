package com.nominatienda.domain;

public class Promotor extends Empleado {
    private static final long VALOR_COMISION_COMPRA_VOLANTE = 15000;
    private int volatesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volatesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volatesRepartidos = volatesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        long pagoPorVolantes = valorVolante * volatesRepartidos;
        long pagoPorCompraConVolante = VALOR_COMISION_COMPRA_VOLANTE * comprasVolante;
        long salarioAPagar = pagoPorVolantes + pagoPorCompraConVolante;
        return salarioAPagar;
    }

    public int getVolatesRepartidos() {
        return volatesRepartidos;
    }

    public void setVolatesRepartidos(int volatesRepartidos) {
        this.volatesRepartidos = volatesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

    public static long getValorComisionCompraVolante() {
        return VALOR_COMISION_COMPRA_VOLANTE;
    }
}
