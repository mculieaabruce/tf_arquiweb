package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.ComisariaDTO;
import com.tf_arquiweb.entities.Comisaria;
import com.tf_arquiweb.serviceinterfaces.IComisariaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comisaria")
public class ComisariaController {
    @Autowired
    IComisariaService cS;
    @PostMapping
    public void insertar(@RequestBody ComisariaDTO comisariaDTO){
        ModelMapper m=new ModelMapper();
        Comisaria c=m.map(comisariaDTO,Comisaria.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ComisariaDTO> listar(){
        return cS.list().stream().map(c->{
            ModelMapper m = new ModelMapper();
            return m.map(c,ComisariaDTO.class);
        }).collect(Collectors.toList());
    }
}
