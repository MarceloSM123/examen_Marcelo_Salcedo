package com.krakedev.examen.controlador;

import com.krakedev.examen.entidades.AdminVentas;
import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
    
private AdminVentas adminVentas = new AdminVentas();
@PostMapping("/agregar")
public ResponseEntity<String> agregarVendedor(@RequestBody Vendedor vendedor) {
    String tipo = vendedor.getTipo();
    Vendedor nuevoVendedor = null;
    
    if ("V".equals(tipo)) {
        nuevoVendedor = new Vendedor(vendedor.getCedula(), tipo);
        nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
        nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
        nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());
    } else if ("C".equals(tipo)) {
        nuevoVendedor = new VendedorComision(vendedor.getCedula(), tipo);
        nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
        nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());
    } else if ("M".equals(tipo)) {
        nuevoVendedor = new VendedorMixto(vendedor.getCedula(), tipo);
        nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
        nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
    }
    
    adminVentas.agregar(nuevoVendedor);
    return ResponseEntity.status(HttpStatus.CREATED).body("Vendedor agregado exitosamente");
}

@GetMapping("/calcularSueldo/{cedula}")
public ResponseEntity<Double> calcularSueldoVendedor(@PathVariable String cedula) {
    Double sueldo = adminVentas.calcularSueldo(cedula);
    return ResponseEntity.ok(sueldo);
}
}
