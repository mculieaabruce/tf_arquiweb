package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.alertaMovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface alertaMovilRepository extends JpaRepository<alertaMovil, Integer> {
}
