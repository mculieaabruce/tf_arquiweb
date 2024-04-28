package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.alertaMovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface alertaMovilRepository extends JpaRepository<alertaMovil, Integer> {
    @Query(value = "SELECT ciudadano_id, COUNT(*) AS cantidad_alertas\n" +
            "FROM alerta_movil\n" +
            "WHERE ubicacion = 'Nombre del Distrito'\n" +
            "GROUP BY ciudadano_id;" , nativeQuery = true)
    public List<String[]> AlertasxCiudadanoxDistrito();
}
