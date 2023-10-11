package ar.edu.unq.po2.tp9.ej3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage{

	private String title;
	private List<IWikipediaPage> links; //Paginas con las que se conecta la WikipediaPage.
	private Map<String, IWikipediaPage> infobox; //Infobox de la WikipediaPagee.
	
	WikipediaPage(String title) {
		this.setTitle(title);
		this.setLinks(new ArrayList<IWikipediaPage>());
		this.setInfobox(new HashMap<String, IWikipediaPage>());
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public List<IWikipediaPage> getLinks() {
		return links;
	}

	@Override
	public Map<String, IWikipediaPage> getInfobox() {
		return infobox;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private void setLinks(List<IWikipediaPage> links) {
		this.links = links;
	}

	private void setInfobox(Map<String, IWikipediaPage> infobox) {
		this.infobox = infobox;
	}
	
	public void agregarLink(IWikipediaPage link) {
		this.getLinks().add(link);
	}
	
	public void agregarInfobox(String propiedad) {
		this.getInfobox().put(propiedad, this);
	}

	@Override
	public boolean tieneLinksEnComun(IWikipediaPage page) {
		List<IWikipediaPage> linksAComparar = page.getLinks();
		
		return this.getLinks()
				   .stream()
				   .anyMatch(l -> l.concuerdaConAlgunLinkDe(linksAComparar));
		
	}
	
	@Override
	public boolean concuerdaConAlgunLinkDe(List<IWikipediaPage> links) {
		return links.stream()
				    .anyMatch(l -> l.equals(this));
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean tienePropiedadEnComun(IWikipediaPage page) {
		List<String> clavesPropias   = (List<String>) this.getInfobox().keySet();
		List<String> clavesAComparar = (List<String>) page.getInfobox().keySet();
		
		return clavesPropias.stream()
				            .anyMatch(s -> clavesAComparar.contains(s));
	}

}
