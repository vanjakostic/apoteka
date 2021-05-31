

public class Suplementi extends Proizvod{
	
enum Vrstasuplementa {VITAMIN, MINERAL, ENZIM, AMINOKISELINA, PROTEIN}
	
	private Vrstasuplementa vrsta;
	
	Suplementi (int id, String naziv,double cena, int dostupan, Vrstasuplementa vrsta){
		
		super(id, naziv,cena,dostupan);
		this.vrsta=vrsta;
	}

	Vrstasuplementa getVrsta() {return vrsta;}
	
	void setVrsta(Vrstasuplementa vrsta) {this.vrsta=vrsta; }
	
	
}
