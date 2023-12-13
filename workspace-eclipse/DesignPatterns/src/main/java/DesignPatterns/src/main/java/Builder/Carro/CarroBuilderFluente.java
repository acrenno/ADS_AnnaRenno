package Builder.Carro;

public class CarroBuilderFluente {

    private Carro carro = new Carro();

    public CarroBuilderFluente buildPorta(Porta[] portas){
        carro.setPortas(portas);
        return this;
    }

    public CarroBuilderFluente buildMotor(Motor motor) {
        carro.setMotor(motor);
        return this;
    }

    public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
        carro.setComputadorBordo(cb);
        return this;
    }

    public CarroBuilderFluente buildFreioABS(FreioABS f) {
        carro.setFreioABS(f);
        return this;
    }

    private void validarPortas() {
        if(carro.getPortas() == null) {
            throw new IllegalArgumentException("Não tem portas");
        }
        int nroPortas = carro.getPortas().length;
        if(nroPortas != 2 && nroPortas != 4) {
            throw new IllegalArgumentException("Número de portas inválido");
        }
    }

    private void validarMotor() {
        if(carro.getMotor() == null) {
            throw new IllegalArgumentException("Não tem motor");
        }
    }

    public Carro getCarro() {
        validarPortas();
        validarMotor();
        return carro;
    }
}