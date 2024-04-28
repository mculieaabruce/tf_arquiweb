package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.policiaDTO;
import com.tf_arquiweb.entities.policia;
import com.tf_arquiweb.serviceinterfaces.IpoliciaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/policia")
public class policiaController {
    @Autowired
    private IpoliciaService pS;
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping
    public void insertar(@RequestBody policiaDTO PoliciaDTO){
        ModelMapper m= new ModelMapper();
        policia c=m.map(PoliciaDTO,policia.class);
        pS.insert(c);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping
    public List<policiaDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,policiaDTO.class);
        }).collect(Collectors.toList());
    }
}
