package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.Comisaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComisariaRepository extends JpaRepository<Comisaria, Integer> {
}
