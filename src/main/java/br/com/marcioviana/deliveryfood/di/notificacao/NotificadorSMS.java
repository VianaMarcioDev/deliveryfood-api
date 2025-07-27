package br.com.marcioviana.deliveryfood.di.notificacao;

import br.com.marcioviana.deliveryfood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s usando SMS %s: %s%n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
