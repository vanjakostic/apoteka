package apoteka;
import java.util.*;


public class Racun {

	private double iznos;
	 List<Proizvod> listaArtikala;
	
	Racun(double iznos){this.iznos=iznos; }
	
	double getIznos() {return iznos; }
	
	void dodajNaRacun(Proizvod p,List<Proizvod> listaArtikala) {
		listaArtikala.add(p);
		
	}
	
	void ukloniSaRacuna(Proizvod p,List<Proizvod> listaArtikala) {
		
		if(!listaArtikala.isEmpty()) {
			listaArtikala.remove(p);
		}
	}
	
	void ukloniSveSaRacuna(List<Proizvod> listaArtikala) {
		
		if(!listaArtikala.isEmpty()) {
			listaArtikala.clear();
		}
		
	}
}
