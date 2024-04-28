package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.publicacion;

import java.util.List;
public interface IpublicacionService {
    public void insert(publicacion pu);
    public List<publicacion> list();

    public List<String[]> publixCiudadano();
}
