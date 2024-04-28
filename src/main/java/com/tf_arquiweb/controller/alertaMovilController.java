package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.alertaCiudadanoUbiDTO;
import com.tf_arquiweb.dtos.alertaMovilDTO;
import com.tf_arquiweb.dtos.publixCiudadanoDTO;
import com.tf_arquiweb.entities.alertaMovil;
import com.tf_arquiweb.serviceinterfaces.IalertaMovilService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alertaMovil")
public class alertaMovilController {
    @Autowired
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
    @PreAuthorize("hasAnyAuthority('policia')")
    @GetMapping("/CantidadaAlertasxCiudadanoEnDistrito")
    public List<alertaCiudadanoUbiDTO> QuantityCity(){
        List<String[]> filaLista = aS.AlertasxCiudadanoxDistrito();
        List<alertaCiudadanoUbiDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            alertaCiudadanoUbiDTO dto = new alertaCiudadanoUbiDTO();
            dto.getCiudadanoId(Integer.parseInt(columna[0]));
            dto.getCantidadAlertas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
