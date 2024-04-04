package com.tf_arquiweb.serviceinterfaces;


import com.tf_arquiweb.entities.Ciudadano;

import java.util.List;

public interface IciudadanoService {
    public void insert(Ciudadano ciu);
    public List<Ciudadano> list();
}
