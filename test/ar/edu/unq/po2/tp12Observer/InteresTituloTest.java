package ar.edu.unq.po2.tp12Observer;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterestTituloTest {
	
	private Persona persona1;
	private Persona persona2;

	@BeforeEach
	void setUp(){

		persona1 = new Persona("Guido");
		persona2 = new Persona("Fabrizio");
		
	}

	@Test

	void test() {

		InteresTitulo i = new InteresTitulo(new ArrayList<Persona>(), "Java");
		InteresTitulo i2 = new InteresTitulo(new ArrayList<Persona>(), "Smalltalk");

		i.agregarPersona(persona1);

		i2.agregarPersona(persona2);

		i2.agregarPersona(persona1);

	}



}