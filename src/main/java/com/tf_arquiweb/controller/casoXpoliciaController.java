package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.casoXpoliciaDTO;
import com.tf_arquiweb.entities.casoXpolicia;
import com.tf_arquiweb.serviceinterfaces.IcasoXpoliciaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/casoXpolicia")
public class casoXpoliciaController {
    @Autowired
    private IcasoXpoliciaService cXpS;
    @PostMapping
    public void insertar(@RequestBody casoXpoliciaDTO casoXpoliciaDTO){
        ModelMapper m= new ModelMapper();
        casoXpolicia c=m.map(casoXpoliciaDTO,casoXpolicia.class);
        cXpS.insert(c);
    }
    @GetMapping
    public List<casoXpoliciaDTO> listar(){
        return cXpS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,casoXpoliciaDTO.class);
        }).collect(Collectors.toList());
    }
}
