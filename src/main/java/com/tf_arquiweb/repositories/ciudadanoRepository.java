package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ciudadanoRepository extends JpaRepository<Ciudadano, Integer> {

}

