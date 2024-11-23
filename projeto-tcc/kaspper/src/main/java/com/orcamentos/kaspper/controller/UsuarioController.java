package com.orcamentos.kaspper.controller;

import com.orcamentos.kaspper.dto.UsuarioDTO;
import com.orcamentos.kaspper.model.Usuario;
import com.orcamentos.kaspper.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarTodos() {
        return usuarioService.listarTodos().stream()
            .map(usuario -> new UsuarioDTO(usuario.getIdUsuario(), usuario.getNome(), usuario.getEmail()))
            .collect(Collectors.toList());
    }


    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }
}
