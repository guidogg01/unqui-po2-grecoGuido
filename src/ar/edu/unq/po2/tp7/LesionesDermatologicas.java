package ar.edu.unq.po2.tp7;

public enum LesionesDermatologicas {

	ROJO("Riesgo alto", 4), GRIS("Riesgo medio", 3), AMARILLO("Riesgo bajo", 2), MIEL("Precaución", 1);
	
	private String descripcion;
	private int nivelDeRiesgo;
	
	private LesionesDermatologicas(String descripcion, int nivelDeRiesgo) {
		this.setDescripcion(descripcion);
		this.setNivelDeRiesgo(nivelDeRiesgo);
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	private void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public LesionesDermatologicas siguienteLesion(LesionesDermatologicas lesionDermatologica) {
		
		switch (this) {
	        case ROJO:
	            return GRIS;
	        case GRIS:
	            return AMARILLO;
	        case AMARILLO:
	            return MIEL;
	        case MIEL:
	            return ROJO;
	        default:
                return null; // Manejar un caso no esperado es necesario
		}
		
	}
	
}
