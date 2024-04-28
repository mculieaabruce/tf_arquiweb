package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.distritoDTO;
import com.tf_arquiweb.entities.distrito;
import com.tf_arquiweb.serviceinterfaces.IdistritoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distrito")
public class distritoController {
    @Autowired
    private IdistritoService Ic;
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping
    public void insertar(@RequestBody distritoDTO CiudadanoDTO){
        ModelMapper m= new ModelMapper();
        distrito c=m.map(CiudadanoDTO,distrito.class);
        Ic.insert(c);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping
    public List<distritoDTO> listar(){
        return Ic.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,distritoDTO.class);
        }).collect(Collectors.toList());
    }
}
