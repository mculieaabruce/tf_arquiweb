package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.publicacionDTO;
import com.tf_arquiweb.dtos.publixCiudadanoDTO;
import com.tf_arquiweb.entities.publicacion;
import com.tf_arquiweb.serviceinterfaces.IpublicacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("publicacion")
public class publicacionController {
    @Autowired
    private IpublicacionService pS;
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    public void insertar(@RequestBody publicacionDTO publicacionDTO){
        ModelMapper m =new ModelMapper();
        publicacion ma = m.map(publicacionDTO, publicacion.class);
        pS.insert(ma);
    }
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    @GetMapping
    public List<publicacionDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, publicacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('admin','ciudadano','policia')")
    @GetMapping("/CantidadaPublicacionesXCiudadano")
    public List<publixCiudadanoDTO> QuantityCity(){
        List<String[]> filaLista = pS.publixCiudadano();
        List<publixCiudadanoDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            publixCiudadanoDTO dto = new publixCiudadanoDTO();
            dto.getIdUsuario(Integer.parseInt(columna[0]));
            dto.getQuantityPubli(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
