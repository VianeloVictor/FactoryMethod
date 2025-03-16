package testes;

import main.java.factorymethod.IServico;
import main.java.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPixTest {

    @Test
    void deveExecutarPagamento() {
        IServico servico = ServicoFactory.obterServico("Pix");
        assertEquals("Pagamento efetivado", servico.Pagar());
    }
}
