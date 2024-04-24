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
}
