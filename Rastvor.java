package apoteka;


public class Rastvor extends Proizvod {
	
	enum Ukus {MENTA, BUBBLEGUM, BRESKVA, VISNJA , LUBENICA, ZELENICAJ, JAGODA}
	
	private Ukus ukusrastvora;
	private boolean izbeljuje;
	private boolean gutanjeOpasno;
	private boolean jacanjeDesni;

	
	public Rastvor (String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
			String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
			Ukus ukusrastvora, boolean elektricna, int brojupakovanju) {
		
		super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
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

