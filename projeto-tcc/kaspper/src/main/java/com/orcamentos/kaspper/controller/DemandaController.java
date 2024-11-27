package com.orcamentos.kaspper.controller;

import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.model.Orcamento;
import com.orcamentos.kaspper.service.DemandaService;
import com.orcamentos.kaspper.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping("/{idDemanda}/gerar-estimativa")
    public Orcamento gerarEstimativa(@PathVariable Long idDemanda) {
        Demanda demanda = demandaService.buscarPorId(idDemanda); // Método corrigido agora funciona
        return orcamentoService.gerarEstimativa(demanda);
    }
}
