package mockito;

/**
 * Classe que representa uma conta bancária
 */
public class Conta {
    private String numero;
    private double saldo;
    
    /**
     * Construtor da classe Conta
     * 
     * @param numero número da conta
     * @param saldo saldo inicial da conta
     */
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    /**
     * Obtém o número da conta
     * 
     * @return número da conta
     */
    public String getNumero() {
        return numero;
    }
    
    /**
     * Define o número da conta
     * 
     * @param numero número da conta
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    /**
     * Obtém o saldo da conta
     * 
     * @return saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Define o saldo da conta
     * 
     * @param saldo saldo da conta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
