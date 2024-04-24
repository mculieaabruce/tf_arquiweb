package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.policia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface policiaRepository extends JpaRepository<policia,Integer > {
}
