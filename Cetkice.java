package apoteka;

public class Cetkice extends Proizvod {
	
	enum Boje {PLAVA, ROZA, CRVENA, LJUBICASTA, ZUTA, ZELENA, BELA, NARANDZASTA, SIVA, CRNA}
	
	private Boje bojacetkice;
	private boolean elektricna;
	private int brojupakovanju;
	
	Cetkice(int id, String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
			String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
			Boje bojacetkice, boolean elektricna, int brojupakovanju){
		
		
		super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
		this.bojacetkice=bojacetkice;
		this.elektricna=elektricna;
		this.brojupakovanju=brojupakovanju;
		
	}
	
	Boje getBoja() {return bojacetkice; }
	boolean getElektricna() {return elektricna; }
	int getBrojupakovanju() {return brojupakovanju; }
	
	void setBoja(Boje bojacetkice) {this.bojacetkice=bojacetkice;}
	void setElektricna(boolean elektricna) {this.elektricna=elektricna;}
	void setBrojupakovanju (int brojupakovanju) {this.brojupakovanju=brojupakovanju;}
	
	

}
