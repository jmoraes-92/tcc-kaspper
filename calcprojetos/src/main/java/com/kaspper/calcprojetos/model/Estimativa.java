package com.kaspper.calcprojetos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class Estimativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstimativa;

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @Enumerated(EnumType.STRING)
    private Complexidade complexidade;

    private int horasEstimadas;
    private double custoEstimado;
    @Temporal(TemporalType.DATE)
    private Date dataEstimativa;
    
    //Construtores, getters e setters
	public Integer getIdEstimativa() {
		return idEstimativa;
	}
	public void setIdEstimativa(Integer idEstimativa) {
		this.idEstimativa = idEstimativa;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Complexidade getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(Complexidade complexidade) {
		this.complexidade = complexidade;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public double getCustoEstimado() {
		return custoEstimado;
	}
	public void setCustoEstimado(double custoEstimado) {
		this.custoEstimado = custoEstimado;
	}
	public Date getDataEstimativa() {
		return dataEstimativa;
	}
	public void setDataEstimativa(Date dataEstimativa) {
		this.dataEstimativa = dataEstimativa;
	}
}
