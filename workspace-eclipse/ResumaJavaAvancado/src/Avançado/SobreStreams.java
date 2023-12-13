package Avançado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SobreStreams {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1L, "Cadeira", 100.0));
        produtos.add(new Produto(2L, "Cama", 400.0));
        produtos.add(new Produto(3L, "Mesa", 200.0));
        produtos.add(new Produto(4L, "Sofá", 500.0));
        produtos.add(new Produto(5L, "Cadeira", 150.0));

        List<Produto> produtosFiltrados = produtos.stream()
                .filter( p ->p.getPreço()>300.0)
                .collect(Collectors.toList());

        produtosFiltrados.forEach(System.out::println);


        List<String> descricoes = produtos.stream()
                .map( p ->p.getDescricao() )
                .collect(Collectors.toList());

        descricoes.forEach(System.out::println);
    }
}
