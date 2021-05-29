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
	
	 /*void ispisRacuna(ArrayList<Korpa> spisakRacuna) {
		
		for (int i = 0; i < spisakRacuna.size();i++) 
	    { 		      
			
			for (int j = 0; j < spisakRacuna.get(i).size(); j++) {
	            ispisArtikala();
	        } 		
	    }   
	}*/
	
	
	//ide u main
	/*try {
		
	      FileWriter f = new FileWriter("baza.txt");
	      f.write(ispisRacuna();
	      
	    } catch (IOException e) {
	      System.out.println("error");
	      e.printStackTrace();
	    }finally {
	    	
	    	f.close();
	    	
	    }*/
	
	
	 
	
	
}
