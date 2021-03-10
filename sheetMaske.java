package apoteka;

enum materijalMaske {HYDROGEL, BIOCELULOZA, MICROFIBER, FOIL, KNIT}

class sheetMaske extends kozmetika
{
materijalMaske materijal;
boolean smanjujeCrvenilo;
boolean smanjujeMasnocu;
boolean posvetljujeKozu;
boolean zatezeKozu;
boolean intenzivnaHidratacija;

sheetMaske(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		materijalMaske materijal, boolean smanjujeCrvenilo, boolean smanjujeMasnocu, boolean posvetljujeKozu,
		boolean zatezeKozu, boolean intenzivnaHidratacija)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.materijal = materijal;
	this.smanjujeCrvenilo = smanjujeCrvenilo;
	this.smanjujeMasnocu = smanjujeMasnocu;
	this.posvetljujeKozu = posvetljujeKozu;
	this.zatezeKozu = zatezeKozu;
	this.intenzivnaHidratacija = intenzivnaHidratacija;
}

materijalMaske getMaterijal() {return this.materijal;}
boolean getSmanjujeCrvenilo() {return this.smanjujeCrvenilo;}
boolean getSmanjujeMasnocu() {return this.smanjujeMasnocu;}
boolean getPosvetljujeKozu() {return this.posvetljujeKozu;}
boolean getZatezeKozu() {return this.zatezeKozu;}
boolean getIntenzivnaHidratacija() {return this.intenzivnaHidratacija;}

void setMaterijal(materijalMaske materijal) {this.materijal = materijal;}
void setSmanjujeCrvenilo(boolean smanjujeCrvenilo) {this.smanjujeCrvenilo = smanjujeCrvenilo;}
void setSmanjujeMasnocu(boolean smanjujeMasnocu) {this.smanjujeMasnocu = smanjujeMasnocu;}
void setZatezeKozu(boolean zatezeKozu) {this.zatezeKozu = zatezeKozu;}
void setIntenzivnaHidratacija(boolean intenzivnaHidratacija) {this.intenzivnaHidratacija = intenzivnaHidratacija;}

}
