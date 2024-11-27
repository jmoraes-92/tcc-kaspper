package com.kaspper.calcprojetos.model;

import java.time.LocalDateTime;

public class SolicitacaoOrcamento {
    private Integer id;
    private String nomeCliente;
    private String descricaoProjeto;
    private String complexidade;
    private double horasEstimadas;
    private double custoEstimado;
    private LocalDateTime dataSolicitacao;
    

    // Construtores, getters e setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDescricaoProjeto() {
		return descricaoProjeto;
	}
	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}
	public String getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}
	public double getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public double getCustoEstimado() {
		return custoEstimado;
	}
	public void setCustoEstimado(double custoEstimado) {
		this.custoEstimado = custoEstimado;
	}
	public LocalDateTime getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
    
}
