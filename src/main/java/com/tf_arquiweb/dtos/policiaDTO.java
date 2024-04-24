package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.Comisaria;
import com.tf_arquiweb.entities.horario;

public class policiaDTO {
    private int id;
    private String nombre;
    private String apellido;
    private String num_placa;
    private Comisaria comisaria;
    private horario horario;

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
