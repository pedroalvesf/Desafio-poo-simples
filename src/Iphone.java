public class Iphone implements Reprodutor, Aparelho, NavegadorInternet{


    @Override
    public void ligar() {
        System.out.println("Ligando Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Iphone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void desligarCorreioVoz() {
        System.out.println("Desligando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando pagina");
    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
}
