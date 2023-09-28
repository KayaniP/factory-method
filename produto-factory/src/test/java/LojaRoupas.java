import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaRoupas {

    @Test
    void deveAbrir() {
        ILoja loja = LojaFactory.obterLoja("Loja de Roupas");
        assertEquals("Loja Abriu", loja.abrir());
    }

    @Test
    void devePular() {
        ILoja servico = LojaFactory.obterLoja("Loja de Roupas");
        assertEquals("Loja Fechou", servico.fechar());
    }

}