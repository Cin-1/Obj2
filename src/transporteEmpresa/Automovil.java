package transporteEmpresa;

import java.util.ArrayList;
import java.util.HashSet;

public class Automovil extends Transporte{
		public Automovil() {
		this.destinos = new HashSet<String>();
		this.pesoMaximo=500.0;
		this.volumenMaximo= 2.0;
		this.destinosMaximo= 3;
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
		return !this.esDestinoExistente(paquete.getDestino()) && this.admiteNuevoDestino();
	}
	private Boolean esDestinoExistente(String destino) {
		return this.destinos.contains(destino);
	}
	private Boolean admiteNuevoDestino() {
		return this.destinos.size()<this.destinosMaximo;
	}
}
