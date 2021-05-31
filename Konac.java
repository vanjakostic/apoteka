

public class Konac extends Proizvod{
	
	private float duzina;
    private boolean waxed, ptfe, ukuskonca;
    
    Konac(int id, String naziv, double cena,int dostupan, float duzina, boolean waxed,
			boolean ptfe, boolean ukuskonca){
    	
    	super(id, naziv,cena,dostupan);
    	this.duzina=duzina;
    	this.waxed=waxed;
    	this.ptfe=ptfe;
    	this.ukuskonca=ukuskonca;
 	
    }
    
    float getDuzina() {return duzina; }
    boolean getWaxed() {return waxed; }
    boolean getPtfe() {return ptfe; }
    boolean getUkuskonca() {return ukuskonca; }
    
    void setDuzina(float duzina) {this.duzina=duzina;}
    void setWaxed(boolean waxed) {this.waxed=waxed;}
    void setPtfe(boolean ptfe) {this.ptfe=ptfe;}
    void setUkuskonca(boolean ukuskonca) {this.ukuskonca=ukuskonca;}

}
