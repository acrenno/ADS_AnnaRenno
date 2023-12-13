package strategy.frete;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadorafreteteste {

    @Test
    public void deveCalcularFreteParaDHL(){
        Calculadorafrete calculadora = new Calculadorafrete();

        Fretavel fretavel = new ServicofreteDHL();

        double valorAtual = calculadora.calcularValor(fretavel, 12.00);
        double ValorEsperado = 100.00;
        assertEquals(ValorEsperado, valorAtual);
    }

    @Test
    public void deveCalcularFreteParaSedex(){
        Calculadorafrete calculadora = new Calculadorafrete();

        Fretavel fretavel = new ServicofreteSedex();

        double valorAtual = calculadora.calcularValor(fretavel, 12.00);
        double ValorEsperado = 50.00;
        assertEquals(ValorEsperado, valorAtual);
    }

    @Test
    public void deveCalcularFreteParaJadlog(){
        Calculadorafrete calculadora = new Calculadorafrete();

        Fretavel fretavel = new ServicofreteJadlog();

        double valorAtual = calculadora.calcularValor(fretavel, 12.00);
        double ValorEsperado = 0.00;
        assertEquals(ValorEsperado, valorAtual);
    }
    //perdeu o sentido
    //@Test
    //public void deLancarExceptionParaServicoDesconhecido(){
     //   Calculadorafrete calculadora = new Calculadorafrete();
       // try{
         //   calculadora.calcularValor("ZZZ", 10.00);
           // fail("devia ter lancado Exception");
        //}catch(RuntimeException e){
            //ok
        //}
    //}
}