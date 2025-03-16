package testes;

import main.java.factorymethod.IServico;
import main.java.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBitcoinTest {

    @Test
    void deveExecutarPagamento() {
        IServico servico = ServicoFactory.obterServico("Bitcoin");
        assertEquals("Pagamento efetivado", servico.Pagar());
    }
}
