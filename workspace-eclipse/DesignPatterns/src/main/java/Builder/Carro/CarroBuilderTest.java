<<<<<<< HEAD
package Builder.Carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    // cenario positivo
    @Test
    public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildPortas(portas);
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);
        Carro carroPronto = carroBuilder.getCarro();

        //validando carro
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }

    //cenario negativo
    @Test
    public void dadoCarroSemMotor_quandoGetCarro_entaoLancaException() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildPortas(portas);
        //aqui seria o motor
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);

        try{
            Carro carroPronto = carroBuilder.getCarro();
            fail("Deveria ter lançado exceção");
        } catch (IllegalArgumentException e) {
            System.out.println("Lancou exception como esperado");
        }
    }

    //cenario negativo
    @Test
    public void dadoCarroSemPorta_quandoGetCarro_entaoLancaException() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        //aqui seria as portas
        carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);

        try{
            Carro carroPronto = carroBuilder.getCarro();
            fail("Deveria ter lançado exceção");
        } catch (IllegalArgumentException e) {
            System.out.println("Lancou exception como esperado");
        }
    }
=======
package Builder.Carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    // cenario positivo
    @Test
    public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildPortas(portas);
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);
        Carro carroPronto = carroBuilder.getCarro();

        //validando carro
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }

    //cenario negativo
    @Test
    public void dadoCarroSemMotor_quandoGetCarro_entaoLancaException() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildPortas(portas);
        //aqui seria o motor
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);

        try{
            Carro carroPronto = carroBuilder.getCarro();
            fail("Deveria ter lançado exceção");
        } catch (IllegalArgumentException e) {
            System.out.println("Lancou exception como esperado");
        }
    }

    //cenario negativo
    @Test
    public void dadoCarroSemPorta_quandoGetCarro_entaoLancaException() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //invocando CarroBuilder
        CarroBuilder carroBuilder = new CarroBuilder();
        //aqui seria as portas
        carroBuilder.buildMotor(motorVTEC);
        carroBuilder.buildComputadorBordo(computadorBordoSiemens);
        carroBuilder.buildFreioABS(freioBosch);

        try{
            Carro carroPronto = carroBuilder.getCarro();
            fail("Deveria ter lançado exceção");
        } catch (IllegalArgumentException e) {
            System.out.println("Lancou exception como esperado");
        }
    }
>>>>>>> c17b67154066372b0d93a1c33ab5f0ad1ae08856
}