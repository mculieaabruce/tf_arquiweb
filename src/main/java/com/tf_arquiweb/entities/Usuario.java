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

    private Boolean enabled;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreusuario, String rol_usuario, List<Role> roles) {
        this.idUsuario = idUsuario;
        this.nombreusuario = nombreusuario;
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

    public Boolean getEnabled() {return enabled;}

    public void setEnabled(Boolean enabled) {this.enabled = enabled;}
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
