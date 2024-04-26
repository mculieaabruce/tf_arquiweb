package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.casoDTO;
import com.tf_arquiweb.dtos.casoXdistritoDTO;
import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.serviceimplements.casoServiceImplement;
import com.tf_arquiweb.serviceinterfaces.IcasoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/caso")
public class casoController {
    @Autowired
    private IcasoService cS;
    @PostMapping
    public void insertar(@RequestBody casoDTO CiudadanoDTO){
        ModelMapper m= new ModelMapper();
        caso c=m.map(CiudadanoDTO,caso.class);
        cS.insert(c);
    }
    @GetMapping
    public List<casoDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,casoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/casosxdistrito")
    public List<casoXdistritoDTO> casito(){
        return cS.findCasosPorDistritoId().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, casoXdistritoDTO.class);
        }).collect(Collectors.toList());
    };

    @GetMapping("/casosresueltoxdistrito")
    public List<casoXdistritoDTO> resueltito(){
        return cS.findCasosResueltosPorDistrito().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, casoXdistritoDTO.class);
        }).collect(Collectors.toList());
    };
}

