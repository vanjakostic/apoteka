package apoteka;

public class Cetkice extends Proizvod {
	
	enum Boje {PLAVA, ROZA, CRVENA, LJUBICASTA, ZUTA, ZELENA, BELA, NARANDZASTA, SIVA, CRNA}
	
	private Boje boja;
	private boolean elektricna;
	private int brojupakovanju;
	
	Cetkice(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
			String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
			Boje boja, boolean elektricna, int brojupakovanju){
		
		
		super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
		this.boja=boja;
		this.elektricna=elektricna;
		this.brojupakovanju=brojupakovanju;
		
	}
	
	Boje getBoja() {return boja; }
	boolean getElektricna() {return elektricna; }
	int getBrojupakovanju() {return brojupakovanju; }
	
	void setBoja(Boje boja) {this.boja=boja;}
	void setElektricna(boolean elektricna) {this.elektricna=elektricna;}
	void setBrojupakovanju (int brojupakovanju) {this.brojupakovanju=brojupakovanju;}
	
	

}
