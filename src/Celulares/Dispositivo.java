package Celulares;

public abstract class Dispositivo {
    private String modelo;
    private String numeroSerie;
    private String fabricante;

    // Construtor
    public Dispositivo(String modelo, String numeroSerie, String fabricante) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
    }
	
}
