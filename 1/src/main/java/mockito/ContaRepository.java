package mockito;

/**
 * Interface para repositório de contas bancárias
 */
public interface ContaRepository {
    
    /**
     * Busca uma conta pelo número
     * 
     * @param numero número da conta a ser buscada
     * @return a conta encontrada ou null se não existir
     */
    Conta buscarConta(String numero);
    
    /**
     * Salva uma conta no repositório
     * 
     * @param conta conta a ser salva
     */
    void salvar(Conta conta);
}
