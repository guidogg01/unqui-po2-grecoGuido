package ar.edu.unq.po2.tp9.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTestCase {

	private Empleado empleado;
	
	@BeforeEach
	void setUp() {
		
		empleado = new EmpleadoTemporario(30, true, false);
		
	}

	@Test
	void testDeSueldoFinalDeUnEmpleado() {
		
		assertEquals(1087,5, this.empleado.sueldoFinal());
		
	}

}
