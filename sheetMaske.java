



enum materijalMaske {HYDROGEL, BIOCELULOZA, MICROFIBER, FOIL, KNIT}

class sheetMaske extends kozmetika
{
materijalMaske materijal;

sheetMaske(int id,String naziv, double cena, int dostupan, 
		boolean vegan, boolean prirodno, boolean organsko,
		materijalMaske materijal)
{
	
	super(id,naziv,cena,dostupan, vegan, prirodno, organsko);
	this.materijal = materijal;
}

materijalMaske getMaterijal() {return this.materijal;}


void setMaterijal(materijalMaske materijal) {this.materijal = materijal;}


}
