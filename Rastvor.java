package apoteka;

import apoteka.Cetkice.Boje;

public class Rastvor extends Proizvod {
	
	enum Boje {MENTA, BUBBLEGUM, BRESKVA, VISNJA , LUBENICA, ZELENICAJ, JAGODA}
	
	private Boje bojarastvora;
	private boolean izbeljuje;
	private boolean gutanjeOpasno;
	private boolean jacanjeDesni;

	
	public Rastvor (String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
			String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
			Boje boja, boolean elektricna, int brojupakovanju) {
		
		super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
		this.bojarastvora=bojarastvora;
		this.izbeljuje=izbeljuje;
		this.gutanjeOpasno=gutanjeOpasno;
		this.jacanjeDesni=jacanjeDesni;
	}
	
	Boje getBoju() {return bojarastvora; }
	boolean getIzbeljuje () {return izbeljuje;}
	boolean getGutanjeOpasno () {return gutanjeOpasno;}
	boolean getJacanjeDesni () {return jacanjeDesni;}
	
	void setBoju(Boje bojarastvora) { this.bojarastvora=bojarastvora; }
	void setIzbeljuje (boolean izbeljuje) {this.izbeljuje=izbeljuje; }
	void setGutanjeOpasno (boolean gutanjeOpasno) {this.gutanjeOpasno=gutanjeOpasno; }
	void setJacanjeDesni (boolean jacanjeDesni) {this.jacanjeDesni=jacanjeDesni; }
}

