package com.accesoriosApolo.ws.dto;

import java.util.Date;

public class CalcomaniaDto {
    private int id_calcomania;
    private String nombre;
    private Date fecha_subida;
    private String formato;
    private String url_archivo;
    private String tamaño_archivo;
    private int fk_cedula;


    public CalcomaniaDto() {
    }

    public CalcomaniaDto(int id_calcomania, String nombre, Date fecha_subida, String formato, String url_archivo, String tamaño_archivo, int fk_cedula) {
        this.id_calcomania = id_calcomania;
        this.nombre = nombre;
        this.fecha_subida = fecha_subida;
        this.formato = formato;
        this.url_archivo = url_archivo;
        this.tamaño_archivo = tamaño_archivo;
        this.fk_cedula = fk_cedula;
    }

    public int getId_calcomania() {
        return id_calcomania;
    }
    public void setId_calcomania(int id_calcomania) {
        this.id_calcomania = id_calcomania;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha_subida() {
        return fecha_subida;
    }
    public void setFecha_subida(Date fecha_subida) {
        this.fecha_subida = fecha_subida;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getUrl_archivo() {
        return url_archivo;
    }
    public void setUrl_archivo(String url_archivo) {
        this.url_archivo = url_archivo;
    }
    public String getTamaño_archivo() {
        return tamaño_archivo;
    }
    public void setTamaño_archivo(String tamaño_archivo) {
        this.tamaño_archivo = tamaño_archivo;
    }
    public int getFk_cedula() {
        return fk_cedula;
    }
    public void setFk_cedula(int fk_cedula) {
        this.fk_cedula = fk_cedula;
    }

}


