package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "respuestaXpublicacion")
public class respuestaXpublicacion {
    @org.springframework.data.annotation.Id
    @ManyToOne
    @JoinColumn(name = "respuesta_id")
    private respuesta respuesta;
    @Id
    @ManyToOne
    @JoinColumn(name = "publicacion_id")
    private publicacion publicacion;
    @Column(name = "titulo",nullable = false,length = 40)
    private String titulo;
}
