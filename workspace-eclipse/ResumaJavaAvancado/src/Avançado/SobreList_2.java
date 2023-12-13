package Avançado;

import java.util.ArrayList;
import java.util.List;

public class SobreList_2 {

    public static void main(String[] args) {
        List<Animal> listadeAnimais = new ArrayList<>();
        listadeAnimais.add(new Animal(1L,"Tartaruga"));
        listadeAnimais.add(new Animal(2L,"Coelho"));
        listadeAnimais.add(new Animal(3L,"Cachorro"));
        listadeAnimais.add(new Animal(4L,"Gato"));
        listadeAnimais.add(new Animal(5L,"Girafa"));
        listadeAnimais.add(new Animal(6L,"Gato"));
    }

}