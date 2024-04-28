package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.serviceinterfaces.IpublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tf_arquiweb.entities.publicacion;
import com.tf_arquiweb.repositories.publicacionRepository;

import java.util.List;

@Service
public class publicacionServiceImplement implements  IpublicacionService{
    @Autowired
    private publicacionRepository pR;

    @Override
    public void insert(publicacion pu) {
        pR.save(pu);
    }

    @Override
    public List<publicacion> list() {
        return pR.findAll();
    }

    @Override
    public List<String[]> publixCiudadano() {
        return pR.publixCiudadano();
    }
}
