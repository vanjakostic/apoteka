package apoteka;

public class Proizvod {
	
	protected String naziv;
	protected String datumProizvodnje;
	protected String rokTrajanja;
	protected String mestoProizvodnje;
	protected double cena;
	protected boolean dostupan;
	
	
	//konstruktor sa parametrima
	
	Proizvod(String naziv, String datumProizvodnje, String rokTrajanja,String mestoProizvodnje, double cena, boolean dostupan){
		
		this.naziv=naziv;
		this.datumProizvodnje=datumProizvodnje;
		this.rokTrajanja=rokTrajanja;
		this.mestoProizvodnje=mestoProizvodnje;
		this.cena=cena;
		this.dostupan=dostupan;
		
	}
	
	//geteri
	
	String getNaziv() {return naziv; }
	String getDatumProizvodnje() {return datumProizvodnje; }
	String getRokTrajanja() {return rokTrajanja; }
	String getMestoProizvodnje() {return mestoProizvodnje; }
	double getCena(){return cena; }
	boolean getDostupan(){return dostupan; }

	
	//seteri
	//{}
	
	void setNaziv(String naziv) {this.naziv=naziv; }
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
