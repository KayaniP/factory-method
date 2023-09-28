public class LojaFactory {

    public static ILoja obterLoja(String loja) {
        Class classe= null;     //Class.forName("Loja" + loja);
        Object objeto = null; //classe.newIntance();
        try {
             
         
        }catch (Exception ex) {
            throw new IllegalArgumentException("Loja Inexistente");
        }
        if (!(objeto instanceof ILoja)) {
            throw new IllegalArgumentException("Loja Inválida");
        }
        return (ILoja) objeto;
    }
}
