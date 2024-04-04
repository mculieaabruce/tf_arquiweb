package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.distrito;
import com.tf_arquiweb.repositories.distritoRepository;
import com.tf_arquiweb.serviceinterfaces.IdistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class distritoServiceImplement implements IdistritoService {
    @Autowired
    private distritoRepository disR;
    @Override
    public void insert(distrito diu){
        disR.save(diu);
    }
    @Override
    public List<distrito> list() {
        return disR.findAll();
    }
}
