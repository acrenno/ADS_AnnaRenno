package br.inatel.labs.padraomvc.controller.model.entitty;

/**
 * Classe Produto.
 * @author vitor-oliveira
 * @since 24 nov 2023
 */

public class Produto {

    private Long id;
    private String descricao;
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(Long id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

}
