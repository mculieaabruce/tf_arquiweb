package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.entities.policia;

import java.time.LocalDate;

public class casoXpoliciaDTO {
    private caso caso;
    private policia policia;
    private LocalDate fecha_revision;
    private String estado;

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
