package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface casoRepository extends JpaRepository<caso, Integer> {
    @Query(value = "select \n" +
            "ci.nombre,\n" +
            "\tcount(caso_id) as cantidad_de_casos\n" +
            "from caso ca \n" +
            "inner join \n" +
            "alerta_movil m on \n" +
            "cs.alerta_movil_id = m.id \n" +
            "inner join\n" +
            "ciudadano ci on \n" +
            "m.ciudadano_id = ci.id\n" +
            "group by m.ciudadano_id\n" +
            "from green_area ga \n" +
            "inner join Maintenance m on ga.id_green_area = m.greenarea_id \n" +
            "group by ga.name_green_area", nativeQuery = true)
    public List<String[]> ciudadanoxcaso();
}
