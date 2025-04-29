package com.accesoriosApolo.ws.dto;

public class CategoriaDto {

    private int id_categoria;
    private String nombre_categoria;
    private String descripcion;
    private double promociones;
    private String subcategorias;

    public CategoriaDto() {
    }

    public CategoriaDto(int id_categoria, String nombre_categoria, String descripcion, double promociones, String subcategorias) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion = descripcion;
        this.promociones = promociones;
        this.subcategorias = subcategorias;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPromociones() {
        return promociones;
    }

    public void setPromociones(double promociones) {
        this.promociones = promociones;
    }

    public String getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(String subcategorias) {
        this.subcategorias = subcategorias;
    }
}
