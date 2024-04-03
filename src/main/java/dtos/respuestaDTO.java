package dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalTime;

public class respuestaDTO {
    private int id;


    private String contenido;

    private LocalDate fecha_creacion;

    private LocalTime hora_creacion;

    private String autor_resp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalTime getHora_creacion() {
        return hora_creacion;
    }

    public void setHora_creacion(LocalTime hora_creacion) {
        this.hora_creacion = hora_creacion;
    }

    public String getAutor_resp() {
        return autor_resp;
    }

    public void setAutor_resp(String autor_resp) {
        this.autor_resp = autor_resp;
    }
}
.