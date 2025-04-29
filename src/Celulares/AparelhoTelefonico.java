package Celulares;

public interface AparelhoTelefonico {
	public void ligar(String numero); 
	public void atender(); 
	public void desligar(String numero); 
	public void iniciarCorreioVoz();
	public void encerrarCorreioVoz();
}
