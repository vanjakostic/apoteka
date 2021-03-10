package apoteka;

class gelZaTusiranje extends kozmetika
{
boolean SLES; // Sodium Laureth Sulfate
boolean SLS; //Sodium Lauryl Sulfate
boolean CB; //Cocamidopropyl betaine
boolean triclosan;
boolean DMDMHydantoin;
boolean toulen;

gelZaTusiranje(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		boolean SLES, boolean SLS, boolean CB, boolean triclosan, boolean DMDMHydantoin, boolean toulen)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.SLES = SLES;
	this.SLS = SLS;
	this.CB = CB;
	this.triclosan = triclosan;
	this.DMDMHydantoin = DMDMHydantoin;
	this.toulen = toulen;

}
boolean getSLES() {return this.SLES;}
boolean getSLS() {return this.SLS;}
boolean getCB() {return this.CB;}
boolean getTriclosan() {return this.triclosan;}
boolean getDMDMHydantoin() {return this.DMDMHydantoin;}
boolean getToulen() {return this.toulen;}

void setSLES(boolean SLES) {this.SLES = SLES;}
void setSLS(boolean SLS) {this.SLS = SLS;}
void setCB(boolean CB) {this.CB = CB;}
void setTriclosan(boolean triclosan) {this.triclosan = triclosan;}
void setDMDMHydantoin(boolean DMDMHydantoin) {this.DMDMHydantoin = DMDMHydantoin;}
void setToulen(boolean toulen) {this.toulen = toulen;}
}
