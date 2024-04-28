package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.entities.distrito;
public class casoXdistritoDTO {

    private String distrito;

    private Integer numero_de_casos;

    private Integer casos_resueltos;


    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getNumero_de_casos() {
        return numero_de_casos;
    }

    public void setNumero_de_casos(Integer numero_de_casos) {
        this.numero_de_casos = numero_de_casos;
    }

    public Integer getCasos_resueltos() {
        return casos_resueltos;
    }

    public void setCasos_resueltos(Integer casos_resueltos) {
        this.casos_resueltos = casos_resueltos;
    }
}
