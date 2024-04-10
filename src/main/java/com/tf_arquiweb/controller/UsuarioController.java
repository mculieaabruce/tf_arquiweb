package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.UsuarioDTO;
import com.tf_arquiweb.entities.Usuario;
import com.tf_arquiweb.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariospage")
public class UsuarioController {
    @Autowired
    private IUsuarioService iU;
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m= new ModelMapper();
        Usuario u=m.map(usuarioDTO, Usuario.class);
        iU.insert(u);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return iU.list().stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
