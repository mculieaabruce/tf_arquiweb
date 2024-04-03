package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity

public class respuesta {
@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="contenido", nullable = false, length = 250)
    private String contenido;
    @Column(name="fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;
    @Column(name="hora_creacion", nullable = false)
    private LocalTime hora_creacion;
    @Column(name="autor_resp", nullable = false , length =20 )
    private String autor_resp;
    public respuesta(){

    }
    public respuesta(int id, String contenido, LocalDate fecha_creacion, LocalTime hora){
        this.id=id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
        this.hora_creacion= hora_creacion;
        this.autor_resp=autor_resp;
    }

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
