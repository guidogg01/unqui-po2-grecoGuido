package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	private PokerStatus pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() {
		
		//Mock
		
		//SUT
		
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
		//DOC
		
		pokerStatus = new PokerStatus();
		
	}

	@Test
	void testCuandoHayPoquerEnUnaManoDePokerStatus() {
		
		// Se pone también el palo (aunque para el porque no se utilice) ya que tiene que corroborar que no haya color y para eso se
		//  precisa el palo de la carta.
		
		when(carta1.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.DOS); //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS); //Dummy
		
		when(carta3.getValor()).thenReturn(Valor.CUATRO);  //Dummy
		when(carta3.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
		
		when(carta4.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta4.getPalo()).thenReturn(Palo.TREBOL);   //Dummy
		
		when(carta5.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta5.getPalo()).thenReturn(Palo.PICAS);    //Dummy
		
		//Verify
		assertEquals("Poquer", pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}

	@Test
	void testCuandoHayColorEnUnaManoDePokerStatus() {
		
		when(carta1.getValor()).thenReturn(Valor.A);      //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.DOS);    //Dummy
		when(carta2.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		when(carta3.getValor()).thenReturn(Valor.J);      //Dummy
		when(carta3.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		when(carta4.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta4.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		when(carta5.getValor()).thenReturn(Valor.NUEVE);  //Dummy
		when(carta5.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		//Verify
		assertEquals("Color", pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	void testCuandoHayTrioEnUnaManoDePokerStatus() {
		
		when(carta1.getValor()).thenReturn(Valor.A);      //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.J);   //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS); //Dummy
		
		when(carta3.getValor()).thenReturn(Valor.J);      //Dummy
		when(carta3.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		when(carta4.getValor()).thenReturn(Valor.J);    //Dummy
		when(carta4.getPalo()).thenReturn(Palo.TREBOL); //Dummy
		
		when(carta5.getValor()).thenReturn(Valor.NUEVE);  //Dummy
		when(carta5.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		//Verify
		assertEquals("Trio", pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	void testCuandoHayNoSeFormaNingunJuegoEnUnaManoDePokerStatus() {
		
		when(carta1.getValor()).thenReturn(Valor.A);      //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.J);   //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS); //Dummy
		
		when(carta3.getValor()).thenReturn(Valor.OCHO);      //Dummy
		when(carta3.getPalo()).thenReturn(Palo.TREBOL); //Dummy
		
		when(carta4.getValor()).thenReturn(Valor.SEIS);    //Dummy
		when(carta4.getPalo()).thenReturn(Palo.TREBOL); //Dummy
		
		when(carta5.getValor()).thenReturn(Valor.NUEVE);  //Dummy
		when(carta5.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		//Verify
		assertEquals("Nada", pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
}
