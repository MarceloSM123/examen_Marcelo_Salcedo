package com.krakedev.examen;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.Vendedor;

import static org.junit.jupiter.api.Assertions.*;

public class VendedorTestJunit {
	 @Test
	    public void testCalcularSueldo() {
	        Vendedor vendedor = new Vendedor("1234567890","V");
	        vendedor.setSueldoFijo(1500.0);
	        double expected = 1500.0;
	        double actual = vendedor.calcularSueldo();
	        assertEquals(expected, actual, 0.001);
	    }
}
