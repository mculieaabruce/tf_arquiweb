package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "publicacion")
public class publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="descripcion",nullable = false,length = 300)
    private String descripcion;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;
    @Column(name = "hora_creacion", nullable = false)
    private LocalTime hora_creacion;
    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario usuario;
    @Column(name="estado",nullable = false,length = 15)
    private String estado;
    @ManyToOne
    @JoinColumn(name="foro_id")
    private  foro foro;

    public publicacion() {
    }

    public publicacion(int id, String descripcion, LocalDate fecha_creacion, LocalTime hora_creacion, Usuario usuario, String estado, com.tf_arquiweb.entities.foro foro) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.hora_creacion = hora_creacion;
        this.usuario = usuario;
        this.estado = estado;
        this.foro = foro;
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
