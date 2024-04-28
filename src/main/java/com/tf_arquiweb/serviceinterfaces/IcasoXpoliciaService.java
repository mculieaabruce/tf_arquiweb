package com.tf_arquiweb.serviceinterfaces;

import com.tf_arquiweb.entities.casoXpolicia;

import java.util.List;

public interface IcasoXpoliciaService {
    public void insert(casoXpolicia casoXpolicia);
    public List<casoXpolicia> list();
    public List<String[]> casosAtrasados();
    public List<String[]> casosresueltosxpolicia();
}
