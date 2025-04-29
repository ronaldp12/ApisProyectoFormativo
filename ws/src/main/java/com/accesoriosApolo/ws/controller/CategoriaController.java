package com.accesoriosApolo.ws.controller;

import com.accesoriosApolo.ws.dto.CategoriaDto;
import com.accesoriosApolo.ws.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoriaPorId(@PathVariable int id) {
        CategoriaDto categoriaDto = categoriaService.obtenerCategoriaPorId(id);
        if (categoriaDto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Categoría no encontrada para el ID: " + id);
        }
        return ResponseEntity.ok(categoriaDto);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<CategoriaDto>> getCategorias() {
        List<CategoriaDto> categorias = categoriaService.obtenerListaCategorias();
        if (categorias.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categorias);
    }

    @PostMapping("/registrar")
    public ResponseEntity<CategoriaDto> registrarCategoria(@RequestBody CategoriaDto categoriaDto) {
        CategoriaDto nuevaCategoria = categoriaService.registrarCategoria(categoriaDto);
        if (nuevaCategoria != null) {
            return ResponseEntity.ok(nuevaCategoria);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarCategoria(@RequestBody CategoriaDto categoriaDto) {
        CategoriaDto categoriaActualizada = categoriaService.actualizarCategoria(categoriaDto);
        if (categoriaActualizada == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró la categoría para actualizar.");
        }
        return ResponseEntity.ok(categoriaActualizada);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarCategoria(@PathVariable int id) {
        boolean eliminado = categoriaService.eliminarCategoria(id);
        if (eliminado) {
            return ResponseEntity.ok("Categoría eliminada exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró la categoría para eliminar.");
        }
    }
}
