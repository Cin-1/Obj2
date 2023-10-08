package transporteEmpresa;

public class Bicicleta extends Transporte{
	private String ciudad;
	
	public String getCiudad() {
		return ciudad;
	}
	private Boolean puedeLlevarEnlaCiudad(Paquete paquete) {
		return paquete.getDestino()==getCiudad();
	}
	private Boolean puedeLlevarPesoYVolumen(Paquete paquete) {
		return paquete.getPeso()<500&& paquete.getVolumen()<0.125;
	}
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return this.puedeLlevarPesoYVolumen(paquete);
	}
	}
