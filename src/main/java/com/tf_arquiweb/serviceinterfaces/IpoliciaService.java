package com.tf_arquiweb.serviceinterfaces;


import com.tf_arquiweb.entities.policia;

import java.util.List;

public interface IpoliciaService {
    public void insert(policia p);
    public List<policia> list();
}
