package ar.edu.unq.po2.tp9.ej3;

import java.util.List;

public class FiltroLinkEnComun extends Filtro{

	@Override
	public List<IWikipediaPage> aplicarFiltro(IWikipediaPage page, List<IWikipediaPage> pages) {
		
		return pages.stream()
				    .filter(p -> p.tieneLinksEnComun(page))
				    .toList();
	}

}
