package mockito;

/**
 * Classe Calculadora que depende de ServicoMatematico
 */
public class Calculadora {
    
    private ServicoMatematico servicoMatematico;
    
    /**
     * Construtor que recebe a dependência de ServicoMatematico
     * 
     * @param servicoMatematico serviço matemático a ser utilizado
     */
    public Calculadora(ServicoMatematico servicoMatematico) {
        this.servicoMatematico = servicoMatematico;
    }
    
    /**
     * Método que usa o serviço matemático para somar dois números
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return servicoMatematico.somar(a, b);
    }
}
