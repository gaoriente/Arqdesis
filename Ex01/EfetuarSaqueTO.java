
package Ex01;

public class EfetuarSaqueTO {

    private String agencia, conta;
    private double saldo, saque;

    public EfetuarSaqueTO(String agencia, String conta, double saldo, double saque) {
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
    
    
}
