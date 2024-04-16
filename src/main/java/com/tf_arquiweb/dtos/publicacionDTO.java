package com.tf_arquiweb.dtos;



import com.tf_arquiweb.entities.foro;

import java.time.LocalDate;
import java.time.LocalTime;

public class publicacionDTO {
    private int id;
    private String descripcion;
    private LocalDate fecha_creacion;
    private LocalTime hora_creacion;
    private String autor_publi ;
    private String estado;
    private foro foro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalTime getHora_creacion() {
        return hora_creacion;
    }

    public void setHora_creacion(LocalTime hora_creacion) {
        this.hora_creacion = hora_creacion;
    }

    public String getAutor_publi() {
        return autor_publi;
    }

    public void setAutor_publi(String autor_publi) {
        this.autor_publi = autor_publi;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public com.tf_arquiweb.entities.foro getForo() {
        return foro;
    }

    public void setForo(com.tf_arquiweb.entities.foro foro) {
        this.foro = foro;
    }
}
