package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.entities.distrito;
public class casoXdistritoDTO {

private int ncaso;
private String nomDistrito;

    public int getNcaso() {
        return ncaso;
    }

    public void setNcaso(int ncaso) {
        this.ncaso = ncaso;
    }

    public String getNomDistrito() {
        return nomDistrito;
    }

    public void setNomDistrito(String nomDistrito) {
        this.nomDistrito = nomDistrito;
    }
}
