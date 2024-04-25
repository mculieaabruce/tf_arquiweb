package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.alertaMovil;
import com.tf_arquiweb.entities.foro;

public class casoDTO {
    private int id;
    private alertaMovil alertaMovil;
    private String estado;
    private String comentario;
    private foro foro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.tf_arquiweb.entities.alertaMovil getAlertaMovil() {
        return alertaMovil;
    }

    public void setAlertaMovil(com.tf_arquiweb.entities.alertaMovil alertaMovil) {
        this.alertaMovil = alertaMovil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public com.tf_arquiweb.entities.foro getForo() {
        return foro;
    }

    public void setForo(com.tf_arquiweb.entities.foro foro) {
        this.foro = foro;
    }
}
