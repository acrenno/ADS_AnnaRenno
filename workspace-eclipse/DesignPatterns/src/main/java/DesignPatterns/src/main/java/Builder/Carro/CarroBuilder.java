package Builder.Carro;

public class CarroBuilder {
    private Carro carro = new Carro();

    public void buildPortas(Porta[] portas) {
        carro.setPortas(portas);
    }

    public void buildMotor(Motor motor) {
        carro.setMotor(motor);
    }

    public void buildComputadorBordo(ComputadorBordo cb) {
        carro.setComputadorBordo(cb);
    }

    public void buildFreioABS(FreioABS f) {
        carro.setFreioABS(f);
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
