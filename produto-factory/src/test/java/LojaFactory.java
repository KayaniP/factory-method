import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaFactoryTest {

    @Test
    void deveRetornarExcecaoParaLojaInexistente() {
        try {
            ILoja Loja = LojaFactory.obterLoja("Artigos Cozinha");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Loja inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLojaInvalida() {
        try {
            ILoja Loja = LojaFactory.obterLoja("Shopping");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Loja inválida", e.getMessage());
        }
    }
}