package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.caso;

import java.util.List;

public interface IcasoService {
    public void insert(caso caso);
    public List<caso> list();
}
