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
	
	// 3)
	
	public int multiploMasGrande(int x, int y) {
		int resultado = -1;
		
		for (int i=1; i<=1000; i++) {
			if(this.esMultiploDe(i, x) && this.esMultiploDe(i, y)) {
				resultado = i;
			}
		}
		return resultado;
	}
	
	// 4)
	/* Dado el siguiente código:
	 *   String a = "abc";
		 String s = a;
		 String t;
	
       Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:
		 
		 s.length(); Esto devuelve el número 3 ya que se pide la cantidad de caracteres que hay en el String 'a', que, a su vez, tiene
		              almacenado "abc". 
		 t.length(); Esto devuelve el error ya que la variable 't' no está inicializada.
		 1 + a;      Esto devuelve "1abc" ya que el '+' concatena el 1 con lo que tiene asignada la variable 'a'.
		 a.toUpperCase(); Esto tranforma todo el string que está en la variable 'a' y lo vuelve todo mayúscula.
		 "Libertad".indexOf("r"); Devuelve el número 4 ya que es la posición en donde está el caracter pasado por parentesis.
		                           Observación: El String arranca en la posición 0.
		 "Universidad".lastIndexOf('i'); Devuelve el número 7 ya que es la posición en donde está el último caracter que está pasado
		                                  por parentesis. Notar que hay mas de una 'i'.
         "Quilmes".substring(2,4); Devuelve el String "il" ya que está dentro de las posiciones pasadas por parámetros menos la última
                                    letra.
		 (a.length() + a).startsWith("a"); Devuelve false ya que no empieza con el string "a".
		 s == a; Devuelve true ya que si son iguales.
		 a.substring(1,3).equals("bc"); Devuelve true ya que, al hacer substring del string contenido en la variable 'a', se obtiene
		                                 el string que está dentro de las posiciones pasadas menos la primera letra.
	 * */
	
}
