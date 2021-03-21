package apoteka;
import java.util.*;
public class Kupac extends Osoba{
	
	boolean clanskaKartica;
	List<Proizvod> korpa;
	
	Kupac(){
			
			super();
			clanskaKartica=false;	
		}
	
	Kupac(String ime,String prezime,boolean clanskaKartica){
		
		super(ime,prezime);
		this.clanskaKartica=clanskaKartica;	
	}
	
	void dodajUKorpu(Proizvod p,List<Proizvod> korpa) {
		korpa.add(p);
		
	}
	
	void ukloniIzListe(Proizvod p,List<Proizvod> korpa) {
		
		if(!korpa.isEmpty()) {
			korpa.remove(p);
		}
	}
	
	void ukloniSve(List<Proizvod> korpa) {
		
		if(!korpa.isEmpty()) {
			korpa.clear();
		}
		
	}
	
	boolean napraviKarticu() {
		
		if(clanskaKartica==false)
			clanskaKartica=true;
		return clanskaKartica;
	}
}
