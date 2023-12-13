package Esporte;

public class Nadador extends Atleta {
    public Nadador(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    void nadar() {
        System.out.println("Nadador nadando");
    }
}