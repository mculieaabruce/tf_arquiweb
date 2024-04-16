package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.foro;
import com.tf_arquiweb.repositories.foroRepository;
import com.tf_arquiweb.serviceinterfaces.IforoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class foroServiceImplements implements IforoService {
    private foroRepository foR;

    @Override
    public void insert(foro f){
        foro save = foR.save(f);}
    @Override
    public List<foro> list() {return foR.findAll();}
}
