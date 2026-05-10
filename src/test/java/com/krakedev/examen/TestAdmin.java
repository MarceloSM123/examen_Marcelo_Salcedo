package com.krakedev.examen;

import com.krakedev.examen.entidades.AdminVentas;
import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

public class TestAdmin {
	public static void main(String[] args) {
        AdminVentas admin = new AdminVentas();
        
        Vendedor v1 = new Vendedor("1111111111");
        v1.setNumeroVentas(10);
        v1.setSueldoFijo(1000.0);
        
        VendedorComision v2 = new VendedorComision("2222222222");
        v2.setNumeroVentas(15);
        v2.setComisionPorVenta(100.0);
        
        VendedorMixto v3 = new VendedorMixto("3333333333");
        v3.setNumeroVentas(20);
        v3.setSueldoFijo(1200.0);
        
        admin.agregar(v1);
        admin.agregar(v2);
        admin.agregar(v3);
        
        System.out.println("Sueldo vendedor 1111111111: " + admin.calcularSueldo("1111111111"));
        System.out.println("Sueldo vendedor 2222222222: " + admin.calcularSueldo("2222222222"));
        System.out.println("Sueldo vendedor 3333333333: " + admin.calcularSueldo("3333333333"));
        System.out.println("Sueldo cédula inexistente: " + admin.calcularSueldo("9999999999"));
    }
}
