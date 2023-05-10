import model.Iphone1;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone1 ip = new Iphone1();

        /* Telefone */
        ip.ligar_para(789456123);
        ip.desligarLigacao();
        ip.receberligacao();
     
        /* Web */

        ip.RequisicaoSite("www.sapo.pt");
        ip.adicionarAba();
        ip.atualizarPagina();
        ip.FecharSite();

        /* Música */

        ip.selecionarMusica("I need a hero");
        ip.tocarMusica();
        ip.Pausar();
        ip.tocarMusica();
        ip.Desligar();
    }
}
