package com.krakedev.examen;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorMixto;

import static org.junit.jupiter.api.Assertions.*;

public class VendedorMixtoTestJunit {
	@Test
	public void testCalcularSueldo() {
		VendedorMixto vendedor = new VendedorMixto("1234567890");
		vendedor.setSueldoFijo(1000.0);
		vendedor.setNumeroVentas(5);
		double expected = 1050.0;
		double actual = vendedor.calcularSueldo();
		assertEquals(expected, actual, 0.001);
	}
}
