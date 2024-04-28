package com.tf_arquiweb.controller;

import com.tf_arquiweb.entities.Ciudadano;
import com.tf_arquiweb.serviceinterfaces.IciudadanoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tf_arquiweb.dtos.ciudadanoDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ciudadano")
public class ciudadanoController {
    @Autowired
    private IciudadanoService Ic;
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping
    public void insertar(@RequestBody ciudadanoDTO CiudadanoDTO){
        ModelMapper m= new ModelMapper();
        Ciudadano c=m.map(CiudadanoDTO,Ciudadano.class);
        Ic.insert(c);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping
    public List<ciudadanoDTO> listar(){
        return Ic.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ciudadanoDTO.class);
        }).collect(Collectors.toList());
    }
    /*https://stackoverflow.com/questions/61202937/json-parse-error-cannot-deserialize-value-of-type-java-time-localdatetime-fro*/
}
