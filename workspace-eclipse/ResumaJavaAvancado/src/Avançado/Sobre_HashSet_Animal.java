package Avançado;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sobre_HashSet_Animal {

    public static void main(String[] args) {

        Set <Animal> animal = new TreeSet<>();

        animal.add(new Animal(1,"Tartaruga"));
        animal.add(new Animal(2,"Coelho"));
        animal.add(new Animal(3,"Cachorro"));
        animal.add(new Animal(4,"Gato"));

        animal.forEach(System.out::println);



    }
}
