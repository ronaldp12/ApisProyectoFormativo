package com.accesoriosApolo.ws.dao;

import com.accesoriosApolo.ws.dto.CategoriaDto;
import com.accesoriosApolo.ws.util.CategoriaUtilidades;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CategoriaDao {

    public CategoriaDao() {
        CategoriaUtilidades.iniciarLista();
    }

    public static CategoriaDto consultarCategoriaPorId(int idCategoria) {
        for (CategoriaDto c : CategoriaUtilidades.listaCategorias) {
            if (c.getId_categoria() == idCategoria) {
                return c;
            }
        }
        return null;
    }

    public List<CategoriaDto> obtenerListaCategorias() {
        return CategoriaUtilidades.listaCategorias;
    }

    public CategoriaDto registrarCategoria(CategoriaDto categoriaDto) {
        for (CategoriaDto c : CategoriaUtilidades.listaCategorias) {
            if (c.getId_categoria() == categoriaDto.getId_categoria()) {
                return null;
            }
        }
        CategoriaUtilidades.listaCategorias.add(categoriaDto);
        return categoriaDto;
    }

    public CategoriaDto actualizarCategoria(CategoriaDto categoriaDto) {
        for (CategoriaDto c : CategoriaUtilidades.listaCategorias) {
            if (c.getId_categoria() == categoriaDto.getId_categoria()) {
                c.setNombre_categoria(categoriaDto.getNombre_categoria());
                c.setDescripcion(categoriaDto.getDescripcion());
                c.setPromociones(categoriaDto.getPromociones());
                c.setSubcategorias(categoriaDto.getSubcategorias());
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCategoria(int idCategoria) {
        for (int i = 0; i < CategoriaUtilidades.listaCategorias.size(); i++) {
            if (CategoriaUtilidades.listaCategorias.get(i).getId_categoria() == idCategoria) {
                CategoriaUtilidades.listaCategorias.remove(i);
                return true;
            }
        }
        return false;
    }
}
