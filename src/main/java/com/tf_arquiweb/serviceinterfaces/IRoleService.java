package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.Role;

import java.util.List;
public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);
    public Role listID(Long idRol);

}
