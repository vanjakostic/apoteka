package Kozmetika;

import apoteka.Proizvodjaci;

enum materijalMaske {HYDROGEL, BIOCELULOZA, MICROFIBER, FOIL, KNIT}

class sheetMaske extends kozmetika
{
materijalMaske materijal;

sheetMaske(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		materijalMaske materijal)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.materijal = materijal;
}

materijalMaske getMaterijal() {return this.materijal;}


void setMaterijal(materijalMaske materijal) {this.materijal = materijal;}


}
