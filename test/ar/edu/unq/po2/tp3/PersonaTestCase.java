package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona persona;
	private Persona persona2;
	private Persona persona3;
	
	@BeforeEach
	void setUp() {
		
		persona  = new Persona("Guido", LocalDate.of(2001, 10, 16));
		persona2 = new Persona("Juan Cruz", LocalDate.of(1993, 04, 12));
		persona3 = new Persona("Macarena", LocalDate.of(1990, 06, 10));
		
	}

	@Test
	void testDeInializacionDeUnaPersona() {
		//Nombre de persona esperado.
		assertEquals("Guido", persona.getNombre());
		assertEquals(LocalDate.of(2001, 10, 16), persona.getFechaDeNacimiento());
		assertEquals(21, persona.edad());
	}
	
	@Test
	void testDeVerificacionCuandoUnaPersonaEsMasChicaQueLaOtra() {
		assertTrue(persona.menorQue(persona2));
		assertFalse(persona3.menorQue(persona2));
	}

}
