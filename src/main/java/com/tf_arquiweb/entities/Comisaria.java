package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comisaria")
public class Comisaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComisaria;
    @Column(name = "nombre",nullable = false,length = 45)
    private String Nombre;
    @Column(name="Division", nullable = false, length = 60)
    private String Division;
    @ManyToOne
    @JoinColumn(name = "distrito_id")
    private distrito Distrito;

    public Comisaria() {
    }

    public Comisaria(int idComisaria, String nombre, String division, distrito distrito) {
        this.idComisaria = idComisaria;
        Nombre = nombre;
        Division = division;
        Distrito = distrito;
    }

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
