package Contabilidade;

public class EmpresaMEI implements Tributavel {

    static final Double Taxa_ISS_EmpresaMEI = 0.0;
    static final Double Taxa_IR_EmpresaMEI = 0.275;

    Double faturamentoMensal;
    public EmpresaMEI (Double faturamentoMensal) {
        super ();
        this.faturamentoMensal = faturamentoMensal;
    }
    @Override
    public Double getValorIR() {
        // TODO Auto-generated method stub
        return this.faturamentoMensal*Taxa_IR_EmpresaMEI;
    }
    @Override
    public Double getValorISS() {
        // TODO Auto-generated method stub
        return this.faturamentoMensal*Taxa_ISS_EmpresaMEI;
    }



}