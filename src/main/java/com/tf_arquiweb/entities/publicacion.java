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
    @Column(name = "autor_publi", nullable = false)
    private String autor_publi ;
    @Column(name="estado",nullable = false,length = 15)
    private String estado;
    @ManyToOne
    @JoinColumn(name="foro_id")
    private  foro foro;

    public publicacion() {
    }

    public publicacion(int id, String descripcion, LocalDate fecha_creacion, LocalTime hora_creacion, String autor_publi, String estado, com.tf_arquiweb.entities.foro foro) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.hora_creacion = hora_creacion;
        this.autor_publi = autor_publi;
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
