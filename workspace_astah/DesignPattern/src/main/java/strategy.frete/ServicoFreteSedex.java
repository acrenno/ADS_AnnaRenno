package strategy.frete;

public class ServicoFreteSedex implements Freetavel{

    Override
    public double calcularValor(double pesoEmKg){@
        if (pesoEmKg < 10.0) {
            return 50.00;
        } else if (peso em kg <20.0){
            return 70.00;
        } else{
            return 90.00;
        }
    }
}