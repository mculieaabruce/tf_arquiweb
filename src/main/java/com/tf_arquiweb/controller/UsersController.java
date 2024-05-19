package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.UsersDTO;
import com.tf_arquiweb.entities.Users;
import com.tf_arquiweb.serviceinterfaces.IUsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuariospage")
public class UsersController {
    @Autowired
    private IUsersService iU;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping
    public void Registrar(@RequestBody UsersDTO usersDTO){
        ModelMapper m= new ModelMapper();
        Users u=m.map(usersDTO, Users.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        iU.insert(u);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping
    public List<UsersDTO> listar(){
        return iU.list().stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y, UsersDTO.class);
        }).collect(Collectors.toList());
    }
}
