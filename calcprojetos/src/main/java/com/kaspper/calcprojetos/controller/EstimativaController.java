package com.kaspper.calcprojetos.controller;

import com.kaspper.calcprojetos.model.Estimativa;
import com.kaspper.calcprojetos.model.Projeto;
import com.kaspper.calcprojetos.service.EstimativaService;
import com.kaspper.calcprojetos.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estimativas")
public class EstimativaController {

    @Autowired
    private EstimativaService estimativaService;

    @Autowired
    private ProjetoService projetoService;

    @PostMapping("/gerar")
    public String gerarEstimativa(
            @RequestParam("idProjeto") Integer idProjeto,
            @RequestParam("complexidade") String complexidade,
            @RequestParam("horasEstimadas") int horasEstimadas,
            Model model) {
        Projeto projeto = projetoService.obterProjeto(idProjeto);
        Estimativa estimativa = estimativaService.gerarEstimativa(projeto, complexidade, horasEstimadas);
        model.addAttribute("estimativa", estimativa);
        return "resultado-estimativa";
    }
}
