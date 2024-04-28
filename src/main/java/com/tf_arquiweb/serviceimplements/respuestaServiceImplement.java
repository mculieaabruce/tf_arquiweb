package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.respuesta;
import com.tf_arquiweb.repositories.respuestaRepository;
import com.tf_arquiweb.serviceinterfaces.IrespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class respuestaServiceImplement implements IrespuestaService {
    @Autowired
    private respuestaRepository reR;
    @Override
    public void insert(respuesta hor){
        reR.save(hor);
    }
    @Override
    public List<respuesta> list() {
        return reR.findAll();
}

    @Override
    public List<String[]> listrespuestaxpolicia() {
        return reR.listrespuestaxpolicia();
    }
}