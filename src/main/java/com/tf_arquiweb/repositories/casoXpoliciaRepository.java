package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.casoXpolicia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface casoXpoliciaRepository extends JpaRepository<casoXpolicia, Integer> {
}
