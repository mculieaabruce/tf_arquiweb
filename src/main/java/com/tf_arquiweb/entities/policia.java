package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "policia")
public class policia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",nullable = false,length = 15)
    private String nombre;
    @Column(name = "nombre",nullable = false,length = 20)
    private String apellido;
    @Column(name = "nombre",nullable = false,length = 10)
    private String num_placa;
    @ManyToOne
    @JoinColumn(name = "comisaria_id")
    private Comisaria comisaria;
    @ManyToOne
    @JoinColumn(name = "horario_id")
    private horario horario;

    public policia(int id, String nombre, String apellido, String num_placa, Comisaria comisaria, com.tf_arquiweb.entities.horario horario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_placa = num_placa;
        this.comisaria = comisaria;
        this.horario = horario;
    }

    public policia() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_placa() {
        return num_placa;
    }

    public void setNum_placa(String num_placa) {
        this.num_placa = num_placa;
    }

    public Comisaria getComisaria() {
        return comisaria;
    }

    public void setComisaria(Comisaria comisaria) {
        this.comisaria = comisaria;
    }

    public com.tf_arquiweb.entities.horario getHorario() {
        return horario;
    }

    public void setHorario(com.tf_arquiweb.entities.horario horario) {
        this.horario = horario;
    }
}
