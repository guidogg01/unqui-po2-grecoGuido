package ar.edu.unq.po2.tp12Observer;

import java.util.List;
import java.util.ArrayList;

public class Articulo {

	private String titulo;
	private List<String> autores;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private List<String> palabrasClaves;

	Articulo(String titulo, String tipoDeArticulo, String lugarDePublicacion) {
		this.setTitulo(titulo);
		this.setAutores(new ArrayList<String>());
		this.setTipoDeArticulo(tipoDeArticulo);
		this.setLugarDePublicacion(lugarDePublicacion);
		this.setPalabrasClaves(new ArrayList<String>());
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private void setAutores(List<String> autores) {
		this.autores = autores;
	}

	private void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	private void setLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}

	private void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}
	
}
