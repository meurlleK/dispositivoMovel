package Celulares;

public class Iphone extends Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	 public Iphone(String modelo, String numeroSerie, String fabricante) {
        super(modelo, numeroSerie, fabricante);
    }

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }
    
    @Override
    public void desligar(String numero) {
        System.out.println("Desigando o " + numero + ".");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    @Override
    public void encerrarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}

