package ar.edu.unq.po2.tp9.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTestCase {

	private Empleado empleado;
	
	@BeforeEach
	void setUp() {
		
		empleado = new EmpleadoPlanta(3);
		
	}

	@Test
	void testDeSueldoFinalDeUnEmpleado() {
		
		assertEquals(3001,5, this.empleado.sueldoFinal());
		
	}

}
