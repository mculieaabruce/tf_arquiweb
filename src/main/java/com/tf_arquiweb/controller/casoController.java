package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.casoDTO;
import com.tf_arquiweb.dtos.casoXdistritoDTO;
import com.tf_arquiweb.dtos.ciudadanoXcasoDTO;
import com.tf_arquiweb.entities.caso;
import com.tf_arquiweb.serviceinterfaces.IcasoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @PreAuthorize("hasAnyAuthority('policia')")
    @GetMapping("/casosxdistrito")
    public List<casoXdistritoDTO> casito(){
        List<String[]> filaLista = cS.findCasosPorDistritoId();
        List<casoXdistritoDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            casoXdistritoDTO dto = new casoXdistritoDTO();
            dto.setDistrito(columna[0]);
            dto.setNumero_de_casos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };
    @PreAuthorize("hasAnyAuthority('policia')")
    @GetMapping("/casosresueltoxdistrito")
    public List<casoXdistritoDTO> resueltito(){
        List<String[]> filaLista = cS.findCasosResueltosPorDistrito();
        List<casoXdistritoDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            casoXdistritoDTO dto = new casoXdistritoDTO();
            dto.setDistrito(columna[0]);
            dto.setCasos_resueltos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };
    @PreAuthorize("hasAnyAuthority('policia','ciudadano')")
    @GetMapping("/ciudadanoPorcaso")
    public List<ciudadanoXcasoDTO> ciudadanoPorcaso(){
        List<String[]> filaLista = cS.ciudadanoxcaso();
        List<ciudadanoXcasoDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            ciudadanoXcasoDTO dto = new ciudadanoXcasoDTO();
            dto.setNombre(columna[0]);
            dto.setCantidad_de_casos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };

}
