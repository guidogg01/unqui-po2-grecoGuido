package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipoDeTrabajo;

	private Trabajador trabajador1;
	private Trabajador trabajador2;
	private Trabajador trabajador3;
	private Trabajador trabajador4;
	private Trabajador trabajador5;
	
	@BeforeEach
	void setUp() {
		
		equipoDeTrabajo = new EquipoDeTrabajo("SONY");
		
		trabajador1 = new Trabajador("Guido", "Greco", 21);
		trabajador2 = new Trabajador("Juan Cruz", "Maggiani", 30);
		trabajador3 = new Trabajador("Macarena", "Maggiani", 32);
		trabajador4 = new Trabajador("Facundo", "Gozio", 24);
		trabajador5 = new Trabajador("Ignacio", "Cirilli", 21);
		
		equipoDeTrabajo.agregarTrabajador(trabajador1);
		equipoDeTrabajo.agregarTrabajador(trabajador2);
		equipoDeTrabajo.agregarTrabajador(trabajador3);
		equipoDeTrabajo.agregarTrabajador(trabajador4);
		equipoDeTrabajo.agregarTrabajador(trabajador5);
		
	}
	
	@Test
	void testDeInicializacionDeUnEquipoDeTrabajado() {
		assertEquals(5, equipoDeTrabajo.getTrabajadores().size());
		assertEquals("Facundo", equipoDeTrabajo.getTrabajadores().get(3).getNombre());
	}
	
	@Test
	void testPromedioDeEdadDeIntegrantes() {
		assertEquals(25.6, equipoDeTrabajo.promedioDeEdadDeIntegrantes());
	}

}
