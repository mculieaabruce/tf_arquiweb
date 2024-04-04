package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface horarioRepository extends JpaRepository<horario, Integer> {

}

