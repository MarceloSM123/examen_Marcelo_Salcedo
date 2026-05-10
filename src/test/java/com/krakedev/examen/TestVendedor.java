package com.krakedev.examen;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedor {
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("1234567890","V");
		vendedor.setSueldoFijo(1000.0);
		vendedor.setNumeroVentas(5);
		vendedor.setComisionPorVenta(50.0);
		vendedor.setTipo("V");

		System.out.println(vendedor.toString());
	}
}
