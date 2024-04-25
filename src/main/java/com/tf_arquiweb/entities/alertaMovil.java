package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "alertaMovil")
public class alertaMovil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "mensaje",nullable = false,length = 150)
    private String mensaje;
    @Column(name = "ubicacion",nullable = false,length = 20)
    private String ubicacion;
    @Column(name = "comentario",nullable = false,length = 150)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private Ciudadano ciudadano;
    private LocalDate fecha_alerta;
    private LocalTime hora_alerta;

    public alertaMovil() {
    }

    public alertaMovil(int id, String mensaje, String ubicacion, String comentario, Ciudadano ciudadano, LocalDate fecha_alerta, LocalTime hora_alerta) {
        this.id = id;
        this.mensaje = mensaje;
        this.ubicacion = ubicacion;
        this.comentario = comentario;
        this.ciudadano = ciudadano;
        this.fecha_alerta = fecha_alerta;
        this.hora_alerta = hora_alerta;
    }

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
