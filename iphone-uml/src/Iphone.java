public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO A CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("1199999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}