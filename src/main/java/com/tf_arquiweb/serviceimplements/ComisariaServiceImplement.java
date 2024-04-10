package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.Comisaria;
import com.tf_arquiweb.repositories.ComisariaRepository;
import com.tf_arquiweb.serviceinterfaces.IComisariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComisariaServiceImplement implements IComisariaService {
    @Autowired
    private ComisariaRepository cR;
    @Override
    public void insert(Comisaria comisaria) {
        cR.save(comisaria);
    }

    @Override
    public List<Comisaria> list() {
        return cR.findAll();
    }


}
