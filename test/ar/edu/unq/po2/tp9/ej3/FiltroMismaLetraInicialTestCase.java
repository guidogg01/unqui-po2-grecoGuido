package ar.edu.unq.po2.tp9.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroMismaLetraInicialTestCase {
	
	private FiltroMismaLetraInicial filtro;
	private WikipediaPage page1;
	private WikipediaPage page2;
	private WikipediaPage page3;
	private WikipediaPage page4;

	@BeforeEach
	void setUp() {
		filtro = new FiltroMismaLetraInicial();
		page1  = mock(WikipediaPage.class);
		page2  = mock(WikipediaPage.class);
		page3  = mock(WikipediaPage.class);
		page4  = mock(WikipediaPage.class);
	}

	@Test
	void verificacionDeFiltroPorMismaLetraInicial() {
		//mockeando
		when(page1.getTitle()).thenReturn("State Design Pattern");
		when(page2.getTitle()).thenReturn("Strategy Design Pattern");
		when(page3.getTitle()).thenReturn("Observer Design Pattern");
		when(page4.getTitle()).thenReturn("Adapter Design Pattern");
		
		List<IWikipediaPage> paginasAFiltrar    = Arrays.asList(page2, page3, page4);
		
		List<IWikipediaPage> paginasYaFiltradas = this.filtro.getSimilarPage(page1, paginasAFiltrar);
		
		assertTrue(paginasYaFiltradas.contains(page2));
		assertEquals(1, paginasYaFiltradas.size());
	}
}
