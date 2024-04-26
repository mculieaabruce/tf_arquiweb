package com.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombre",unique = true,length = 45)
    private String username;

    @Column(name = "contraseña",length = 45)
    private String password;

    private Boolean enabled;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreusuario, String rol_usuario, List<Role> roles) {
        this.idUsuario = idUsuario;
        this.username = nombreusuario;
        this.password = password;
        this.roles = roles;
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
}
