package com.tf_arquiweb.repositories;

import com.tf_arquiweb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
