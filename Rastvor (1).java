enum Ukus {MENTA, BUBBLEGUM, BRESKVA, VISNJA , LUBENICA, ZELENICAJ, JAGODA}
	


public class Rastvor extends Proizvod {
	
	
	private Ukus ukusrastvora;
	private boolean izbeljuje;
	private boolean gutanjeOpasno;
	private boolean jacanjeDesni;

	
	public Rastvor (int id, String naziv, double cena, int dostupan, 
			Ukus ukusrastvora, boolean izbeljuje, boolean gutanjeOpasno, boolean jacanjeDesni) {
		
		super(id, naziv,cena,dostupan);
		this.ukusrastvora=ukusrastvora;
		this.izbeljuje=izbeljuje;
		this.gutanjeOpasno=gutanjeOpasno;
		this.jacanjeDesni=jacanjeDesni;
	}
	
	Ukus getUkus() {return ukusrastvora; }
	boolean getIzbeljuje () {return izbeljuje;}
	boolean getGutanjeOpasno () {return gutanjeOpasno;}
	boolean getJacanjeDesni () {return jacanjeDesni;}
	
	void setUkus(Ukus ukusrastvora) { this.ukusrastvora=ukusrastvora; }
	void setIzbeljuje (boolean izbeljuje) {this.izbeljuje=izbeljuje; }
	void setGutanjeOpasno (boolean gutanjeOpasno) {this.gutanjeOpasno=gutanjeOpasno; }
	void setJacanjeDesni (boolean jacanjeDesni) {this.jacanjeDesni=jacanjeDesni; }
}

