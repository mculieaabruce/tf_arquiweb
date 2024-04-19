package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.Usuario;
import jakarta.persistence.*;

public class RoleDTO {
    private int id;
    private String rol;
    private Usuario user;

    public int getId() {return id;
    }
    public void setId(int id) {this.id = id;}

    public String getRol() {return rol;}

    public void setRol(String rol) {this.rol = rol;}

    public Usuario getUser() {return user;}

    public void setUser(Usuario user) {this.user = user;}
}
