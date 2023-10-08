package transporteEmpresa;

import java.util.ArrayList;
import java.util.HashSet;

public class Camion extends Transporte{
	public Camion() {
		this.destinos = new HashSet<String>();
		this.pesoMaximo=1600.0;
		this.volumenMaximo= 20.0;
		this.paquetes= new ArrayList<Paquete>();
	}
	@Override
	protected Boolean puedeLlevarPorPeso(Paquete paquete) {
		return paquete.getPeso()<= this.pesoMaximo;
	}
	@Override
	protected  Boolean puedeLlevarPorVolumen(Paquete paquete) {
		return paquete.getVolumen() <= this.volumenMaximo;
	}
	@Override
	 protected Boolean puedeLLevarPorCiudad(Paquete paquete) {
		return Boolean.TRUE;
	}
}