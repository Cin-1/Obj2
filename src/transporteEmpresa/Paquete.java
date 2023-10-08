package transporteEmpresa;

public class Paquete {

	private Double peso;
	private Double volumen;
	private String destino;
	
	public Paquete(Double peso, Double altura,	Double ancho, Double profundidad, String destino) {
		this.peso = peso;
		this.volumen = altura * ancho * profundidad;
		this.destino = destino;
	}
	public Double getPeso() {
		return peso;
	}
	public Double getVolumen() {
		return volumen;
	}
	public String getDestino() {
		return destino;
	}
		
}
