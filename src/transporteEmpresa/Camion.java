package transporteEmpresa;


public class Camion extends Transporte{
	private Boolean puedeLlevarPesoYVolumen(Paquete paquete) {
		return paquete.getPeso()<16000&& paquete.getVolumen()<20;	
	}
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		return this.puedeLlevarPesoYVolumen(paquete);
	}
}