package com.tf_arquiweb.dtos;

public class ciudadanoXcasoDTO {
    public String nombre;
    public Integer cantidad_de_casos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad_de_casos() {
        return cantidad_de_casos;
    }

    public void setCantidad_de_casos(Integer cantidad_de_casos) {
        this.cantidad_de_casos = cantidad_de_casos;
    }
}
