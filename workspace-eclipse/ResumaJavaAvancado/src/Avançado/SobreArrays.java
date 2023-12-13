package Avançado;

public class SobreArrays {

    public static void main(String[] args) {
        Animal[] arrayanimais = new Animal[10];

        arrayanimais[0] = new Animal(10,"Jose");
        arrayanimais[1] = new Animal(1,"Anna");
        arrayanimais[2] = new Animal(54,"Melissa");
        arrayanimais[3] = new Animal(2,"Pedro");

        System.out.println("ARRAY DE ANIMAIS");

        for (int i = 0; i < arrayanimais.length; i++) {
            if (arrayanimais[i]!=null) {
                System.out.println(arrayanimais[i].getId());
                System.out.println(arrayanimais[i].getName());

            }
        }
    }
}
