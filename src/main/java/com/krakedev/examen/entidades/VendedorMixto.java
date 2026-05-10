package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor {
	public VendedorMixto(String cedula, String tipo) {
        super(cedula, tipo);
    }
    
    
    @Override
    public double calcularSueldo() {
        
        return getSueldoFijo() + (getSueldoFijo() * 0.01 * getNumeroVentas());
    }
}
