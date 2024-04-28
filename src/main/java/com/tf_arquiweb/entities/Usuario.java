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
    private String username;

    @Column(name = "contraseña",nullable = false,length = 45)
    private String password;

    private Boolean enabled;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    @OneToMany
    @JoinColumn(name = "autor_id")
    private List<publicacion> publis;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, Boolean enabled, List<Role> roles, List<publicacion> publis) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
        this.publis = publis;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<publicacion> getPublis() {
        return publis;
    }

    public void setPublis(List<publicacion> publis) {
        this.publis = publis;
    }
}
