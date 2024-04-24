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

}
