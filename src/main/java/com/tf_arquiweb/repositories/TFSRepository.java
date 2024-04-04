package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.Ciudadano;
import com.tf_arquiweb.serviceinterfaces.IciudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TFSRepository extends JpaRepository<Ciudadano, Integer> {

}
