package com.tf_arquiweb.controller;

import com.tf_arquiweb.dtos.RoleDTO;
import com.tf_arquiweb.entities.Role;
import com.tf_arquiweb.serviceinterfaces.IRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping
    public void Registrar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/{id}")
    public RoleDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listID(id), RoleDTO.class);
        return dto;
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping
    public List<RoleDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

}
