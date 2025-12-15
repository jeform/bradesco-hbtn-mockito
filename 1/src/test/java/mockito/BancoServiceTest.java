package mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Classe de teste para BancoService usando Mockito
 */
public class BancoServiceTest {

    @Test
    public void testConsultarSaldo() {
        // Criando mock do repositório
        ContaRepository contaRepository = Mockito.mock(ContaRepository.class);

        // Criando conta simulada
        Conta contaSimulada = new Conta("12345", 1000.0);

        // Definindo comportamento do mock
        when(contaRepository.buscarConta("12345")).thenReturn(contaSimulada);

        // Criando serviço com o mock
        BancoService bancoService = new BancoService(contaRepository);

        // Testando consulta de saldo
        double saldo = bancoService.consultarSaldo("12345");

        // Verificando se o saldo está correto
        assertEquals(1000.0, saldo);

        // Verificando se o método buscarConta foi chamado
        verify(contaRepository, times(1)).buscarConta("12345");
    }

    @Test
    public void testDepositar() {
        // Criando mock do repositório
        ContaRepository contaRepository = Mockito.mock(ContaRepository.class);

        // Criando conta simulada
        Conta contaSimulada = new Conta("12345", 1000.0);

        // Definindo comportamento do mock
        when(contaRepository.buscarConta("12345")).thenReturn(contaSimulada);

        // Criando serviço com o mock
        BancoService bancoService = new BancoService(contaRepository);

        // Executando depósito
        bancoService.depositar("12345", 500.0);

        // Verificando se o saldo foi atualizado
        assertEquals(1500.0, contaSimulada.getSaldo());

        // Verificando se os métodos foram chamados corretamente
        verify(contaRepository, times(1)).buscarConta("12345");
        verify(contaRepository, times(1)).salvar(contaSimulada);
    }
}
