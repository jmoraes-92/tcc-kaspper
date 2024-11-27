package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Cliente;
import com.orcamentos.kaspper.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        if (clienteRepository.existsByEmail(cliente.getEmail())) {
            throw new IllegalArgumentException("E-mail já cadastrado.");
        }
        return clienteRepository.save(cliente);
    }
}
