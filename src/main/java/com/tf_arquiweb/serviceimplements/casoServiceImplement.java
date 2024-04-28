package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.repositories.casoRepository;
import com.tf_arquiweb.serviceinterfaces.IcasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class casoServiceImplement implements IcasoService {
    @Autowired
    private casoRepository cR;

    @Override
    public void insert(caso c) {
        cR.save(c);
    }

    @Override
    public List<caso> list() {
        return cR.findAll();
    }
}
