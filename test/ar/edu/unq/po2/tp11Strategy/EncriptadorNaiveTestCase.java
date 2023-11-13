package ar.edu.unq.po2.tp11Strategy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11.Strategy.ej1.EncriptadorNaive;
import ar.edu.unq.po2.tp11.Strategy.ej1.EncriptadorPorNumero;
import ar.edu.unq.po2.tp11.Strategy.ej1.EncriptadorPorPalabrasAleatorias;
import ar.edu.unq.po2.tp11.Strategy.ej1.EncriptadorPorVocal;

class EncriptadorNaiveTestCase {

	private EncriptadorNaive encriptador;
	
	private EncriptadorPorPalabrasAleatorias encriptadorPalabras;
	private EncriptadorPorNumero encriptadorPorNumero;
	private EncriptadorPorVocal encriptadorPorVocal;
	
	
	@BeforeEach
	void setUp() {
		
		encriptador = new EncriptadorNaive();
		
		encriptadorPalabras  = mock(EncriptadorPorPalabrasAleatorias.class);
		encriptadorPorNumero = mock(EncriptadorPorNumero.class);
		encriptadorPorVocal  = mock(EncriptadorPorVocal.class);
		
	}

	@Test
	void testDeVerificacionCuandoSeElijeUnEcriptadorPorPalabrasAleatorias() {

		encriptador.setStrategy(encriptadorPalabras);
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "?satse omoc¿ ,aloH";
		
		when(encriptadorPalabras.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = encriptador.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
			
	}
	
	@Test
	void testDeVerificacionCuandoSeSeUsaUnDesecriptadorPorPalabrasAleatorias() {

		encriptador.setStrategy(encriptadorPalabras);
		
		String mensajeSinDesencriptar = "?satse omoc¿ ,aloH";
		String mensajeDesencriptadoEsperado = "Hola, ¿como estas?";
		
		when(encriptadorPalabras.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = encriptador.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
			
	}

	@Test
	void testDeVerificacionCuandoSeElijeUnEcriptadorPorNumero() {

		encriptador.setStrategy(encriptadorPorNumero);
		
		String mensajeSinEncriptar = "hola como estas";
		String mensajeEncriptadoEsperado = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		when(encriptadorPorNumero.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = encriptador.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
			
	}
	
	@Test
	void testDeVerificacionCuandoSeUsaUnDesecriptadorPorNumeros() {

		encriptador.setStrategy(encriptadorPorNumero);
		
		String mensajeSinDesencriptar = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		String mensajeDesencriptadoEsperado = "hola como estas";
		
		when(encriptadorPorNumero.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = encriptador.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
			
	}
	
	@Test
	void testDeVerificacionCuandoSeElijeUnEncriptadorPorVocal() {

		encriptador.setStrategy(encriptadorPorVocal);
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "hule, ¿cumu istes?";
		
		when(encriptadorPorVocal.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = encriptador.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
			
	}
	
	@Test
	void testDeVerificacionCuandoSeUnDesecriptorPorVocales() {

		encriptador.setStrategy(encriptadorPorVocal);
		
		String mensajeSinDesencriptar = "hule, ¿cumu istes?";
		String mensajeDesencriptadoEsperado = "hola como estas";
		
		when(encriptadorPorVocal.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = encriptador.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
			
	}

}
