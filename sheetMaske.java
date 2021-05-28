package apoteka;



enum materijalMaske {HYDROGEL, BIOCELULOZA, MICROFIBER, FOIL, KNIT}

class sheetMaske extends kozmetika
{
materijalMaske materijal;

sheetMaske(int id,String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		materijalMaske materijal)
{
	
	super(id,naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.materijal = materijal;
}

materijalMaske getMaterijal() {return this.materijal;}


void setMaterijal(materijalMaske materijal) {this.materijal = materijal;}


}
