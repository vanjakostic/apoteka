public class Cetkice extends Proizvod {
	
	enum Boje {PLAVA, ROZA, CRVENA, LJUBICASTA, ZUTA, ZELENA, BELA, NARANDZASTA, SIVA, CRNA}
	
	private Boje bojacetkice;
	private boolean elektricna;
	private int brojupakovanju;
	
	Cetkice(int id, String naziv,double cena, int dostupan, 
			Boje bojacetkice, boolean elektricna, int brojupakovanju){
		
		
		super(id, naziv,cena,dostupan);
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
