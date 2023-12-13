package Avançado;
import java.util.Set;
import java.util.TreeSet;

public class SobreSet_2{

    public static void main(String[] args) {

        Set<String> setDeFrutas = new TreeSet<>();

        setDeFrutas.add("Manga");
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Limao");
        setDeFrutas.add("Manga");

        System.out.println(setDeFrutas);
    }

}
