package ar.edu.unq.po2.tp10Composite.ej2;

import java.util.List;
import java.util.ArrayList;

public class ParcelaMixta implements Parcela {

	private List<Parcela> parcelas;

	ParcelaMixta() {
		this.setParcelas(new ArrayList<Parcela>(4)); // Se pone '4' indicando que esa es la cantidad de elementos que tiene el ArrayList.
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	private void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public void agregarParcela(Parcela parcela) {
		this.getParcelas().add(parcela);		
	}
	
	//Elimina la parcela en la primera posición (o sea la cero).
	public void eliminarParcela() {
		this.getParcelas().remove(0);		
	}

	@Override
	public double gananciaAnual() {
		return this.getParcelas().stream().mapToDouble(p -> p.gananciaAnual()).sum() / 4;
		// Se divide por 4 ya que la parcela mixta esta fragmentada en 4 parcelas mas.
	}
	
}
