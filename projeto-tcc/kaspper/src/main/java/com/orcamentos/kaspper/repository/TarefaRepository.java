package com.orcamentos.kaspper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamentos.kaspper.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByDemandaIdDemanda(Long idDemanda);
}

