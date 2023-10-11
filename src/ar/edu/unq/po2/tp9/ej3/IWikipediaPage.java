package ar.edu.unq.po2.tp9.ej3;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {

	public String getTitle();
	
	public List<IWikipediaPage> getLinks();
	
	public Map<String, IWikipediaPage> getInfobox();

	public boolean tieneLinksEnComun(IWikipediaPage page);

	public boolean concuerdaConAlgunLinkDe(List<IWikipediaPage> linksAComparar);

	public boolean tienePropiedadEnComun(IWikipediaPage page);

	
}
