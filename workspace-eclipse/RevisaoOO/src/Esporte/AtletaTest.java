package Esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtletaTest {

    @Test
    void testarConstrutor() {
        Pessoa pessoa = new Pessoa("Lucas", 25);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        Atleta atleta = new Atleta("Lucas", 25, 90, false);
        System.out.println(atleta.nome);
        System.out.println(atleta.idade);
        System.out.println(atleta.peso);
        System.out.println(atleta.aposentado);
    }

    @Test
    void testarNadador() {
        Nadador nadador = new Nadador("Roque", 19, 95, false);
        nadador.nadar();
        nadador.envelhecer();
        System.out.println(nadador.idade);
        nadador.aposentar();
        System.out.println(nadador.aposentado);
    }

    @Test
    void testarCiclista() {
        Ciclista ciclista = new Ciclista("Tiago", 74, 65, false);
        System.out.println("Está aposentado");
        if (ciclista.aposentado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        ciclista.pedalar();
        ciclista.envelhecer();
        ciclista.aposentar();
        System.out.println("Agora já está aposentado?");
        System.out.println(ciclista.aposentado ? "Sim" : "Não");
    }
}