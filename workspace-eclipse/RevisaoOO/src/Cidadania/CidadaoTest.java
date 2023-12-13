package Cidadania;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CidadaoTest {

    @Test
    void test() {
        Cidadao CidadaoAnna = new Cidadao("Anninha", 19, "Feminio", "13184201643");
        System.out.println(CidadaoAnna.nome);
        System.out.println(CidadaoAnna.idade);
        System.out.println(CidadaoAnna.sexo);
        System.out.println(CidadaoAnna.cpf);
    }

}