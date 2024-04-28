package com.tf_arquiweb.serviceimplements;

import com.tf_arquiweb.entities.alertaMovil;
import com.tf_arquiweb.repositories.alertaMovilRepository;
import com.tf_arquiweb.serviceinterfaces.IalertaMovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class alertaMovilServiceImplement implements IalertaMovilService {
    @Autowired
    private alertaMovilRepository aR;
    @Override
    public void insert(alertaMovil a) {
        aR.save(a);
    }
    @Override
    public List<alertaMovil> list() {
        return aR.findAll();
    }

    @Override
    public List<String[]> AlertasxCiudadanoxDistrito() {
        return aR.AlertasxCiudadanoxDistrito();
    }
}
