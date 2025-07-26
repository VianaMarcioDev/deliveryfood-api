package br.com.marcioviana.deliveryfood.di.service;

import br.com.marcioviana.deliveryfood.di.modelo.Cliente;
import br.com.marcioviana.deliveryfood.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
