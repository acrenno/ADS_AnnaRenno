package Avançado;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {

    public static void main(String[] args) {
        List<Animal> ListaDeAnimais = new ArrayList<>();

        ListaDeAnimais.add(new Animal(4L, "Gato"));
        ListaDeAnimais.add(new Animal(3L, "Cachorro"));
        ListaDeAnimais.add(new Animal(2L, "Coelho"));
        ListaDeAnimais.add(new Animal(6L, "Gato"));
        ListaDeAnimais.add(new Animal(1L, "Tartaruga"));
        ListaDeAnimais.add(new Animal(5L, "Girafa"));

        System.out.println("Ordenado pelo nome");
        Collections.sort(ListaDeAnimais, new ComparadorPorNome());
        System.out.print(ListaDeAnimais);

        System.out.println("Ordenado pelo id");
        Collections.sort(ListaDeAnimais, new ComparadorPorID());
        System.out.print(ListaDeAnimais);
    }

}