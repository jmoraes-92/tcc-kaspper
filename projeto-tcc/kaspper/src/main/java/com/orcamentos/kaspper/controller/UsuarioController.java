package com.orcamentos.kaspper.controller;

import com.orcamentos.kaspper.model.Notificacao;
import com.orcamentos.kaspper.model.Usuario;
import com.orcamentos.kaspper.service.NotificacaoService;
import com.orcamentos.kaspper.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private NotificacaoService notificacaoService;

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @PostMapping("/{idUsuario}/notificar")
    public ResponseEntity<Notificacao> enviarNotificacao(@PathVariable Long idUsuario, @RequestBody String mensagem) {
        Notificacao notificacao = notificacaoService.enviarNotificacao(idUsuario, mensagem);
        return ResponseEntity.ok(notificacao);
    }
}
