package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador1;
	
	@BeforeEach
	void setUp() {
		trabajador1 = new Trabajador("Guido", "Greco", 21);
	}
	
	@Test
	void testDeInicializacionDeUnTrabajador() {
		assertEquals("Guido", trabajador1.getNombre());
		assertEquals("Greco", trabajador1.getApellido());
		assertEquals(21, trabajador1.getEdad());
	}
	
	

}
