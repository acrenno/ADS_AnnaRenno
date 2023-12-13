package br.inatel.labs.padraomvc.controller.model.service;

import br.inatel.labs.padraomvc.controller.model.entitty.Produto;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe produtos Services.
 * @author vitor-oliveira
 * @since 24 nov 2023
 */

@service
public class ProdutoService {

    @PostConstruct
    private void setup(){
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Produto p1 =  new Produto(1L, "furadeira", 300.0);
        Produto p2 =  new Produto(2L, "SerraCircular", 400.0);
        Produto p3 =  new Produto(1L, "lixeira", 200.0);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

    }

}
