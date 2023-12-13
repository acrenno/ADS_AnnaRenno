package Avançado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SobreCollections {

    public static void main(String[] args) {
        Collection<String> colecao = new ArrayList<String>();

        colecao.add("Gato");
        colecao.add("Pantera");
        colecao.add("Cachorro");

        System.out.println(colecao);
    }

    private static Collection<String> buildCollectionImplementation(){
        return new TreeSet<String>();
    }

}
