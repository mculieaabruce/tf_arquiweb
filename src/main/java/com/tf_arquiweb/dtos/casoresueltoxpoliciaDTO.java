package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.entities.policia;

import java.time.LocalDate;

public class casoresueltoxpoliciaDTO {
    private String caso;
    private String policia;
    private String estado;

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
