package com.tf_arquiweb.controller;
import com.tf_arquiweb.dtos.respuestaxpoliciaDTO;
import com.tf_arquiweb.dtos.casoresueltoxpoliciaDTO;
import com.tf_arquiweb.dtos.respuestaDTO;
import com.tf_arquiweb.entities.respuesta;
import com.tf_arquiweb.serviceinterfaces.IrespuestaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuesta")
public class respuestaController {
    @Autowired
    private IrespuestaService Ic;
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    @PostMapping
    public void insertar(@RequestBody respuesta RespuestaDTO){
        ModelMapper m= new ModelMapper();
        respuesta c=m.map(RespuestaDTO,respuesta.class);
        Ic.insert(c);
    }
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    @GetMapping
    public List<respuestaDTO> listar(){
        return Ic.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,respuestaDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    @GetMapping("/respuestaxpolicia")
    public List<respuestaxpoliciaDTO> respuestasxpolicia(){
        List<String[]> filaLista = Ic.listrespuestaxpolicia();
        List<respuestaxpoliciaDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            respuestaxpoliciaDTO dto = new respuestaxpoliciaDTO();
            dto.setId(Integer.parseInt(columna[0]));
            dto.setCantidadrespuestas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };
}
