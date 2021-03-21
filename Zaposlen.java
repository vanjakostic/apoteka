package apoteka;

public class Zaposlen extends Osoba{
	
	enum Radnomesto {SPREMACICA, PRODAVAC, LABORANT}
	
	private double plata;
	private Radnomesto zanimanje;
	private int ID;
	
	Zaposlen(){
		
		super();
		plata=100000.00;
		//zanimanje= LABORANT;
		ID=453;	
	}
	
	Zaposlen(String ime,String prezime,double plata,Radnomesto zanimanje,int ID){
		
		super(ime,prezime);
		this.plata=plata;
		this.zanimanje=zanimanje;
		this.ID=ID;
		
	}
	
	double getPlata() {return plata;}
	Radnomesto getZanimanje() {return zanimanje;}
	int getID() {return ID;}
	
	void setPlata(double plata) {this.plata=plata; }
	void setZanimanje(Radnomesto zanimanje) {this.zanimanje=zanimanje;}
	void setID(int ID) {this.ID=ID;}
	
	double povecajPlatu(double n) {
		
		plata+=n;
		return plata;
	}
	
	double smanjiPlatu(double n) {
		
		plata-=n;
		return plata;
	}
	
	
	
	

}
