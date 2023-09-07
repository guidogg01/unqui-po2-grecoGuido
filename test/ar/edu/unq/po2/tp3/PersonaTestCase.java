package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona persona;
	
	@BeforeEach
	void setUp() {
		
		persona = new Persona("Guido", LocalDate.of(2001, 10, 16));
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
