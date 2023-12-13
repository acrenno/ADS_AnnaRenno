package br.inatel.labs.padraomvc.controller.model;

import br.inatel.labs.padraomvc.controller.model.entitty.Produto;
import br.inatel.labs.padraomvc.controller.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/produtos")
    public String getProdutos(Model model){
        List<Produto> listaProduto = service.findAll();
        model.addAttributes("listaProdutos", listaProduto);
        return "tabela-deprodutos";
    }
}
