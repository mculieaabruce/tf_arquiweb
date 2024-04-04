package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface respuestaRepository extends JpaRepository<respuesta, Integer> {

}

