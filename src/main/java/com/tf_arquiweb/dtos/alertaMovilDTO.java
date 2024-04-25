package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.Ciudadano;

import java.time.LocalDate;
import java.time.LocalTime;

public class alertaMovilDTO {
    private int id;
    private String mensaje;
    private String ubicacion;
    private String comentario;
    private Ciudadano ciudadano;
    private LocalDate fecha_alerta;
    private LocalTime hora_alerta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public LocalDate getFecha_alerta() {
        return fecha_alerta;
    }

    public void setFecha_alerta(LocalDate fecha_alerta) {
        this.fecha_alerta = fecha_alerta;
    }

    public LocalTime getHora_alerta() {
        return hora_alerta;
    }

    public void setHora_alerta(LocalTime hora_alerta) {
        this.hora_alerta = hora_alerta;
    }
}
