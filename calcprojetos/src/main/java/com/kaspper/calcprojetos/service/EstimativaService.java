package com.kaspper.calcprojetos.service;

import com.kaspper.calcprojetos.model.Estimativa;
import com.kaspper.calcprojetos.model.Projeto;
import org.springframework.stereotype.Service;

@Service
public class EstimativaService {

    public Estimativa gerarEstimativa(Projeto projeto, String complexidade, int horasEstimadas) {
        Estimativa estimativa = new Estimativa();
        estimativa.setProjeto(projeto);
        estimativa.setComplexidade(Complexidade.valueOf(complexidade.toUpperCase()));
        estimativa.setHorasEstimadas(horasEstimadas);
        estimativa.setDataEstimativa(new Date());

        // Calculo de custo baseado na complexidade
        double fatorComplexidade = calcularFatorComplexidade(complexidade);
        estimativa.setCustoEstimado(horasEstimadas * fatorComplexidade);

        return estimativa;
    }

    private double calcularFatorComplexidade(String complexidade) {
        switch (complexidade) {
            case "alta":
                return 150.0;
            case "media":
                return 100.0;
            default:
                return 50.0;
        }
    }
}