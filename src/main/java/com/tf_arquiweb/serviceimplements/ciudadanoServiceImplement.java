package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.Ciudadano;
import com.tf_arquiweb.repositories.ciudadanoRepository;
import com.tf_arquiweb.serviceinterfaces.IciudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ciudadanoServiceImplement implements IciudadanoService {
    @Autowired
    private ciudadanoRepository ciuR;
    @Override
    public void insert(Ciudadano ciu){
        ciuR.save(ciu);
    }
    @Override
    public List<Ciudadano> list() {
        return ciuR.findAll();
    }
}
