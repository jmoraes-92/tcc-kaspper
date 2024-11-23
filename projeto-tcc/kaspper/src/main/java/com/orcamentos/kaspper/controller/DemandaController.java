package com.orcamentos.kaspper.controller;

import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @GetMapping
    public List<Demanda> listarTodas() {
        return demandaService.listarTodas();
    }

    @PostMapping
    public Demanda salvar(@RequestBody Demanda demanda) {
        return demandaService.salvar(demanda);
    }
}
