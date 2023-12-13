package HashSet;

import java.util.HashSet;
import java.util.Set;

public class SobreSet_HashSet_String {

    public static void main(String[] args) {

        Set<String> setDeFrutas = new HashSet<>();

        setDeFrutas.add("Manga");
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Limao");
        setDeFrutas.add("Manga");

        System.out.println(setDeFrutas);
    }

}
