package transporteEmpresa;

import java.util.ArrayList;
import java.util.Set;

public abstract class  Transporte {
	protected Set<String> destinos;
	protected ArrayList<Paquete> paquetes;
	protected Double pesoMaximo;
	protected Double volumenMaximo;
	protected Integer destinosMaximo;

	
	abstract protected Boolean puedeLlevarPorPeso(Paquete paquete);
	abstract protected Boolean puedeLlevarPorVolumen(Paquete paquete);
	abstract protected Boolean puedeLLevarPorCiudad(Paquete paquete);
	protected Boolean puedeLlevar(Paquete paquete) {
		return this.puedeLlevarPorPeso(paquete)&& this.puedeLlevarPorVolumen(paquete)&&this.puedeLLevarPorCiudad(paquete);
	 } 
	public void agregarPaquete(Paquete paquete) {
		if(this.puedeLlevar(paquete)) {
			this.destinos.add(paquete.getDestino());
			this.paquetes.add(paquete);
		}
	}
}