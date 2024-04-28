package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.casoXpoliciaDTO;
import com.tf_arquiweb.dtos.casosAtrasadosDTO;
import com.tf_arquiweb.entities.casoXpolicia;
import com.tf_arquiweb.serviceinterfaces.IcasoXpoliciaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
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
    @GetMapping("/casosAtrasados")
    public List<casosAtrasadosDTO> casosAtrasados(){
        List<String[]> filaLista = cXpS.casosAtrasados();
        List<casosAtrasadosDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            casosAtrasadosDTO dto = new casosAtrasadosDTO();
            dto.setNombre(columna[0]);
            dto.setNum_placa(columna[1]);
            dto.setDistrito(columna[2]);
            dto.setFecha(LocalDate.parse(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };
}
