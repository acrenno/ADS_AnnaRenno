package Banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    void rentabilizar() {
        System.out.println(0.2*saldo);

    }

}