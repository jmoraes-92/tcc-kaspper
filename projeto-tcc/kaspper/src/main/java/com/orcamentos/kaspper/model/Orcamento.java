package com.orcamentos.kaspper.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orcamentos")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrcamento;

    @ManyToOne
    @JoinColumn(name = "id_demanda", nullable = false)
    private Demanda demanda;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    // Getters and Setters
    public Long getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Long idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Demanda getDemanda() {
        return demanda;
    }

    public void setDemanda(Demanda demanda) {
        this.demanda = demanda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
