package ar.edu.unq.po2.tp11.State.ej2;

public abstract class EstadoMaquinaJuego {

	EstadoMaquinaJuego(MaquinaJuegos maquinaJuegos) {
		this.maquinaJuegos = maquinaJuegos;
	}

	private MaquinaJuegos maquinaJuegos;
	
	public MaquinaJuegos getMaquinaJuegos() {
		return maquinaJuegos;
	}

	public void setMaquinaJuegos(MaquinaJuegos maquinaJuegos) {
		this.maquinaJuegos = maquinaJuegos;
	}

	public abstract void empezarJuego();
	
}
