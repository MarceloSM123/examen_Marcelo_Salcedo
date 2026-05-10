package com.krakedev.examen;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorComision;

import static org.junit.jupiter.api.Assertions.*;

public class VendedorComisionJunitTest {
	 @Test
	    public void testCalcularSueldo() {
	        VendedorComision vendedor = new VendedorComision("1234567890","C");
	        vendedor.setNumeroVentas(10);
	        vendedor.setComisionPorVenta(50.0);
	        double expected = 500.0;
	        double actual = vendedor.calcularSueldo();
	        assertEquals(expected, actual, 0.001);
	    }
}
