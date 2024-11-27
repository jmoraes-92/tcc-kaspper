package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Usuario;
import com.orcamentos.kaspper.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario salvar(Usuario usuario) {
		if (usuarioRepository.existsByEmail(usuario.getEmail())) {
			throw new IllegalArgumentException("E-mail já cadastrado.");
		}
		return usuarioRepository.save(usuario);
	}

	public List<Usuario> listarTodos() {
		return usuarioRepository.findAll();
	}
}
