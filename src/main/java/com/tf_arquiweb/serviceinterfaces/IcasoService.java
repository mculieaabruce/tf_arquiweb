package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.dtos.casoDTO;
import com.tf_arquiweb.dtos.casoXdistritoDTO;

import com.tf_arquiweb.entities.caso;

import java.util.Collection;
import java.util.List;

public interface IcasoService {
    public void insert(caso caso);
    public List<caso> list();

    List<casoXdistritoDTO> findCasosPorDistritoId();
    List<casoXdistritoDTO> findCasosResueltosPorDistrito();



}
