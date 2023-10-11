package ar.edu.unq.po2.tp9.ej3;

import java.util.List;

public class FiltroPropiedadEnComun extends Filtro{

	@Override
	public List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> wikipedia) {
		return wikipedia.stream()
			    .filter(p -> p.tienePropiedadEnComun(page))
			    .toList();
	}

}
