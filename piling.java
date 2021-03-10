package apoteka;

enum pilingCestice {BAMBUS, MEKINJE, SECER, KAJSIJA_SEMENKE}

class piling extends kozmetika

{
pilingCestice cestice;
boolean hemijskiEksfolijant;
boolean otcepljujePore;

piling(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		pilingCestice cestice, boolean hemijskiEksfolijant, boolean otcepljujePore)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.cestice = cestice;
	this.hemijskiEksfolijant = hemijskiEksfolijant;
	this.otcepljujePore = otcepljujePore;

}

pilingCestice getCestice() {return this.cestice;}
boolean getHemijskiEksfolijant() {return this.hemijskiEksfolijant;}
boolean getOtcepljujePore() {return this.otcepljujePore;}

void setCestice(pilingCestice cestice) {this.cestice = cestice;}
void setHemijskiEksfolijant(boolean hemijskiEksfolijant) {this.hemijskiEksfolijant = hemijskiEksfolijant;}
void setOtcepljujePore(boolean otcepljujePore) {this.otcepljujePore = otcepljujePore;}

}
