package apoteka;

enum negaUsanaNamena {RUZ, SJAJ, LABELO};

class negaUsana extends kozmetika
{
negaUsanaNamena namena;
boolean pomazePriIspucalosti;
String boja;

negaUsana(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		negaUsanaNamena namena, boolean pomazePriIspucalosti, String boja)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.namena = namena;
	this.pomazePriIspucalosti = pomazePriIspucalosti;
	this.boja = boja;

}

negaUsanaNamena getNamena() {return this.namena;}
boolean getPomazePriIspucalosti() {return this.pomazePriIspucalosti;}
String getBoja() {return this.boja;}

void setNamena(negaUsanaNamena namena) {this.namena = namena;}
void setPomazePriIspucalosti(boolean pomazePriIspucalosti) {this.pomazePriIspucalosti = pomazePriIspucalosti;}
void setBoja(String boja) {this.boja = boja;}

}
