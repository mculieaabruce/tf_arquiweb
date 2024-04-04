package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "distrito")
public class distrito {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre", nullable = false, length = 20)
    private String nombre;
    @Column(name="ubigeo", nullable = false, length =10 )
    private String ubigeo;
    @Column(name="codigo_postal", nullable = false, length =15 )
    private String codigo_postal;
    public distrito(){

    }
    public distrito(int id, String nombre, String ubigeo, String codigo_postal){
        this.id=id;
        this.nombre = nombre;
        this.ubigeo = ubigeo;
        this.codigo_postal= codigo_postal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}
