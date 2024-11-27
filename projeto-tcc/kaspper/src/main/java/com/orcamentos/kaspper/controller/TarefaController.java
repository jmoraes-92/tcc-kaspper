package com.orcamentos.kaspper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orcamentos.kaspper.model.Tarefa;
import com.orcamentos.kaspper.model.enums.StatusTarefa;
import com.orcamentos.kaspper.service.TarefaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

	@Autowired
	private TarefaService tarefaService;

	@PostMapping
	public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
		Tarefa novaTarefa = tarefaService.salvar(tarefa);
		return ResponseEntity.ok(novaTarefa);
	}

	@PutMapping("/{idTarefa}/status")
	public ResponseEntity<Tarefa> atualizarStatus(@PathVariable Long idTarefa, @RequestParam StatusTarefa status) {
		Tarefa tarefa = tarefaService.atualizarStatus(idTarefa, status);
		return ResponseEntity.ok(tarefa);
	}

	@GetMapping("/{idDemanda}")
	public ResponseEntity<List<Tarefa>> listarTarefasPorDemanda(@PathVariable Long idDemanda) {
		List<Tarefa> tarefas = tarefaService.listarPorDemanda(idDemanda);
		return ResponseEntity.ok(tarefas);
	}
}