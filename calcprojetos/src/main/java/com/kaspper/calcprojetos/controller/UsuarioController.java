package com.kaspper.calcprojetos.controller;

import com.kaspper.calcprojetos.model.Usuario;
import com.kaspper.calcprojetos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    // Mapeamento da página inicial para carregar index.html
    @GetMapping("/")
    public String carregarIndex() {
        return "index";  // Retorna index.html como página inicial
    }

    // Mantém o mapeamento para listar usuários para o index.js utilizar
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return "index";  // Carrega o index.html para navegação dinâmica
    }

    @GetMapping("/usuarios/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Integer id) {
        return usuarioService.buscarPorId(id);
    }

    @PostMapping("/usuarios")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void excluirUsuario(@PathVariable Integer id) {
        usuarioService.excluirUsuario(id);
    }
}
