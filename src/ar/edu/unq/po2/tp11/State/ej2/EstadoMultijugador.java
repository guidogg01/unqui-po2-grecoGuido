package ar.edu.unq.po2.tp11.State.ej2;

public class EstadoMultijugador extends EstadoMaquinaJuego {

	EstadoMultijugador(MaquinaJuegos maquinaJuegos) {
		super(maquinaJuegos);
	}

	@Override
	public void empezarJuego() {
		this.getMaquinaJuegos().setEstadoMaquina(new EstadoInicial(this.getMaquinaJuegos()));

	}

}
