package transporteEmpresa;


public class Camion extends Transporte{
		
	@Override
	public Boolean puedeLlevar(Paquete paquete) {
		if(paquete.getPeso()<500&& paquete.getVolumen()<2) {
		return Boolean.TRUE;
		}
		else return Boolean.FALSE;
		}	
	}
