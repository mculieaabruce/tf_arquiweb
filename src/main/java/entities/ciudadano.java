package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ciudadano")
public class ciudadano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "DNI",nullable = false,length = 8)
    private String dni;
    @Column(name = "Nombre",nullable = false,length = 15)
    private String nombre;
    @Column(name = "Apellido",nullable = false,length = 15)
    private String apellido;
    @Column(name = "FechaNacimiento",nullable = false)
    private LocalDate fecha_nac;

    public ciudadano(){}

    public ciudadano(int id, String dni, String nombre, String apellido, LocalDate fecha_nac){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
