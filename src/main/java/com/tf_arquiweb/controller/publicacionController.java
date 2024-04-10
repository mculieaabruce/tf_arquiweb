package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.publicacionDTO;
import com.tf_arquiweb.entities.publicacion;
import com.tf_arquiweb.serviceinterfaces.IpublicacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("publicacion")
public class publicacionController {
    @Autowired
    private IpublicacionService pS;
    public void insertar(@RequestBody publicacionDTO publicacionDTO){
        ModelMapper m =new ModelMapper();
        publicacion ma = m.map(publicacionDTO, publicacion.class);
        pS.insert(ma);
    }
    @GetMapping
    public List<publicacionDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, publicacionDTO.class);
        }).collect(Collectors.toList());
    }
}
