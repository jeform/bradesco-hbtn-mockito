package mockito;

/**
 * Implementação da interface ServicoMatematico
 */
public class ServicoMatematicoImpl implements ServicoMatematico {
    
    /**
     * Implementação do método somar que retorna a soma de dois números
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return a soma de a e b
     */
    @Override
    public int somar(int a, int b) {
        return a + b;
    }
}
