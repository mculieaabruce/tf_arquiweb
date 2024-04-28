package com.tf_arquiweb.controller;

import ch.qos.logback.classic.encoder.JsonEncoder;
import com.tf_arquiweb.dtos.UsuarioDTO;
import com.tf_arquiweb.entities.Usuario;
import com.tf_arquiweb.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariospage")
public class UsuarioController {
    @Autowired
    private IUsuarioService iU;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping
    public void Registrar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m= new ModelMapper();
        Usuario u=m.map(usuarioDTO, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
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
