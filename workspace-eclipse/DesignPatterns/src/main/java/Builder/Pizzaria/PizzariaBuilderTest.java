<<<<<<< HEAD
package Builder.Pizzaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzariaBuilderTest {

    // cenario positivo
    @Test
    public void dadoPartesValidas_quandoGetPizza_entaoPizzaEhConstruida(){
        Pizza pizzaPronta = new PizzariaBuilder()
                .defineSize(1)
                .addCheese()
                .addPeperoni()
                .getPizza();

        assertNotNull(pizzaPronta);
        assertTrue(pizzaPronta.getSize() == 1);
        assertTrue(pizzaPronta.getFlagCheese());
        assertTrue(pizzaPronta.getFlagPeperoni());
    }

    // cenario negativo
    @Test
    public void dadoPizzaComTamanhoInvalido_quandoGetPizza_entaoLancaException(){
        Integer tamanhoInvalido = 4;

        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzariaBuilder()
                    .defineSize(tamanhoInvalido)
                    .addCheese()
                    .addPeperoni()
                    .getPizza();
        });
    }

    // cenario negativo
    @Test
    public void dadoPizzaSemIngredientes_quandoGetPizza_entaoLancaException(){
        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzariaBuilder()
                    .defineSize(1)
                    .getPizza();
        });
    }
=======
package Builder.Pizzaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzariaBuilderTest {

    // cenario positivo
    @Test
    public void dadoPartesValidas_quandoGetPizza_entaoPizzaEhConstruida(){
        Pizza pizzaPronta = new PizzariaBuilder()
                .defineSize(1)
                .addCheese()
                .addPeperoni()
                .getPizza();

        assertNotNull(pizzaPronta);
        assertTrue(pizzaPronta.getSize() == 1);
        assertTrue(pizzaPronta.getFlagCheese());
        assertTrue(pizzaPronta.getFlagPeperoni());
    }

    // cenario negativo
    @Test
    public void dadoPizzaComTamanhoInvalido_quandoGetPizza_entaoLancaException(){
        Integer tamanhoInvalido = 4;

        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzariaBuilder()
                    .defineSize(tamanhoInvalido)
                    .addCheese()
                    .addPeperoni()
                    .getPizza();
        });
    }

    // cenario negativo
    @Test
    public void dadoPizzaSemIngredientes_quandoGetPizza_entaoLancaException(){
        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzariaBuilder()
                    .defineSize(1)
                    .getPizza();
        });
    }
>>>>>>> c17b67154066372b0d93a1c33ab5f0ad1ae08856
}