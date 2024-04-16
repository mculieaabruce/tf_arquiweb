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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreForo;
    }

    public void setNombre(String nombre) {
        this.nombreForo = nombre;
    }
}
