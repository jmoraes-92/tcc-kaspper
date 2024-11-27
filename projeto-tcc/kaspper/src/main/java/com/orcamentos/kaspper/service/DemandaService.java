package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.repository.DemandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    public List<Demanda> listarTodas() {
        return demandaRepository.findAll();
    }

    public Demanda salvar(Demanda demanda) {
        return demandaRepository.save(demanda);
    }

    public Demanda buscarPorId(Long idDemanda) {
        Optional<Demanda> demandaOptional = demandaRepository.findById(idDemanda);
        if (demandaOptional.isEmpty()) {
            throw new IllegalArgumentException("Demanda com o ID " + idDemanda + " não foi encontrada.");
        }
        return demandaOptional.get();
    }
}
