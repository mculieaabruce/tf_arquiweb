package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.respuestaDTO;
import com.tf_arquiweb.entities.respuesta;
import com.tf_arquiweb.serviceinterfaces.IrespuestaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuesta")
public class respuestaController {
    @Autowired
    private IrespuestaService Ic;
    @PostMapping
    public void insertar(@RequestBody respuesta RespuestaDTO){
        ModelMapper m= new ModelMapper();
        respuesta c=m.map(RespuestaDTO,respuesta.class);
        Ic.insert(c);
    }
    @GetMapping
    public List<respuestaDTO> listar(){
        return Ic.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,respuestaDTO.class);
        }).collect(Collectors.toList());
    }
}
