package com.orcamentos.kaspper.dto;

public class TarefaRequestDTO {
    private String descricao;
    private String responsavel;
    private String status;
    private Long idDemanda;

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Long idDemanda) {
        this.idDemanda = idDemanda;
    }
}
