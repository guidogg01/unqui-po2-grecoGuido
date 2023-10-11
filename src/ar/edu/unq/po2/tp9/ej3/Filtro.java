package ar.edu.unq.po2.tp9.ej3;

import java.util.List;

public abstract class Filtro {

	public final List<IWikipediaPage> getSimilarPage(IWikipediaPage page, List<IWikipediaPage> wikipedia){
		return this.aplicarFiltro(page, wikipedia);
	}
	
	public abstract List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> wikipedia);
	
}
