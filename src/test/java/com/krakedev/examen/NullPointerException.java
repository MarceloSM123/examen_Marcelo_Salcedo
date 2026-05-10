package com.krakedev.examen;

import com.krakedev.examen.entidades.Vendedor;

public class NullPointerException {

	public static void main(String[] args) {
		
		Vendedor vendedor = null;
	//	vendedor.calcularSueldo();
		
		 if (vendedor != null) {
            System.out.println("Sueldo: " + vendedor.calcularSueldo());
        } else {
            System.out.println("El Vendedor es null");
        }

	}

}
