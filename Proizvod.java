package apoteka;

enum Proizvodjaci { COLGATE, SENSODYNE, NIVEA, MIXA, GARNIER, EUCERIN, MAYBELLINE, GOLDEN_ROSE, GALENIKA, HEMOFARM, FARMASWISS}

public class Proizvod {
	
	protected String naziv;
	protected Proizvodjaci proizvodjac;
	protected String datumProizvodnje;
	protected String rokTrajanja;
	protected String mestoProizvodnje;
	protected double cena;
	protected boolean dostupan;
	
	
	//konstruktor sa parametrima
	
	Proizvod(String naziv, Proizvodjaci proizvodjac, datumProizvodnje, String rokTrajanja,String mestoProizvodnje, double cena, boolean dostupan){
		
		this.naziv=naziv;
		this.proizvodjac=proizvodjac;
		this.datumProizvodnje=datumProizvodnje;
		this.rokTrajanja=rokTrajanja;
		this.mestoProizvodnje=mestoProizvodnje;
		this.cena=cena;
		this.dostupan=dostupan;
		
	}
	
	//geteri
	
	String getNaziv() {return naziv; }
	Proizvodjaci getProizvodjac() {	return proizvodjac; }
	String getDatumProizvodnje() {return datumProizvodnje; }
	String getRokTrajanja() {return rokTrajanja; }
	String getMestoProizvodnje() {return mestoProizvodnje; }
	double getCena(){return cena; }
	boolean getDostupan(){return dostupan; }

	
	//seteri
	//{}
	
	void setNaziv(String naziv) {this.naziv=naziv; }
	void setProizvodjac(Proizvodjaci proizvodjac){this.proizvodjac=proizvodjac; }
	void setDatumProizvodnje(String datumProizvodnje) {this.datumProizvodnje=datumProizvodnje; }
	void setRokTrajanja(String rokTrajanja) {this.rokTrajanja=rokTrajanja; }
	void setMestoProizvodnje(String mestoProizvodnje) {this.mestoProizvodnje=mestoProizvodnje; }
	void setCena(double cena){
		
		if(cena > 0)
			this.cena=cena; 
		
	}
	void setDostupan(boolean dostupan){this.dostupan=dostupan; }
	
	@Override 
	public String toString() {
        return naziv + "\n" + datumProizvodnje + "\n" + rokTrajanja + "\n" + mestoProizvodnje + "\n" ;
    }
	
}
