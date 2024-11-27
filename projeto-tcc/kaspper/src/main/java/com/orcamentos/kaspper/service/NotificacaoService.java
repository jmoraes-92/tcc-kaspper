package com.orcamentos.kaspper.service;

import com.orcamentos.kaspper.model.Cliente;
import com.orcamentos.kaspper.model.Notificacao;
import com.orcamentos.kaspper.repository.NotificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificacaoService {

    @Autowired
    private NotificacaoRepository notificacaoRepository;

    public Notificacao enviarNotificacao(Cliente cliente, String mensagem) {
        Notificacao notificacao = new Notificacao();
        notificacao.setMensagem(mensagem);
        notificacao.setDataEnvio(LocalDateTime.now());
        notificacao.setVisualizada(false);

        // Aqui você pode incluir informações do cliente na notificação, se necessário
        notificacao.setUsuario(null); // Ajuste ou remova este campo, se necessário

        return notificacaoRepository.save(notificacao);
    }
}
