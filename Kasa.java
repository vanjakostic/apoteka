package apoteka;

import java.util.ArrayList;
import java.util.List;

public class Kasa {

	private double trenutnostanje;
	private ArrayList<Korpa> spisakRacuna;
	
	
	Kasa(double trenutnostanje){ this.trenutnostanje=trenutnostanje; }
	
	double getTrenutnostanje() {return trenutnostanje; }
	
	void Prodaj(Korpa k,ArrayList<Korpa> spisakRacuna) {
		spisakRacuna.add(k);
		
	}
	
	void ukloniRacun(Korpa k,ArrayList<Korpa> spisakRacuna) {
		
		if(!spisakRacuna.isEmpty()) {
			spisakRacuna.remove(k);
		}
	}
	
	void ukloniSveRacune(ArrayList<Korpa> spisakRacuna) {
		
		if(!spisakRacuna.isEmpty()) {
			spisakRacuna.clear();
		}
		
	}
	
	
	
	//ide u main
	//import java.io.FileWriter;
	//import java.io.IOException;
	/*void dodajUFajl(Korpa &k){
		try {
		    FileWriter f = new FileWriter("baza.txt", true);
		    f.write(k.ispis);

		}
		catch(FileNotFoundException | IOException e) {
			System.out.println("Greska ");

		}
		finally{
			if (f != null) f.close();
		}
	}
	
	*/
	
	
	 
	
	
}
