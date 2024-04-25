package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface casoRepository extends JpaRepository<caso, Integer> {
}
