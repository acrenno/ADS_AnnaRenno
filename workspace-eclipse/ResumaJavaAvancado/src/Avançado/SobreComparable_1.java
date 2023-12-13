package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SobreComparable_1 {
    public static void main(String[] args) {
        List<String> listaDeAlimentos = new ArrayList<String>();
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        System.out.printf("Pela ordem de inserção:");
        System.out.println(listaDeAlimentos);

        System.out.println("Pela ordem de alfabética:");
        Collections.sort(listaDeAlimentos);
        System.out.println(listaDeAlimentos);

    }
}