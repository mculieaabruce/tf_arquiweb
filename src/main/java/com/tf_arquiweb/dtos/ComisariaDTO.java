package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.distrito;

public class ComisariaDTO {
    private int idComisaria;
    private String Nombre;
    private String Division;
    private distrito Distrito;

    public int getIdComisaria() {
        return idComisaria;
    }

    public void setIdComisaria(int idComisaria) {
        this.idComisaria = idComisaria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public distrito getDistrito() {
        return Distrito;
    }

    public void setDistrito(distrito distrito) {
        Distrito = distrito;
    }
}
