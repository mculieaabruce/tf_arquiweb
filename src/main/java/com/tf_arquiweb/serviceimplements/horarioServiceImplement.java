package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.horario;
import com.tf_arquiweb.repositories.horarioRepository;
import com.tf_arquiweb.serviceinterfaces.IhorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class horarioServiceImplement implements IhorarioService {
    @Autowired
    private horarioRepository hoR;
    @Override
    public void insert(horario hor){
        hoR.save(hor);
    }
    @Override
    public List<horario> list() {
        return hoR.findAll();
    }
}
