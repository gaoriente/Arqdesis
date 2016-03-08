package Ex01;

public class EfetuarSaque {

    private String agencia, conta;
    private double saldo, saque;

    public EfetuarSaque(String agencia, String conta, double saldo, double saque) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.saque = saque;
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

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void sacar() {
        EfetuarSaqueDAO dao = new EfetuarSaqueDAO();
        EfetuarSaqueTO to = new EfetuarSaqueTO(agencia, conta, saldo, saque);
        agencia = to.getAgencia();
        conta = to.getConta();
        saque = to.getSaque();
        saldo = to.getSaldo();
    }

}
