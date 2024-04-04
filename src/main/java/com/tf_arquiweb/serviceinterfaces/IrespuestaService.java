package com.tf_arquiweb.serviceinterfaces;


import com.tf_arquiweb.entities.respuesta;

import java.util.List;

public interface IrespuestaService {
    public void insert(respuesta ciu);
    public List<respuesta> list();
}
