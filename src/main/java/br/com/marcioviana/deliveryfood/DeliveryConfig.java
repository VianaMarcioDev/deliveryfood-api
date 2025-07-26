package br.com.marcioviana.deliveryfood;

import br.com.marcioviana.deliveryfood.di.notificacao.NotificadorEmail;
import br.com.marcioviana.deliveryfood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeliveryConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {

        NotificadorEmail notificador = new NotificadorEmail("smtp.xyzmail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService atividacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }
}
