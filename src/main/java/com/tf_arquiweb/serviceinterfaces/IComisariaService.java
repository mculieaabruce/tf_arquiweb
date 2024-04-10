package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.Comisaria;

import java.util.List;

public interface IComisariaService {
    public void insert(Comisaria comisaria);
    public List<Comisaria> list();
}
