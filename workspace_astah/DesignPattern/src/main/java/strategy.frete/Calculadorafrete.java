package strategy.frete;
public class Calculadorafrete {

    public double calcularValor(Fretavel fretavel, double pesoEmKg) {
        double valorCalculado = Fretavel.calcularValor(pesoEmKg);
        return valorCalculado;
    }
}