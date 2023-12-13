package Avançado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollections2 {
    public static void main(String[] args) {
        //1
        Collection<String> engenhariasAtuais = new ArrayList<String>();

        engenhariasAtuais.add("Telecomunicações");
        engenhariasAtuais.add("Biomédica");
        engenhariasAtuais.add("Computação");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Produção");

        System.out.println("Engenharias atuais: " + engenhariasAtuais);

        //2
        Collection<String> engenhariasFuturas = new ArrayList<String>();
        engenhariasFuturas.add("Mecânica");
        engenhariasFuturas.add("Mecatrônica");

        System.out.println("Engenharias futuras: " + engenhariasFuturas);

        //3
        Collection<String> todas = new ArrayList<String>();

        todas.addAll(engenhariasAtuais);
        todas.addAll(engenhariasFuturas);

        System.out.println("Todas as engenharias: " + todas);
    }
}