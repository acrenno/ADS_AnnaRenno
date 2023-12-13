package Contabilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContabilidadeTest {

    @Test
    void testeEmpresaMEI()
    {
        EmpresaMEI empresa = new EmpresaMEI(100.0);

        Double valorIREsperado = 27.5;

        assertEquals(valorIREsperado,empresa.getValorIR(),2);

        Double valorISSEsperado = 0.0;
        Double ISSatual = empresa.getValorISS();
        assertEquals(valorISSEsperado, ISSatual);


    }

    @Test
    void testeEmpresaSimples()
    {

        EmpresaSimples empresa = new EmpresaSimples(100.0);

        Double valorIREsperado = 15.0;
        assertEquals(valorIREsperado, empresa.getValorIR());

        Double valorISSEsperado = 8.0;
        assertEquals(valorISSEsperado, empresa.getValorISS());


    }

}