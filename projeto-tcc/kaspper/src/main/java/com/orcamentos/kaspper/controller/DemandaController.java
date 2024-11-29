package com.orcamentos.kaspper.controller;

import com.orcamentos.kaspper.dto.DemandaRequestDTO;
import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @PostMapping
    public ResponseEntity<Demanda> criarDemanda(@RequestBody DemandaRequestDTO demandaRequestDTO) {
        Demanda demanda = demandaService.salvar(demandaRequestDTO);
        return ResponseEntity.ok(demanda);
    }

    @GetMapping
    public ResponseEntity<List<Demanda>> listarDemandas() {
        List<Demanda> demandas = demandaService.listarTodas();
        return ResponseEntity.ok(demandas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demanda> buscarPorId(@PathVariable Long id) {
        Demanda demanda = demandaService.buscarPorId(id);
        return ResponseEntity.ok(demanda);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Demanda> atualizarDemanda(@PathVariable Long id, @RequestBody DemandaRequestDTO demandaRequestDTO) {
        Demanda demanda = demandaService.atualizar(id, demandaRequestDTO);
        return ResponseEntity.ok(demanda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDemanda(@PathVariable Long id) {
        demandaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
