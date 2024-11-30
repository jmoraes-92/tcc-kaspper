package com.orcamentos.kaspper.dto;

import java.util.List;

import com.orcamentos.kaspper.model.Cliente;
import com.orcamentos.kaspper.model.Tarefa;

public class DemandaRequestDTO {
    private String descricao;
    private String prioridade;
    private String status;
    private Cliente cliente; // Adicionado campo cliente

	// Getters and Setters
    
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private List<Tarefa> tarefas;
    private Long idCliente;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    
    public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
