package transporteEmpresa;

public class Bicicleta extends Transporte{
	private String ciudad;
	
	public String getCiudad() {
		return ciudad;
	}
	private Boolean puedeLlevarEnlaCiudad(Paquete paquete) {
		return paquete.getDestino()==getCiudad();
	}
	private Boolean puedeLlevarPeso(Paquete paquete) {
		return (paquete.getPeso()<500&& paquete.getVolumen()<2);
	}
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return this.puedeLlevarPeso(paquete)&& this.puedeLlevarEnlaCiudad(paquete);
	}
	}
