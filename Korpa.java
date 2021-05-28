import java.util.List;
package apoteka;
import java.util.*;

public class Korpa {
	
	List<Proizvod> listaArtikala;
	
	
	
	double izracunajIznos(List<Proizvod> listaArtikala) {
		
		double iznos=0;
		for(int i=0; i<listaArtikala.length; i++) {
			
			//iznos+=listaArtikala.cena.get(i);
			
		}
		
	}
	
	void dodajUKorpu(Proizvod p,List<Proizvod> listaArtikala) {
		listaArtikala.add(p);
		
	}
	
	void ukloniIzKorpe(Proizvod p,List<Proizvod> listaArtikala) {
		
		if(!listaArtikala.isEmpty()) {
			listaArtikala.remove(p);
		}
	}
	
	void ukloniSveSaRacuna(List<Proizvod> listaArtikala) {
		
		if(!listaArtikala.isEmpty()) {
			listaArtikala.clear();
		}
		
	}
	
	void ukloniSve(List<Proizvod> korpa) {
			
			if(!korpa.isEmpty()) {
				korpa.clear();
			}
			
		}

}
