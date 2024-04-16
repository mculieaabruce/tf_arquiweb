package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.foroDTO;
import com.tf_arquiweb.dtos.publicacionDTO;
import com.tf_arquiweb.entities.foro;
import com.tf_arquiweb.entities.publicacion;
import com.tf_arquiweb.serviceinterfaces.IforoService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("foro")
public class foroController {
    private IforoService fS;
    public void insertar(@RequestBody foroDTO FORODTO){
        ModelMapper m =new ModelMapper();
        foro fo = m.map(FORODTO, foro.class);
        fS.insert(fo);
    }
    public List<foroDTO> listar(){
        return fS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, foroDTO.class);
        }).collect(Collectors.toList());
    }
}
