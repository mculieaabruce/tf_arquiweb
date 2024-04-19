package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.Role;
import com.tf_arquiweb.repositories.RolRepository;
import com.tf_arquiweb.serviceinterfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImplements implements IRoleService {

    @Autowired
    private RolRepository rR;
    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Optional<Role> listID(Long idRol) {
        return rR.findById(idRol);
    }
}
