package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {

    @Test
    void testaContaCoorrente() {
        Conta c2 = new ContaCorrente(0);
        c2.depositar(110.00);
        c2.sacar(10.00);
        c2.rentabilizar();
        double saldoAtual = c2.saldo;
        System.out.println("Saldo Atual: " + saldoAtual);
        double saldoEsperado = 101.00;
        assertEquals(saldoAtual, saldoEsperado);
    }
    @Test
    void testaContaPoupanca() {
        Conta c1 = new ContaPoupanca(0);
        c1.depositar(1100.00);
        c1.sacar(100.00);
        c1.rentabilizar();
        double saldoAtual = c1.saldo;
        System.out.println("Saldo Atual: " + saldoAtual);
        double saldoEsperado=1020.00;
        assertEquals(saldoAtual, saldoEsperado);



    }
}