package Cidadania;

public class Cidadao extends Pessoa{
    String cpf;

    public Cidadao(String nome, Integer idade, String sexo, String cpf) {
        super(nome, idade, sexo);
        this.cpf = cpf;
    }


}