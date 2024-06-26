package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "respuesta")
public class respuesta {
@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="contenido", nullable = false, length = 250)
    private String contenido;
    @Column(name="fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;
    @Column(name="hora_creacion", nullable = false)
    private LocalTime hora_creacion;

    @ManyToOne
    @JoinColumn(name="autor_id", nullable = false )
    private Users user;
    public respuesta(){
    }

    public respuesta(int id, String contenido, LocalDate fecha_creacion, LocalTime hora_creacion, Users user) {
        this.id = id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
        this.hora_creacion = hora_creacion;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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

    public Users getUsuario() {
        return user;
    }

    public void setUsuario(Users user) {
        this.user = user;
    }
}
