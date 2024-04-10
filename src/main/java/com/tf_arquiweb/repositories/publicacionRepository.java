package com.tf_arquiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tf_arquiweb.entities.publicacion;
@Repository
public interface publicacionRepository extends JpaRepository<publicacion, Integer> {

}
