package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.horarioDTO;
import com.tf_arquiweb.entities.horario;
import com.tf_arquiweb.serviceinterfaces.IhorarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horario")
public class horarioController {
    @Autowired
    private IhorarioService Ic;
    @PostMapping
    public void insertar(@RequestBody horarioDTO HorarioDTO){
        ModelMapper m= new ModelMapper();
        horario c=m.map(HorarioDTO,horario.class);
        Ic.insert(c);
    }
    @GetMapping
    public List<horarioDTO> listar(){
        return Ic.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,horarioDTO.class);
        }).collect(Collectors.toList());
    }
}
