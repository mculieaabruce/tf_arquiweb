package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "casoXpolicia")
public class casoXpolicia{
    @EmbeddedId
    private Union id;

    @ManyToOne
    @MapsId("caso_id")
    private caso caso;
    @ManyToOne
    @MapsId("policia_id")
    private policia policia;
    private LocalDate fecha_revision;
    @Column(name = "estado",nullable = false,length = 20)
    private String estado;

    public casoXpolicia() {
    }

    public casoXpolicia(com.tf_arquiweb.entities.caso caso, com.tf_arquiweb.entities.policia policia, LocalDate fecha_revision, String estado) {
        this.caso = caso;
        this.policia = policia;
        this.fecha_revision = fecha_revision;
        this.estado = estado;
    }

    public com.tf_arquiweb.entities.caso getCaso() {
        return caso;
    }

    public void setCaso(com.tf_arquiweb.entities.caso caso) {
        this.caso = caso;
    }

    public com.tf_arquiweb.entities.policia getPolicia() {
        return policia;
    }

    public void setPolicia(com.tf_arquiweb.entities.policia policia) {
        this.policia = policia;
    }

    public LocalDate getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(LocalDate fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
