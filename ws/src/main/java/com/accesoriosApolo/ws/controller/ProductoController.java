package com.accesoriosApolo.ws.controller;

import com.accesoriosApolo.ws.dto.ProductoDto;
import com.accesoriosApolo.ws.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService=productoService;
    }

    @GetMapping("productos/{id}")
    public ResponseEntity<?> getproductoReferencia(@PathVariable("referencia") String referencia){
        if (referencia == null || referencia.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("El parámetro 'referencia' es obligatorio.");
        }
        ProductoDto productoDto = productoService.obtenerProdutoPorReferencia(referencia);
        if (productoDto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Producto no encontrado para la referencia: " + referencia);
        }
        return ResponseEntity.ok(productoDto);
    }
}
