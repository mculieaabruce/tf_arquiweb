package com.tf_arquiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.tf_arquiweb.entities.publicacion;

import java.util.List;

@Repository
public interface publicacionRepository extends JpaRepository<publicacion, Integer> {
        @Query(value = "SELECT u.id_usuario, COUNT(*) AS cantidad_publicaciones\n" +
                "FROM usuario u\n" +
                "JOIN publicacion p ON u.id_usuario = p.autor_id\n" +
                "JOIN roles r ON p.autor_id = r.user_id\n" +
                "WHERE r.rol ='ciudadano'\n" +
                "GROUP BY u.id_usuario;", nativeQuery = true)
            public List<String[]> publixCiudadano();
}
