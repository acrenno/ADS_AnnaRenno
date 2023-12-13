package Banco;

public class ContaCorrente extends Conta{



    public ContaCorrente(double saldo) {
        super(saldo);

    }

    @Override
    void rentabilizar() {
        System.out.println(0.1*saldo);
    }


}