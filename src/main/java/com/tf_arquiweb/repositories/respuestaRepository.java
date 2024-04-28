package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface respuestaRepository extends JpaRepository<respuesta, Integer> {
    @Query(value = "SELECT u.id_usuario, COUNT(*) AS cantidad_respuestas\n" +
            "FROM usuario u \n" +
            "JOIN respuesta r ON u.id_usuario = r.autor_id\n" +
            "JOIN roles ro ON r.autor_id = ro.user_id \n" +
            "WHERE ro.rol ='policia' \n" +
            "GROUP BY u.id_usuario",nativeQuery = true)
    public List<String[]> listrespuestaxpolicia();
}

