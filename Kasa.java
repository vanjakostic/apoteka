package apoteka;

import java.util.List;

public class Kasa {

	private double trenutnostanje;
	private List<Racun> spisakRacuna;
	
	
	Kasa(double trenutnostanje){ this.trenutnostanje=trenutnostanje; }
	
	double getTrenutnostanje() {return trenutnostanje; }
	
	void dodajUKasu(Racun r,List<Racun> spisakRacuna) {
		spisakRacuna.add(r);
		
	}
	
	void ukloniSaRacuna(Racun r,List<Racun> spisakRacua) {
		
		if(!spisakRacuna.isEmpty()) {
			spisakRacuna.remove(r);
		}
	}
	
	void ukloniSveSaRacuna(List<Racun> spisakRacuna) {
		
		if(!spisakRacuna.isEmpty()) {
			spisakRacuna.clear();
		}
		
	}
	
	
}
