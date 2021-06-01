

import java.util.Objects; 



public class Proizvod {
	
	protected int id;
	protected String naziv;
	protected double cena;
	protected int dostupan;
	
	
	//konstruktor sa parametrima
	
	Proizvod(int id, String naziv, double cena, int dostupan){
		
		this.id = id;
		this.naziv=naziv;
		this.cena=cena;
		this.dostupan=dostupan;
		
	}
	
	//geteri
	
	int getID() {return this.id;}
	String getNaziv() {return naziv; }
	double getCena(){return cena; }
	int getDostupan(){return dostupan; }

	
	//seteri
	//{}
	
	void setID(int id) {this.id=id;}
	void setNaziv(String naziv) {this.naziv=naziv; }
	void setCena(double cena){
		
		if(cena > 0)
			this.cena=cena; 
		
	}
	void setDostupan(int dostupan){this.dostupan=dostupan; }

	
	
/*
	
	 boolean potrosi(){
	        if(brojproizvoda>=20){
	        	brojproizvoda-=20;
	        	
	            if(brojproizvoda==0)
	            	dostupan=false;
	            
	            return true;
	        }else
	        return false;
	  }
	 

	 
	 void naruci(){
		 brojproizvoda+=20;
		 
		 if(dostupan==false)
			 dostupan=true;
	        
	  }
	 */
	 
	
	/*@Override 
	public String toString() {
        return naziv + "\n" + datumProizvodnje + "\n" + rokTrajanja + "\n" + mestoProizvodnje + "\n" ;
    }*/
	
	@Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.naziv);
        hash = 29 * hash + Objects.hashCode(this.cena);
        hash = 29 * hash + Objects.hashCode(this.dostupan);
        return hash;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proizvod other = (Proizvod) obj;
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cena, other.cena)) {
            return false;
        }
        if (!Objects.equals(this.dostupan, other.dostupan)) {
            return false;
        }
        return true;
    }
}