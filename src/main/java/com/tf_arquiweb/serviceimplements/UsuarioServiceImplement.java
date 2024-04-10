package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.Usuario;
import com.tf_arquiweb.serviceinterfaces.IUsuarioService;
import com.tf_arquiweb.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private UsuarioRepository uR;
    @Override
    public void insert(Usuario gU) {
        uR.save(gU);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }
}
