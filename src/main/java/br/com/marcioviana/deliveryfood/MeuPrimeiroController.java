package br.com.marcioviana.deliveryfood;

import br.com.marcioviana.deliveryfood.di.modelo.Cliente;
import br.com.marcioviana.deliveryfood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService atividacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService atividacaoClienteService) {
        this.atividacaoClienteService = atividacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente aldilene = new Cliente("Aldilene", "lene@xyz.com", "11911111111");

        atividacaoClienteService.ativar(aldilene);

        return "hello, Márcio";
    }
}
