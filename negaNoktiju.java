package apoteka;


enum negaNoktijuNamena {LAK, GEL}
enum bojaNokti {CRVENA, ROZA, BELA, PLAVA, ZELENA}

class negaNoktiju extends kozmetika
{
negaNoktijuNamena namena;
bojaNokti boja;

negaNoktiju(int id,String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		negaNoktijuNamena namena, bojaNokti boja)
{
	
	super(id,naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.namena = namena;
	this.boja = boja;

}

negaNoktijuNamena getNamena() {return this.namena;}
bojaNokti getBoja() {return this.boja;}

void setNamena(negaNoktijuNamena namena) {this.namena = namena;}
void setBoja(bojaNokti boja) {this.boja = boja;}

}
