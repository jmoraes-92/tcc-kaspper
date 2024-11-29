package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.dto.DemandaRequestDTO;
import com.orcamentos.kaspper.model.Cliente;
import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.repository.ClienteRepository;
import com.orcamentos.kaspper.repository.DemandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orcamentos.kaspper.model.enums.StatusDemanda; 
import com.orcamentos.kaspper.model.enums.Prioridade;



import java.util.List;
import java.util.Optional;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public Demanda salvar(DemandaRequestDTO demandaRequestDTO) {
        Cliente cliente = clienteRepository.findById(demandaRequestDTO.getIdCliente())
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        Demanda demanda = new Demanda();
        demanda.setDescricao(demandaRequestDTO.getDescricao());
        
        // Converter a string de Prioridade para o enum Prioridade
        demanda.setPrioridade(Prioridade.valueOf(demandaRequestDTO.getPrioridade().toUpperCase()));
        
        // Converter a string de Status para o enum StatusDemanda
        demanda.setStatus(StatusDemanda.valueOf(demandaRequestDTO.getStatus().toUpperCase()));

        demanda.setCliente(cliente);

        return demandaRepository.save(demanda);
    }

    public List<Demanda> listarTodas() {
        return demandaRepository.findAll();
    }

    public Demanda buscarPorId(Long id) {
        return demandaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Demanda não encontrada"));
    }

    public Demanda atualizar(Long id, DemandaRequestDTO demandaRequestDTO) {
        Demanda demanda = buscarPorId(id);

        demanda.setDescricao(demandaRequestDTO.getDescricao());
        
        // Converter a string de Prioridade para o enum Prioridade
        demanda.setPrioridade(Prioridade.valueOf(demandaRequestDTO.getPrioridade().toUpperCase()));
        
        // Converter a string de Status para o enum StatusDemanda
        demanda.setStatus(StatusDemanda.valueOf(demandaRequestDTO.getStatus().toUpperCase()));

        Cliente cliente = clienteRepository.findById(demandaRequestDTO.getIdCliente())
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        demanda.setCliente(cliente);

        return demandaRepository.save(demanda);
    }

    public void deletar(Long id) {
        Demanda demanda = buscarPorId(id);
        demandaRepository.delete(demanda);
    }
}
