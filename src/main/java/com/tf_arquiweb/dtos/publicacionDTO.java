package com.tf_arquiweb.dtos;



import com.tf_arquiweb.entities.Usuario;
import com.tf_arquiweb.entities.foro;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class publicacionDTO {
    private int id;
    private String descripcion;
    private LocalDate fecha_creacion;
    private LocalTime hora_creacion;
    private String estado;


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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
