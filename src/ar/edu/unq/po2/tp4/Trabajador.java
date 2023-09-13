package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos;
	
	Trabajador(){
		this.setIngresos(new ArrayList<Ingreso>());
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	private void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.getIngresos().add(ingreso);
	}
	
	//Retornar el monto total percibido por el trabajador
	public double getTotalPercibido() {
		return this.getIngresos().stream().mapToDouble(Ingreso::getMontoPercibido).sum();
	}
	
	//Retornar el monto imponible al impuesto al trabajador
	public double getMontoImponible() {
		return this.getIngresos().stream().mapToDouble(Ingreso::montoImponible).sum();
	}
	
	//Retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
	}
	
}
