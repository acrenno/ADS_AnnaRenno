<<<<<<< HEAD
package Builder.Carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderFluenteTest {
    @Test
    public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //construindo de maneira fluente
        Carro carroPronto = new CarroBuilderFluente()
                .buildPorta(portas)
                .buildMotor(motorVTEC)
                .buildComputadorBordo(computadorBordoSiemens)
                .buildFreioABS(freioBosch)
                .getCarro();

        //validando carro
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }
=======
package Builder.Carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderFluenteTest {
    @Test
    public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
        // partes validas
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        //construindo de maneira fluente
        Carro carroPronto = new CarroBuilderFluente()
                .buildPorta(portas)
                .buildMotor(motorVTEC)
                .buildComputadorBordo(computadorBordoSiemens)
                .buildFreioABS(freioBosch)
                .getCarro();

        //validando carro
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }
>>>>>>> c17b67154066372b0d93a1c33ab5f0ad1ae08856
}