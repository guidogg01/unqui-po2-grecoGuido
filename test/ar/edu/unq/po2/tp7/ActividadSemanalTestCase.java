package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTestCase {

	private ActividadSemanal actividad1;
	
	@BeforeEach
	void setUp() {
		
		actividad1 = new ActividadSemanal(DiaDeLaSemana.MARTES, 1600, 2, Deporte.FUTBOL); //1600 = 16:00hs
		
	}

	@Test
	void testDeInicializacionDeUnaActividadSemanal() {
		
		assertEquals(DiaDeLaSemana.MARTES, actividad1.getDiaDeLaSemana());
		assertEquals(1600, actividad1.getHoraDeInicio());
		assertEquals(2, actividad1.getDuracion());
		assertEquals(Deporte.FUTBOL, actividad1.getDeporteQueSePractica());
	
	}
	
	@Test
	void testCuandoDeCostoDeUnaActividadSemanal() {
		
		assertEquals(900d, actividad1.costoDeActividadSemanal());
		
	}

}
