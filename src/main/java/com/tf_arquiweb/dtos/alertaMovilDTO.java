package com.tf_arquiweb.dtos;

import com.tf_arquiweb.entities.Ciudadano;

import java.time.LocalDate;
import java.time.LocalTime;

public class alertaMovilDTO {
    private int id;
    private String mensaje;
    private String ubicacion;
    private String comentario;
    private Ciudadano ciudadano;
    private LocalDate fecha_alerta;
    private LocalTime hora_alerta;
}
