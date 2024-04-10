package com.tf_arquiweb.serviceinterfaces;
import com.tf_arquiweb.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario gU);
    public List<Usuario> list();
}
