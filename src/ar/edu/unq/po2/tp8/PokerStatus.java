package ar.edu.unq.po2.tp8;

import java.util.ArrayList;

public class PokerStatus {

	// Precondición: Todas las cartas tienen un string esperado. Es decir, todo string pasado por parámetro
	//                representa a una carta que está en un mazo de cartas. No se admiten cartas repetidas.
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		String resultado = "Nada";
		
		ArrayList<Carta> manoDePoker = new ArrayList<Carta>(5);
		
		manoDePoker.add(carta1);
		manoDePoker.add(carta2);
		manoDePoker.add(carta3);
		manoDePoker.add(carta4);
		manoDePoker.add(carta5);

		int cantCartasDelMismoNumero   = manoDePoker.stream().filter(carta -> carta.getValor().equals(carta1.getValor())).toList().size();
		int cantCartasDelMismoNumero2  = manoDePoker.stream().filter(carta -> carta.getValor().equals(carta2.getValor())).toList().size();
		
		int cantCartasDelMismoNumero3  = manoDePoker.stream().filter(carta -> carta.getValor().equals(carta3.getValor())).toList().size();
		
		int cantCartasDelMismoPalo = manoDePoker.stream().filter(carta -> carta.getPalo().equals(carta1.getPalo())).toList().size();
		
		if (cantCartasDelMismoNumero == 4 || cantCartasDelMismoNumero2 == 4) {
			resultado = "Poquer";
		} else if(cantCartasDelMismoNumero == 3 || cantCartasDelMismoNumero2 == 3 || cantCartasDelMismoNumero3 == 3){
			resultado = "Trio";
		} else if(cantCartasDelMismoPalo == 5) {
			resultado = "Color";
		}
		
		return resultado;
		
	}

}
