package Celulares;

public class Celular {
		public static void main(String args[]) {
			Iphone iphone = new Iphone("Iphone", "10", "Apple");
			
			System.out.println("Tocar Musica");
			iphone.selecionarMusica("Quero Te tocar");
			iphone.tocar();
			iphone.pausar();
			
			System.out.println("\nAparelho Telefonico");
			iphone.ligar("9999-9999");
			iphone.atender();
			iphone.desligar("9999-9999");
			iphone.iniciarCorreioVoz();
			iphone.encerrarCorreioVoz();
			
			System.out.println("\nNavegador Internet");
			iphone.exibirPagina("www.google.com");
			iphone.adicionarNovaAba();
			iphone.atualizarPagina();
			
		}

}
