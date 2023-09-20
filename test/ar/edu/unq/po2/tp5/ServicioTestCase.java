package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTestCase {

	private Servicio servicio;
	
	@BeforeEach
	void setUp() {
		
		servicio = new Servicio(75, 4);
		
	}

	@Test
	void testDeVerificacionDeConstructor() {
		assertEquals(75, this.servicio.getCostoPorUnidad());
		assertEquals(4, this.servicio.getCantidadDeUnidad());
		assertEquals(300d, this.servicio.costo());
	}

}
