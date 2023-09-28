public class LojaUtensilios implements ILoja{

    public String andar() {
        return "Loja Abriu";
    }

    public String pular() {
        return "Loja Fechou";
    }

    @Override
    public String abrir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'abrir'");
    }

    @Override
    public String fechar() {
       
        throw new UnsupportedOperationException("Unimplemented method 'fechar'");
    }
}