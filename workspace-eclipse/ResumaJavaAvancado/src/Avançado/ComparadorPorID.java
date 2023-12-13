package Avançado;

import java.util.Comparator;

public class ComparadorPorID implements Comparator<Animal>
{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getId().compareTo(o2.getId());
    }
}