package com.tf_arquiweb.entities;

import jakarta.persistence.*;
/*xddd*/
@Entity
@Table(name = "caso")
public class caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "alertaMovil_id")
    private alertaMovil alertaMovil;
    @Column(name = "estado",nullable = false,length = 15)
    private String estado;
    @Column(name = "comentario",nullable = false,length = 100)
    private String comentario;
    @ManyToOne
    @JoinColumn(name = "foro_id")
    private foro foro;

    public caso() {
    }

    public caso(int id, com.tf_arquiweb.entities.alertaMovil alertaMovil, String estado, String comentario, com.tf_arquiweb.entities.foro foro) {
        this.id = id;
        this.alertaMovil = alertaMovil;
        this.estado = estado;
        this.comentario = comentario;
        this.foro = foro;
    }

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

    /*xsd*/
}
