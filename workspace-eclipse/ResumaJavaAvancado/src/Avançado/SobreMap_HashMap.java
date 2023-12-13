package Avançado;

import java.util.HashMap;
import java.util.Map;

public class SobreMap_HashMap {

    public static void main(String[] args) {


        Animal a1 = new Animal(2, "Coelho");
        Animal a2 = new Animal(1, "Vaca");
        Animal a3 = new Animal(3, "Lagartixa");
        Animal a4 = new Animal(4, "Rato");
        Animal a5 = new Animal(5, "Cavalo");

        Map<String, Animal> mapadeAnimais = new HashMap<>();

        mapadeAnimais.put("Coe", a1);
        mapadeAnimais.put("Vac", a2);
        mapadeAnimais.put("Lag", a3);
        mapadeAnimais.put("Rat", a4);
        mapadeAnimais.put("Cav", a5);

        System.out.println(mapadeAnimais);
    }
}
