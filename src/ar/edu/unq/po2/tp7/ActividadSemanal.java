package ar.edu.unq.po2.tp7;

public class ActividadSemanal {

	private DiaDeLaSemana diaDeLaSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporteQueSePractica;
	
	ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int horaDeInicio, int duracion, Deporte deporteQueSePractica) {
		this.setDiaDeLaSemana(diaDeLaSemana);
		this.setHoraDeInicio(horaDeInicio);
		this.setDuracion(duracion);
		this.setDeporteQueSePractica(deporteQueSePractica);
	}

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	private void setDiaDeLaSemana(DiaDeLaSemana diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	private void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	private void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporteQueSePractica() {
		return deporteQueSePractica;
	}

	private void setDeporteQueSePractica(Deporte deporteQueSePractica) {
		this.deporteQueSePractica = deporteQueSePractica;
	}
	
	public Double costoDeActividadSemanal() {
		
		if(this.getDiaDeLaSemana() == DiaDeLaSemana.LUNES
		   || this.getDiaDeLaSemana() == DiaDeLaSemana.MARTES
		   || this.getDiaDeLaSemana() == DiaDeLaSemana.MIERCOLES) {
			return 500d + (this.getDeporteQueSePractica().getComplejidad() * 200d);
		} else {
			return 1000d + (this.getDeporteQueSePractica().getComplejidad() * 200d);
		}
		
	}
	
	@Override
    public String toString() {
        return "Deporte: " + this.getDeporteQueSePractica() + ". Dia: " + this.getDiaDeLaSemana() + " A LAS: " + this.getHoraDeInicio() + " . Duración: " + this.getDuracion() + " hora(s).";
    }
	
}
