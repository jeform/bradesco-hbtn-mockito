package mockito;

/**
 * Serviço bancário que depende de ContaRepository
 */
public class BancoService {
    private ContaRepository contaRepository;

    /**
     * Construtor que recebe a dependência do repositório
     * 
     * @param contaRepository repositório de contas
     */
    public BancoService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    /**
     * Consulta o saldo de uma conta
     * 
     * @param numeroConta número da conta
     * @return saldo da conta
     */
    public double consultarSaldo(String numeroConta) {
        Conta conta = contaRepository.buscarConta(numeroConta);
        return conta.getSaldo();
    }

    /**
     * Realiza um depósito em uma conta
     * 
     * @param numeroConta número da conta
     * @param valor valor a ser depositado
     */
    public void depositar(String numeroConta, double valor) {
        Conta conta = contaRepository.buscarConta(numeroConta);
        conta.setSaldo(conta.getSaldo() + valor);
        contaRepository.salvar(conta);
    }
}
