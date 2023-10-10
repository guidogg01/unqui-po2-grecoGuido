package ar.edu.unq.po2.tp9.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTestCase {

	private Empleado empleado;
	
	@BeforeEach
	void setUp() {
	
		empleado = new EmpleadoPasante(85);
	
	}
	

	@Test
	void testDeSueldoFinalDeUnEmpleado() {
		assertEquals(2958, this.empleado.sueldoFinal());
	}

}
