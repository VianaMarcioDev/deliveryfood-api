package br.com.marcioviana.deliveryfood.di.notificacao;

import br.com.marcioviana.deliveryfood.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
