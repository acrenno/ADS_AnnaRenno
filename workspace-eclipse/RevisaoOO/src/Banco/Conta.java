package Banco;

import java.util.Scanner;

public abstract class Conta {
    double saldo=0;
    Scanner s = new Scanner( System.in);
    public Conta(double saldo) {
        super();
        this.saldo = saldo;
    }
    void depositar(Double Valor) {
        saldo= saldo+Valor;
    }
    void sacar(Double Valor) {
        saldo= saldo-Valor;
    }



    abstract void rentabilizar();
}