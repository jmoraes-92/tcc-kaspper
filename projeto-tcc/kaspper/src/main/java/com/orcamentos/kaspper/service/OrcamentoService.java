package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Orcamento;
import com.orcamentos.kaspper.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public List<Orcamento> listarTodos() {
        return orcamentoRepository.findAll();
    }

    public Optional<Orcamento> buscarPorId(Long id) {
        return orcamentoRepository.findById(id);
    }

    public Orcamento salvar(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public void excluir(Long id) {
        if (!orcamentoRepository.existsById(id)) {
            throw new IllegalArgumentException("Orçamento com ID " + id + " não encontrado.");
        }
        orcamentoRepository.deleteById(id);
    }
}

