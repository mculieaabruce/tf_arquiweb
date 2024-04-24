package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.alertaMovilDTO;
import com.tf_arquiweb.entities.alertaMovil;
import com.tf_arquiweb.serviceinterfaces.IalertaMovilService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alertaMovil")
public class alertaMovilController {
    private IalertaMovilService aS;
    @PostMapping
    public void insertar(@RequestBody alertaMovilDTO alertaMovilDTO){
        ModelMapper m= new ModelMapper();
        alertaMovil c=m.map(alertaMovilDTO,alertaMovil.class);
        aS.insert(c);
    }
    @GetMapping
    public List<alertaMovilDTO> listar(){
        return aS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,alertaMovilDTO.class);
        }).collect(Collectors.toList());
    }
}
