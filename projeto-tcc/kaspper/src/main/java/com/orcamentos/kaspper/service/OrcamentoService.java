package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Demanda;
import com.orcamentos.kaspper.model.Orcamento;
import com.orcamentos.kaspper.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrcamentoService {

	@Autowired
	private OrcamentoRepository orcamentoRepository;

	@Autowired
	private NotificacaoService notificacaoService;

	public Orcamento gerarEstimativa(Demanda demanda) {
		BigDecimal estimativa;

		switch (demanda.getPrioridade()) {
		case ALTA:
			estimativa = BigDecimal.valueOf(10000);
			break;
		case MEDIA:
			estimativa = BigDecimal.valueOf(5000);
			break;
		case BAIXA:
		default:
			estimativa = BigDecimal.valueOf(2000);
			break;
		}

		Orcamento orcamento = new Orcamento();
		orcamento.setDemanda(demanda);
		orcamento.setValor(estimativa);
		orcamento.setObservacoes("Estimativa gerada automaticamente com base na prioridade da demanda.");

		Orcamento orcamentoSalvo = orcamentoRepository.save(orcamento);

		// Extrair o ID do cliente para enviar a notificação
		notificacaoService.enviarNotificacao(demanda.getCliente().getId(),
				"Uma nova estimativa foi gerada para sua demanda.");

		return orcamentoSalvo;
	}
}
