package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.alertaMovil;

import java.util.List;

public interface IalertaMovilService {
    public void insert(alertaMovil a);
    public List<alertaMovil> list();
}
