package transporteEmpresa;

import java.util.ArrayList;
import java.util.HashSet;

public class Bicicleta extends Transporte{
	Integer paquetesMaximo;
	public Bicicleta() {
		this.destinos = new HashSet<String>();
		this.pesoMaximo=15.0;
		this.volumenMaximo= 0.125;
		this.destinosMaximo= 1;
		this.paquetes= new ArrayList<Paquete>();
		this.paquetesMaximo = 2;
		
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
		return this.puedeLlevarCantidadDePaquetes() && this.admiteDestino(paquete.getDestino());
	}
	private Boolean puedeLlevarCantidadDePaquetes() {
		return this.paquetes.size()<this.paquetesMaximo;
	}
	private Boolean admiteDestino(String destino) {
		return this.destinos.size()<this.destinosMaximo || this.destinos.contains(destino);
	} 
	}
