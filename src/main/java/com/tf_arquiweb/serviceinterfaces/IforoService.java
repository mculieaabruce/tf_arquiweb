package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.foro;
import com.tf_arquiweb.entities.horario;

import java.util.List;

public interface IforoService {
    public void insert(foro f);
    public List<foro> list();
}
