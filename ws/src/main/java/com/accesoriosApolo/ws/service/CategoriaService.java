package com.accesoriosApolo.ws.service;

import com.accesoriosApolo.ws.dao.CategoriaDao;
import com.accesoriosApolo.ws.dto.CategoriaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaDao categoriaDao;

    @Autowired
    public CategoriaService(CategoriaDao categoriaDao) {
        this.categoriaDao = categoriaDao;
    }

    public CategoriaDto obtenerCategoriaPorId(int idCategoria) {
        return categoriaDao.consultarCategoriaPorId(idCategoria);
    }

    public List<CategoriaDto> obtenerListaCategorias() {
        return categoriaDao.obtenerListaCategorias();
    }

    public CategoriaDto registrarCategoria(CategoriaDto categoriaDto) {
        return categoriaDao.registrarCategoria(categoriaDto);
    }

    public CategoriaDto actualizarCategoria(CategoriaDto categoriaDto) {
        return categoriaDao.actualizarCategoria(categoriaDto);
    }

    public boolean eliminarCategoria(int idCategoria) {
        return categoriaDao.eliminarCategoria(idCategoria);
    }
}
