package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Counter {

	private ArrayList<Integer> numeros;

	Counter() {
		this.setNumeros(new ArrayList<Integer>());
	}

	private ArrayList<Integer> getNumeros() {
		return numeros;
	}

	private void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public void addNumber(int number) {
		this.getNumeros().add(number);
	}
	
	
	// 1)
	// A)
	// Realizar un mensaje que indique la cantidad de números pares que hay en la lista.
	
	public int cantidadNumerosPares() {
		return this.getNumeros().stream().filter(n -> esPar(n)).collect(Collectors.toList()).size();
	}
	
	private boolean esPar(int numero) {
		return numero%2 == 0;
	}
	
	// B)
	// Realizar un mensaje que indique la cantidad de números impares que hay en la lista.
	
	public int cantidadNumerosImpares() {
		return this.getNumeros().stream().filter(n -> esImpar(n)).collect(Collectors.toList()).size();
	}
	
	private boolean esImpar(int numero) {	
		return numero%2 != 0;
	}
	
	// C)
	// Realizar un mensaje que indique la cantidad de números de múltiplos de un cierto número que hay en la lista.
	
	public int cantidadNumerosMultiplosDe(int numeroMultiplo) {
		return this.getNumeros().stream().filter(n -> esMultiploDe(n, numeroMultiplo)).collect(Collectors.toList()).size();
	}

	private boolean esMultiploDe(int n, int numeroMultiplo) {
		return n%numeroMultiplo == 0;	
	}
	
	// 2)
	// Contador de arreglos con mayor números pares.
	
	public int desarmadorDeNumeros(ArrayList<Integer> numerosParaDesarmar) {
		return numerosParaDesarmar.stream().max((ns1, ns2) -> this.cantDigitosPares(ns1) - this.cantDigitosPares(ns2)).get();
	}
	
	private int cantDigitosPares(int numero) {
		int resultado = 0;
		
		while(numero > 0) {
			if (numero % 2 == 0) {
				resultado++;
			}
			numero /= 10;
		}
		return resultado;
	}
	
	//3)
	
	public int multiploMasGrande(int x, int y) {
		int resultado = -1;
		
		for (int i=1; i<=1000; i++) {
			if(this.esMultiploDe(i, x) && this.esMultiploDe(i, y)) {
				resultado = i;
			}
		}
		return resultado;
	}
	
}
