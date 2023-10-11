package ar.edu.unq.po2.tp9.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WikipediaPageTestCase {

	private WikipediaPage wPage1;
	private WikipediaPage wPage2;
	private WikipediaPage wPage3;
	private WikipediaPage wPage4;
	
	@BeforeEach
	void setUp() {
		wPage1 = new WikipediaPage("State Pattern Design");
		wPage2 = new WikipediaPage("Design Patterns");
		wPage3 = new WikipediaPage("Strategy Design Patterns");
		wPage4 = new WikipediaPage("Facade Design Patterns");
		
		wPage1.agregarLink(wPage2);
		wPage3.agregarLink(wPage2);
		wPage3.agregarLink(wPage4);
	}

	@Test
	void verificacionDeInicializacionDeUnaWikipediaPage() {
		String tituloEsperado = "State Pattern Design";
		assertEquals(tituloEsperado, this.wPage1.getTitle());
	}
	
	@Test
	void verificacionCuandoSeLinkeaUnaWikipediaPageAOtraWikipediaPage() {
		int cantidadDeLinksEsperado = 1;
		
		assertEquals(cantidadDeLinksEsperado, this.wPage1.getLinks().size());
	}
	
	@Test
	void verificacionCuandoSeLePideElInfoboxAUnaWikipediaPage() {
		IWikipediaPage valorEsperado = wPage1;
		String         claveEsperada = "State Pattern Design";
		
		//exercise
		this.wPage1.agregarInfobox(claveEsperada);
		
		assertEquals(valorEsperado, this.wPage1.getInfobox().get(claveEsperada));
	}
	
	@Test
	void verificacionCuandoDosPaginasTienenLinksEnComun() {		
		assertTrue(this.wPage1.tieneLinksEnComun(wPage3));
	}

}
