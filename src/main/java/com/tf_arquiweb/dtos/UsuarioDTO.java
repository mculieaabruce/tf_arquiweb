package com.tf_arquiweb.dtos;

import jakarta.persistence.Column;

public class UsuarioDTO {
    private int idUsuario;
    private String username;
    private Boolean enabled;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreusuario() {
        return username;
    }

    public void setNombreusuario(String nombreusuario) {
        this.username = nombreusuario;
    }

    public Boolean getEnabled() {return enabled;}

    public void setEnabled(Boolean enabled) {this.enabled = enabled;}
}
