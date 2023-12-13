package Esporte;

public class Pessoa extends Object {
    String nome;
    Integer idade;

    public Pessoa(String nome, Integer idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    void envelhecer() {
        this.idade++;
    }

}