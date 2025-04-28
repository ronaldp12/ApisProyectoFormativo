package com.accesoriosApolo.ws.dto;

public class ProveedorDto {

    private String nit;
    private String nombre;
    private String empresa;
    private String correo;
    private String telefono;
    private String estado;
    private String direccion;

    public ProveedorDto() {
    }

    public ProveedorDto(String nit, String nombre, String empresa, String correo, String telefono, String estado, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.empresa = empresa;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
