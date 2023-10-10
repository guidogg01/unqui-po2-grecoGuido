package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MunicipioDeDeportesTestCase {

	private MunicipioDeDeportes municipio;
	
	private ActividadSemanal actividad1;
	private ActividadSemanal actividad2;
	private ActividadSemanal actividad3;
	private ActividadSemanal actividad4;
	
	@BeforeEach
	void setUp() {

		municipio = new MunicipioDeDeportes();
		
		actividad1 = new ActividadSemanal(DiaDeLaSemana.DOMINGO, 1530, 3, Deporte.JABALINA);
		actividad2 = new ActividadSemanal(DiaDeLaSemana.MARTES, 1600, 2, Deporte.FUTBOL);
		actividad3 = new ActividadSemanal(DiaDeLaSemana.JUEVES, 1600, 2, Deporte.FUTBOL);
		actividad4 = new ActividadSemanal(DiaDeLaSemana.SABADO, 1830, 3, Deporte.BASKET);
		
		municipio.agregarActividades(actividad1);
		municipio.agregarActividades(actividad2);
		municipio.agregarActividades(actividad3);
		municipio.agregarActividades(actividad4);
		
	}

	@Test
	void testDeVerificacionDeInicializacionDeUnMunicipio() {
		assertEquals(4, this.municipio.getActividadesSemanales().size());
	}
	
	@Test
	void testDeVerificacionDeLasActividadesDeFutbolQueHayEnUnMunicipio() {
		assertEquals(2, this.municipio.actividadesDeFutbol().size());
	}
	
	@Test
	void testDeVerificacionDeLasActividadesDeUnaComplejidadEspecificaQueHayEnUnMunicipio() {
		assertEquals(1, this.municipio.actividadesConComplejidad(4).size());
		assertEquals(3, this.municipio.actividadesConComplejidad(2).size());
	}

	@Test
	void testDeVerificacionDeLaCantidadDeHorasTotalesQueHayEnUnMunicipio() {
		assertEquals(10, this.municipio.cantidadDeHorasTotales());
	}
	
	@Test
	void testDeVerificacionDeLaActividadMasBarataDeInteresQueHayEnUnMunicipio() {
		assertEquals(DiaDeLaSemana.MARTES, this.municipio.actividadSemanalMasBarata(Deporte.FUTBOL).getDiaDeLaSemana());
	}
	
	@Test
	void testDeVerificacionDeAnuncioDeDeporte() {
		System.out.println(actividad1.toString()); // Imprime: Deporte: FUTBOL. Dia: MARTES A LAS: 19 . Duración: 1 hora(s).
	}
	
}
