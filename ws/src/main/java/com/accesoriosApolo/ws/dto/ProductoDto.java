package com.accesoriosApolo.ws.dto;

public class ProductoDto {

    private String referencia;
    private String nombre;
    private String descripcion;
    private String talla;
    private int stock;
    private float precio_unitario;
    private float peso_unidad;
    private String ficha_tecnica;
    private int descuento;
    private float precio_descuento;
    private int fk_categoria;

    public ProductoDto(){

    }

    public ProductoDto(String referencia, String nombre, String descripcion, String talla, int stock, float precio_unitario, float peso_unidad, String ficha_tecnica, int descuento, float precio_descuento, int fk_categoria) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.talla = talla;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.peso_unidad = peso_unidad;
        this.ficha_tecnica = ficha_tecnica;
        this.descuento = descuento;
        this.precio_descuento = precio_descuento;
        this.fk_categoria = fk_categoria;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPeso_unidad() {
        return peso_unidad;
    }

    public void setPeso_unidad(float peso_unidad) {
        this.peso_unidad = peso_unidad;
    }

    public String getFicha_tecnica() {
        return ficha_tecnica;
    }

    public void setFicha_tecnica(String ficha_tecnica) {
        this.ficha_tecnica = ficha_tecnica;
    }

    public float getPrecio_descuento() {
        return precio_descuento;
    }

    public void setPrecio_descuento(float precio_descuento) {
        this.precio_descuento = precio_descuento;
    }

    public int getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(int fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
