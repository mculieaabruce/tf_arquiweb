package com.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "foro")
public class foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
}
