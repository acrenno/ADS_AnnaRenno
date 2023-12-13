package Contabilidade;

public class EmpresaSimples implements Tributavel {

    static final Double Taxa_IR_EmpresaSimples = 0.15;
    static final Double Taxa_ISS_EmpresaSimples = 0.08;

    Double faturamentoMensal;
    public EmpresaSimples (Double faturamentoMensal) {
        super ();
        this.faturamentoMensal = faturamentoMensal;
    }
    @Override
    public Double getValorIR() {
        // TODO Auto-generated method stub
        return this.faturamentoMensal*Taxa_IR_EmpresaSimples;
    }
    @Override
    public Double getValorISS() {
        // TODO Auto-generated method stub
        return this.faturamentoMensal*Taxa_ISS_EmpresaSimples;
    }
}
