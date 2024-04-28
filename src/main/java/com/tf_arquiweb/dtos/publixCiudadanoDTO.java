package com.tf_arquiweb.dtos;

public class publixCiudadanoDTO {
    private int IdUsuario;
    private int quantityPubli;

    public int getIdUsuario(int i) {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getQuantityPubli(int i) {
        return quantityPubli;
    }

    public void setQuantityPubli(int quantityPubli) {
        this.quantityPubli = quantityPubli;
    }
}
