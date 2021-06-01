enum Vrstasuplementa {VITAMIN, MINERAL, ENZIM, AMINOKISELINA, PROTEIN};

public class Suplementi extends Proizvod{
	

	
	private Vrstasuplementa vrsta;
	
	Suplementi (int id, String naziv,double cena, int dostupan, Vrstasuplementa vrsta){
		
		super(id, naziv,cena,dostupan);
		this.vrsta=vrsta;
	}

	String getVrsta() 
	{
		return "Vitamin";
	
	}
	
	void setVrsta(Vrstasuplementa vrsta) {this.vrsta=vrsta; }
	
	
}
