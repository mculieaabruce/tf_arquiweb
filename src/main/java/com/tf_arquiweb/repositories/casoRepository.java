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
            "count(ca.id) as cantidad_de_casos \n" +
            "from caso ca \n" +
            "inner join \n" +
            "alerta_movil m on \n" +
            "cs.alerta_movil_id = m.id \n" +
            "inner join \n" +
            "ciudadano ci on \n" +
            "m.ciudadano_id = ci.id \n" +
            "group by m.ciudadano_id \n", nativeQuery = true)
    public List<String[]> ciudadanoxcaso();
    @Query(value = "SELECT d.nombre, count(c.id) from caso as c \n " +
            "join caso_xpolicia as casopolicia on c.id = casopolicia.caso_id \n " +
            "join policia as p on casopolicia.policia_id = p.id \n " +
            "join comisaria as k on k.id_comisaria = p.comisaria_id \n " +
            "join distrito as d on d.id = k.distrito_id \n " +
            "group by d.nombre",nativeQuery = true)

    List<String[]> findCasosPorDistritoId();

    @Query(value ="SELECT d.nombre AS distrito, COUNT(c.id) AS casos_resueltos \n" +
            "FROM caso AS c\n" +
            "JOIN caso_xpolicia AS casopolicia ON c.id = casopolicia.caso_id\n" +
            "JOIN policia AS p ON casopolicia.policia_id = p.id\n" +
            "JOIN comisaria AS k ON k.id_comisaria = p.comisaria_id\n" +
            "JOIN distrito AS d ON d.id = k.distrito_id\n" +
            "WHERE c.estado = 'resuelto'  -- Añade esta condición para casos resueltos\n" +
            "GROUP BY d.nombre;" ,nativeQuery = true)

    List<String[]> findCasosResueltosPorDistrito();
}
