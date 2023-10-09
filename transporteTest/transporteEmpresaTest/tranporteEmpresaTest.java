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
	//la bici no puede llevar un paquete de volumen mayor a 0.125
	public void biciNoPuedeLLevarPaqueteDeVolumenMayor() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Bicicleta nuevaBici = new Bicicleta();
		Paquete nuevoPaquete = new Paquete(5.0,1.3,3.5,3.5, "Hurlingham");
		//Ejecucion
		valorObtenido = nuevaBici.agregarPaquete(nuevoPaquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//el camion puede llevar un paquete de volumen 3.375
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
	@Test
	//el camion no puede llevar un paquete de volumen mayor a 20
	public void camionNoPuedeLlevarPaqueteDeVolumenMayorA20() {
		//Preparacion
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Camion nuevoCamion = new Camion();
		Paquete paquete = new Paquete(150.5,1.5,9.5,1.5, "Moron");
		//Ejecucion
		valorObtenido = nuevoCamion.agregarPaquete(paquete);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//puedo agregar dos paquetes con el mismo destino a mi bici
	public void biciPuedeDosPaquetesEnCastelar() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Bicicleta nuevaBici = new Bicicleta();
		Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
		Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
		nuevaBici.agregarPaquete(nuevoPaquete);
		//Ejecucion
		valorObtenido = nuevaBici.agregarPaquete(paquete2);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//no puedo agregar dos paquetes con distinto destino a mi bici
		public void biciNoPuedeLlevarDosPaquetesConDistintoDestino() {
			//Preparacion
			Boolean valorEsperado = Boolean.FALSE;
			Boolean valorObtenido = Boolean.TRUE;
			Bicicleta nuevaBici = new Bicicleta();
			Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
			nuevaBici.agregarPaquete(nuevoPaquete);
			//Ejecucion
			valorObtenido = nuevaBici.agregarPaquete(paquete2);
			//Comparacion
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
	@Test
	//no puedo agregar tres paquetes a mi bici
		public void biciNoPuedeLlevarTresPaquetes() {
			//Preparacion
			Boolean valorEsperado = Boolean.FALSE;
			Boolean valorObtenido = Boolean.TRUE;
			Bicicleta nuevaBici = new Bicicleta();
			Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			Paquete paquete3 = new Paquete(3.0,0.3,0.5,0.5, "Castelar");
			nuevaBici.agregarPaquete(nuevoPaquete);
			nuevaBici.agregarPaquete(paquete2);
			//Ejecucion
			valorObtenido = nuevaBici.agregarPaquete(paquete3);
			//Comparacion
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
	@Test
	//puedo agregar tres paquetes con distinto destino a mi auto
	public void autoPuedeLlevarPaquetesPorTresCiudades() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Automovil nuevoAuto = new Automovil();
		Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
		Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
		Paquete paquete3 = new Paquete(3.0,0.3,0.5,0.5, "Moron");
		nuevoAuto.agregarPaquete(nuevoPaquete);
		nuevoAuto.agregarPaquete(paquete2);
		//Ejecucion
		valorObtenido = nuevoAuto.agregarPaquete(paquete3);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	//no puedo agregar 4 paquetes con distintos destino a mi bici
		public void autoNoPuedeLlevarPaquetesPorLaCuartaCiudad() {
			//Preparacion
			Boolean valorEsperado = Boolean.FALSE;
			Boolean valorObtenido = Boolean.TRUE;
			Automovil nuevoAuto = new Automovil();
			Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
			Paquete paquete3 = new Paquete(3.0,0.3,0.5,0.5, "Moron");
			Paquete paquete4 = new Paquete(3.0,0.3,0.5,0.5, "Tres de Febrero");

			nuevoAuto.agregarPaquete(nuevoPaquete);
			nuevoAuto.agregarPaquete(paquete2);
			nuevoAuto.agregarPaquete(paquete3);

			//Ejecucion
			valorObtenido = nuevoAuto.agregarPaquete(paquete4);
			//Comparacion
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
	@Test
	//no puedo agregar paquetes con destintos repetidos a mi auto
		public void autoNoPuedeLlevarPaquetesConMismoDestino() {
			//Preparacion
			Boolean valorEsperado = Boolean.FALSE;
			Boolean valorObtenido = Boolean.TRUE;
			Automovil nuevoAuto = new Automovil();
			Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
			nuevoAuto.agregarPaquete(nuevoPaquete);
			//Ejecucion
			valorObtenido = nuevoAuto.agregarPaquete(paquete2);
			//Comparacion
			Assert.assertEquals(valorEsperado, valorObtenido);
		}
	@Test
	//puedo agregar 5 paquetes con distinto destino a mi camion
	public void camionPuedeLlevarPaquetesPorCincoCiudades() {
		//Preparacion
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Camion nuevoCamion = new Camion();
		Paquete nuevoPaquete = new Paquete(5.0,0.3,0.5,0.5, "Castelar");
		Paquete paquete2 = new Paquete(5.0,0.3,0.5,0.5, "Hurlingham");
		Paquete paquete3 = new Paquete(3.0,0.3,0.5,0.5, "Moron");
		Paquete paquete4 = new Paquete(3.0,0.3,0.5,0.5, "Tres de Febrero");
		Paquete paquete5 = new Paquete(3.0,0.3,0.5,0.5, "La Matanza");
		nuevoCamion.agregarPaquete(nuevoPaquete);
		nuevoCamion.agregarPaquete(paquete2);
		nuevoCamion.agregarPaquete(paquete3);
		nuevoCamion.agregarPaquete(paquete4);
		//Ejecucion
		valorObtenido = nuevoCamion.agregarPaquete(paquete5);
		//Comparacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	}
 