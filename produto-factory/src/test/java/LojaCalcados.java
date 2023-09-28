import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaCalcados {

    @Test
    void deveAbrir() {
        ILoja loja = LojaFactory.obterLoja("Loja deCalçados");
        assertEquals("Loja Abriu", loja.abrir());
    }

    @Test
    void deveFechar() {
        ILoja servico = LojaFactory.obterLoja("Loja deCalçados");
        assertEquals("Loja Fechou", servico.fechar());
    }

}