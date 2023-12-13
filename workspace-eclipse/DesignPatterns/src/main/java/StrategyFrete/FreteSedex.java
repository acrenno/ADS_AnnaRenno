package StrategyFrete;

public class FreteSedex implements Fretavel {
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 10.0)
            return 50.00;

        else if (pesoEmKg < 20.0)
            return 70.00;

        else {
            return 90.00;
        }
    }
}
