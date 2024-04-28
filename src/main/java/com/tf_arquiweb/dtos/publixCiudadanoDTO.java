package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.publicacion;

public class publixCiudadanoDTO {
    private int IdUsuario;
    private int quantityPubli;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getQuantityPubli() {
        return quantityPubli;
    }

    public void setQuantityPubli(int quantityPubli) {
        this.quantityPubli = quantityPubli;
    }
}
