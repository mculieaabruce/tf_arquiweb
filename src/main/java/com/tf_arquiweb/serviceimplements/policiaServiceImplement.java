package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.policia;
import com.tf_arquiweb.repositories.policiaRepository;
import com.tf_arquiweb.serviceinterfaces.IpoliciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class policiaServiceImplement implements IpoliciaService {

    @Autowired
    private policiaRepository pR;
    @Override
    public void insert(policia p) {
        pR.save(p);
    }
    @Override
    public List<policia> list() {
        return pR.findAll();
}
}