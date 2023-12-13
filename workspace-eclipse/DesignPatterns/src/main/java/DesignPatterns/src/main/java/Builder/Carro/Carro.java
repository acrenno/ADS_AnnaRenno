package Builder.Carro;

public class Carro {

    private Porta[] portas;

    private Motor motor;

    private ComputadorBordo computadorBordo;

    private FreioABS freioABS;

    //acessores (getters e setters)

    public Porta[] getPortas() {
        return portas;
    }

    public Motor getMotor() {
        return motor;
    }

    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    public FreioABS getFreioABS() {
        return freioABS;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public void setFreioABS(FreioABS freioABS) {
        this.freioABS = freioABS;
    }
}