package com.tf_arquiweb.serviceinterfaces;


import com.tf_arquiweb.entities.horario;

import java.util.List;

public interface IhorarioService {
    public void insert(horario ciu);
    public List<horario> list();
}
