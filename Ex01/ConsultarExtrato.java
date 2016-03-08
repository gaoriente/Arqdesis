package Ex01;

public class ConsultarExtrato {
    
    private String agencia, conta;
    private double saldo, extrato;

    public ConsultarExtrato(String agencia, String conta, double saldo, double extrato) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.extrato = extrato;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getExtrato() {
        return extrato;
    }

    public void setExtrato(double extrato) {
        this.extrato = extrato;
    }
    
    public void consultar(){
        ConsultarExtratoDAO dao = new ConsultarExtratoDAO();
        ConsultarExtratoTO to = new ConsultarExtratoTO(agencia, conta, saldo, extrato);
        agencia = to.getAgencia();
        conta = to.getConta();
        saldo = to.getSaldo();
        extrato = to.getExtrato();
    }

    @Override
    public String toString() {
        return "ConsultarExtrato{" + "agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", extrato=" + extrato + '}';
    }
    
    
}
