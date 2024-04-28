package com.tf_arquiweb.dtos;

public class alertaCiudadanoUbiDTO {
    private int ciudadanoId;
    private int cantidadAlertas;
    private String ubicacion;

    public int getCiudadanoId(int i) {
        return ciudadanoId;
    }

    public void setCiudadanoId(int ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public int getCantidadAlertas(int i) {
        return cantidadAlertas;
    }

    public void setCantidadAlertas(int cantidadAlertas) {
        this.cantidadAlertas = cantidadAlertas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
