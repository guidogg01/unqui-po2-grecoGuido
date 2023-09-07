package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> numeros;

	Multioperador() {
		this.setNumeros(new ArrayList<Integer>());
	}

	private ArrayList<Integer> getNumeros() {
		return numeros;
	}

	private void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public void agregarNumero(Integer numero) {
		numeros.add(numero);
	}
	
	public Integer sumadorDeNumeros() {
		return this.getNumeros().stream().mapToInt(Integer::intValue).sum();
	}
	
	public Integer restadorDeNumeros() {
		return this.getNumeros().stream().reduce((n1, n2) -> n1 - n2).orElse(0);
	}
	
	public Integer multiplicadorDeNumeros() {
		return this.getNumeros().stream().reduce((n1, n2) -> n1 * n2).orElse(0);
	}
	
}
