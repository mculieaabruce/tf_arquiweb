package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.casoXpolicia;
import com.tf_arquiweb.repositories.casoXpoliciaRepository;
import com.tf_arquiweb.serviceinterfaces.IcasoXpoliciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class casoXpoliciaServiceImplement implements IcasoXpoliciaService {
    @Autowired
    private casoXpoliciaRepository cR;
    @Override
    public void insert(casoXpolicia c) {
        cR.save(c);
    }

    @Override
    public List<casoXpolicia> list() {
        return cR.findAll();
    }
}
