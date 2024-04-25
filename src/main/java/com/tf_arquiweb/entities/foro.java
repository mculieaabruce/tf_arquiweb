package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "foro")
public class foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreForo;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public foro() {
    }

    public foro(int id, String nombreForo, Usuario usuario) {
        this.id = id;
        this.nombreForo = nombreForo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreForo() {
        return nombreForo;
    }

    public void setNombreForo(String nombreForo) {
        this.nombreForo = nombreForo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
