package apoteka;

public class Suplementi extends Proizvod{
	
enum Vrstasuplementa {VITAMIN, MINERAL, ENZIM, AMINOKISELINA, PROTEIN}
	
	private Vrstasuplementa vrsta;
	
	Suplementi (String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
			String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,Vrstasuplementa vrsta){
		
		super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
		this.vrsta=vrsta;
	}

	Vrstasuplementa getVrsta() {return vrsta;}
	
	void setVrsta(Vrstasuplementa vrsta) {this.vrsta=vrsta; }
	
	
}
