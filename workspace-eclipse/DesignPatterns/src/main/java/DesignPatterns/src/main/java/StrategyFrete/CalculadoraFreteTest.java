package StrategyFrete;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraFreteTest {
    @Test
    void deveCalcularFreteParaDHL() {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel fretavel = new ServiçoFreteDHL();

        double valorAtual = calculadora.calcularValor(fretavel, 10.0);
        double valorEsperado = 100.00;

        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    void deveCalcularFreteParaSedex() {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel fretavel = new FreteSedex();

        double valorAtual = calculadora.calcularValor(fretavel, 5.0);
        double valorEsperado = 50.00;

        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    void deveCalcularFreteParaJadLog() {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel fretavel = new FreteJadLog();

        double valorAtual = calculadora.calcularValor(fretavel, 25.0);
        double valorEsperado = 0.00;

        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    void deveCalcularFreteParaFedEx() {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel fretavel = new FreteFedEx();

        double valorAtual = calculadora.calcularValor(fretavel, 35.0);
        double valorEsperado = 45.00;

        assertEquals(valorEsperado, valorAtual);
    }

// perdeu o sentido apos a refatoracao
//	@Test
//	void deveLancarExceptionParaServicoDesconhecido() {
//		CalculadoraFrete calculadora = new CalculadoraFrete();
//
//		try {
//			calculadora.calcularValor("zzz", 10.0);
//			fail("Deveria ter lancado exception");
//
//		}catch(RuntimeException e) {
//			//ok, exception esperada
//		}
//
//	}

}