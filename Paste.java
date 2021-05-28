package apoteka;

public class Paste extends Proizvod{

	
	enum vrstaPaste {ZA_DECU, ZA_PUSACE, IZBELJIVANJE, OSETLJIVI_ZUBI, PROTIV_KARIJESA}
	enum ukusPaste {MENTA, BUBBLEGUM, BRESKVA, VISNJA, LUBENICA, ZELENI_CAJ}
	
	private vrstaPaste vrsta;
	private ukusPaste ukus;
    private int kolicina;
    private float ppmF;
    private boolean fluor;
    private boolean prirodna;
    
    Paste(int id, String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
    		String mestoProizvodnje,
    		double cena, boolean dostupan,int brojproizvoda, vrstaPaste vrsta, ukusPaste ukus, int kolicina,
    		float ppmF, boolean fluor, boolean prirodna){
    	
    	
    	super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
    	this.vrsta=vrsta;
    	this.ukus=ukus;
    	this.kolicina=kolicina;
    	this.ppmF=ppmF;
    	this.fluor=fluor;
    	this.prirodna=prirodna;
    	
    }
    
    
    vrstaPaste getVrstapaste() {return vrsta; }
    ukusPaste getUkuspaste() {return ukus; }
    int getkolicna() {return kolicina;}
    float getppmF() {return ppmF; }
    boolean getFluor() {return fluor; }
    boolean getPrirodna () {return prirodna; }
    
    
    void setVrstapaste(vrstaPaste vrsta) {this.vrsta=vrsta; }
    void setUkuspaste(ukusPaste ukus ) {this.ukus=ukus; }
    void setKolicna(int kolicina ) {this.kolicina=kolicina; }
    void setppmF(float ppmF) {this.ppmF=ppmF; }
    void setFluor(boolean fluor) {this.fluor=fluor; }
    void setPrirodna(boolean prirodna) {this.prirodna=prirodna; }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
