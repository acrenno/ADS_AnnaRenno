package StrategyFrete;

public class FreteFedEx implements Fretavel {
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.0)
            return 0.00;

        else if (pesoEmKg < 40.0)
            return 45.00;

        else {
            return 75.00;
        }
    }
}