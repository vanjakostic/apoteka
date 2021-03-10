package apoteka;

enum negaNoktijuNamena {LAK, GEL}
enum bojaNokti {CRVENA, ROZA, BELA, PLAVA, ZELENA}

class negaNoktiju extends kozmetika
{
negaNoktijuNamena namena;
boolean jacanje;
bojaNokti boja;
boolean matEfekat;

negaNoktiju(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		negaNoktijuNamena namena, boolean jacanje, bojaNokti boja, boolean matEfekat)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.namena = namena;
	this.jacanje = jacanje;
	this.boja = boja;
	this.matEfekat = matEfekat;

}

negaNoktijuNamena getNamena() {return this.namena;}
boolean getJacanje() {return this.jacanje;}
bojaNokti getBoja() {return this.boja;}
boolean getMatEfekat() {return this.matEfekat;}

void setNamena(negaNoktijuNamena namena) {this.namena = namena;}
void setJacanje(boolean jacanje) {this.jacanje = jacanje;}
void setBoja(bojaNokti boja) {this.boja = boja;}
void setMatEfekat(boolean matEfekat) {this.matEfekat = matEfekat;}

}
