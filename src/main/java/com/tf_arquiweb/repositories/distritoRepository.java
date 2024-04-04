package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface distritoRepository extends JpaRepository<distrito, Integer> {

}

