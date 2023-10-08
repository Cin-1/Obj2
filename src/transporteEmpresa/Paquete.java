package transporteEmpresa;

public class Paquete {

	private Integer peso;
	private Double volumen;
	
	public Paquete(Integer peso, Double altura,	Double ancho, Double profundidad) {
		this.peso = peso;
		this.volumen = altura * ancho * profundidad;
	}
	public Integer getPeso() {
		return peso;
	}
	public Double getVolumen() {
		return volumen;
	}
		
		
}
