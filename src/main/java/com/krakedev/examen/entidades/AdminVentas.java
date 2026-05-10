package com.krakedev.examen.entidades;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class AdminVentas {
	
private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    
    public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
    
    public Double calcularSueldo(String cedula) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                return vendedor.calcularSueldo();
            }
        }
        return null;
    }
    
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
}
