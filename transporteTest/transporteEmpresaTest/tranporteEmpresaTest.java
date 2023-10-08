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
		Paquete nuevoPaquete = new Paquete(5.0,0.5,0.5,0.5, "Moron");
		//Ejecucion
		valorObtenido = nuevoPaquete.getVolumen();
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el auto puede llevar un paquete de 25 kg
	public void autoPuedeLLevarPaqueteDe25() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(25.0,0.5,0.5,0.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoAuto.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el auto no puede llevar un paquete de 2500 kg
	public void autoNoPuedeLLevarPaqueteDe2500() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(2500.0,0.5,0.5,0.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoAuto.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//la bici puede llevar un paquete de 5kg
	public void biciPuedeLLevarPaqueteDe5() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Bicicleta nuevaBici = new Bicicleta();
		Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevaBici.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//la bici no puede llevar un paquete de 50kg
	public void biciNoPuedeLLevarPaqueteDe5() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Bicicleta nuevaBici = new Bicicleta();
		Paquete nuevoPaquete = new Paquete(50.0,0.3,0.5,0.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevaBici.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el camion puede llevar un paquete de 1500 kg
	public void camionPuedeLlevar1500() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Camion nuevoCamion = new Camion();
		Paquete nuevoPaquete = new Paquete(1500.0,1.65,1.57,3.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoCamion.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el camion no puede llevar un paquete de 18000 kg
	public void camionPuedeLlevar18000() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Camion nuevoCamion = new Camion();
		Paquete nuevoPaquete = new Paquete(18000.0,1.65,1.57,3.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoCamion.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el auto puede llevar un paquete de volumen 1.72
	public void autoPuedeLLevarPaqueteDeVolumen172() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(25.0,1.2,1.2,1.2, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoAuto.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el auto no puede llevar un paquete de volumen mayor a 2
	public void autoNoPuedeLLevarPaqueteDeVolumenMayora2() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(25.0,12.2,1.2,1.2, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevoAuto.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//la bici puede llevar un paquete de volumen 0.075
	public void biciPuedeLLevarPaqueteDeVolumen0075() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Bicicleta nuevaBici = new Bicicleta();
		Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevaBici.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el camion puede llevar un paquete de 3.375
	public void camionPuedeLlevar2PaquetesDeVolumen3375() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Camion nuevoCamion = new Camion();
		Paquete nuevoPaquete = new Paquete(150.5,1.5,1.5,1.5, "Hurlingham");
		Paquete paquete2 = new Paquete(150.5,1.5,1.5,1.5, "Moron");
		nuevoCamion.agregarPaquete(nuevoPaquete);
		//Ejecucion
		valorObtenido = nuevoCamion.agregarPaquete(paquete2);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	}
 