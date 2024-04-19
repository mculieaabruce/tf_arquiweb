package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface RolRepository extends JpaRepository<Role, Long> {
}
