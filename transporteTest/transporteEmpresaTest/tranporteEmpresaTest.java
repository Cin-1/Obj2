package transporteEmpresaTest;

import org.junit.*;

import transporteEmpresa.Automovil;
import transporteEmpresa.Bicicleta;
import transporteEmpresa.Camion;
import transporteEmpresa.Paquete;

public class tranporteEmpresaTest {
	
	@Test
	//puedo crear un paquete de 0.125 m3
	public void crearUnpaqueteDe0125() {
		//Preparacion
		Double valorEsperado = 0.125;
		Double valorObtenido = 0.0;
		Paquete nuevoPaquete = new Paquete(5,0.5,0.5,0.5);
		//Ejecucion
		valorObtenido = nuevoPaquete.getVolumen();
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el auto puede llevar un paquete de 0.5 kg
	public void puedeLLevarPaqueteDe5() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(5,0.5,0.5,0.5);
		//Ejecucion
		valorObtenido = nuevoAuto.puedeLlevar(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
 