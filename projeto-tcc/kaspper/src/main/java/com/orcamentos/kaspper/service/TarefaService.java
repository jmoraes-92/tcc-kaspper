package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Tarefa;
import com.orcamentos.kaspper.model.enums.StatusTarefa;
import com.orcamentos.kaspper.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	public Tarefa salvar(Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}

	public Tarefa atualizarStatus(Long idTarefa, StatusTarefa status) {
		Tarefa tarefa = tarefaRepository.findById(idTarefa)
				.orElseThrow(() -> new IllegalArgumentException("Tarefa com ID " + idTarefa + " não encontrada."));
		tarefa.setStatus(status);
		return tarefaRepository.save(tarefa);
	}

	public List<Tarefa> listarPorDemanda(Long idDemanda) {
		return tarefaRepository.findByDemandaIdDemanda(idDemanda);
	}
}
