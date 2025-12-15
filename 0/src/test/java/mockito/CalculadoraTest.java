package mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Classe de teste para Calculadora usando Mockito
 */
@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {
    
    @Mock
    private ServicoMatematico servicoMatematico;
    
    @InjectMocks
    private Calculadora calculadora;
    
    /**
     * Teste que simula o comportamento do ServicoMatematico
     * O mock retorna 5 quando somar é chamado com 2 e 3
     */
    @Test
    public void testSomar() {
        // Configurando o mock para retornar 5 quando somar(2, 3) for chamado
        when(servicoMatematico.somar(2, 3)).thenReturn(5);
        
        // Executando o método da calculadora
        int resultado = calculadora.somar(2, 3);
        
        // Verificando se o resultado é 5 (valor configurado no mock)
        assertEquals(5, resultado);
    }
}
