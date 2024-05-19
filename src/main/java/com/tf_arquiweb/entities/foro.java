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
    private Users user;

    public foro() {
    }

    public foro(int id, String nombreForo, Users user) {
        this.id = id;
        this.nombreForo = nombreForo;
        this.user = user;
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

    public Users getUsuario() {
        return user;
    }

    public void setUsuario(Users user) {
        this.user = user;
    }
}
