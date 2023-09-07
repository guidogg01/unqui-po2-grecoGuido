package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	
	private Integer x;
		
	private Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Tres pares y diez impares.
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(27);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		counter.addNumber(8);
		counter.addNumber(12);
	}
	
	//1)
	
	/**
	* Verifica la cantidad de pares
	*/
	
	@Test
	public void testCantidadDeNumerosPares() {
		// Getting the even occurrences
		int amount = counter.cantidadNumerosPares();
		// I check the amount is the expected one
		assertEquals(amount, 3);
	}
	
	@Test
	public void testCantidadDeNumerosImpares() {
		int amount = counter.cantidadNumerosImpares();
		assertEquals(amount, 10);
	}
	
	@Test
	public void testCantidadDeNumerosMultiplos() {
		int amount = counter.cantidadNumerosMultiplosDe(3);
		assertEquals(amount, 4);
	}
	
	// 2)
	
	@Test
	public void testMayorCantidadDeNumerosPares() {
		ArrayList<Integer> numerosAComparar = new ArrayList<Integer>();
		
		numerosAComparar.add(31221221);
		numerosAComparar.add(51212121);
		numerosAComparar.add(71327122);
		numerosAComparar.add(91111211);
		numerosAComparar.add(95131219);
		numerosAComparar.add(20361218);
		
		Integer numeroConMasPares = counter.desarmadorDeNumeros(numerosAComparar);
		assertEquals(20361218, numeroConMasPares);
	}
	
	@Test
	public void testDeMultiplos() {
		assertEquals(621, counter.multiploMasGrande(27, 23));
	}
	
	@Test
	public void testPrueba(){
		
		assertEquals(0, x);
	}
	
}
