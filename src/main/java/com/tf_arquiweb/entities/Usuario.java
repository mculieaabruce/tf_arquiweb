package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombre",nullable = false,length = 45)
    private String nombreusuario;
    @Column(name="rolusuario",nullable = false,length = 30)
    private String rol_usuario;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreusuario, String rol_usuario, List<Role> roles) {
        this.idUsuario = idUsuario;
        this.nombreusuario = nombreusuario;
        this.rol_usuario = rol_usuario;
        this.roles = roles;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getRol_usuario() {
        return rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
