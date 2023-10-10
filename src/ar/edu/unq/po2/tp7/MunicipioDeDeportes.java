package ar.edu.unq.po2.tp7;

import java.util.List;

import java.util.ArrayList;

public class MunicipioDeDeportes {

	private List<ActividadSemanal> actividadesSemanales;

	MunicipioDeDeportes() {
		this.setActividadesSemanales(new ArrayList<ActividadSemanal>());
	}

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}

	public void setActividadesSemanales(List<ActividadSemanal> actividadesSemanales) {
		this.actividadesSemanales = actividadesSemanales;
	}

	public void agregarActividades(ActividadSemanal actividad) {
		this.getActividadesSemanales().add(actividad);
	}
	
	public List<ActividadSemanal> actividadesDeFutbol(){
		return this.getActividadesSemanales()
				   .stream()
				   .filter(a -> a.getDeporteQueSePractica() == Deporte.FUTBOL)
				   .toList();
	}
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad){
		return this.getActividadesSemanales()
				   .stream()
				   .filter(a -> a.getDeporteQueSePractica().getComplejidad() == complejidad)
				   .toList();
	}
	
	public int cantidadDeHorasTotales() {
		return this.getActividadesSemanales()
				   .stream()
				   .mapToInt(a -> a.getDuracion())
				   .sum();
	}
	
	//Se pasa un deporte y devuelve la actividad semanal mas barata de ese deporte.
	public ActividadSemanal actividadSemanalMasBarata(Deporte deporte) {
		return this.getActividadesSemanales()
				   .stream()
				   .min((ActividadSemanal a1, ActividadSemanal a2) -> a1.costoDeActividadSemanal().compareTo(a2.costoDeActividadSemanal()))
				   .get();
	}
	
}
