package transporteEmpresa;

public class Paquete {

	private Integer peso;
	private Double volumen;
	private String destino;
	
	public Paquete(Integer peso, Double altura,	Double ancho, Double profundidad, String destino) {
		this.peso = peso;
		this.volumen = altura * ancho * profundidad;
		this.destino = destino;
	}
	public Integer getPeso() {
		return peso;
	}
	public Double getVolumen() {
		return volumen;
	}
	public String getDestino() {
		return destino;
	}
		
}
