package apoteka;



enum negaUsanaNamena {RUZ, SJAJ, LABELO};

class negaUsana extends kozmetika
{
negaUsanaNamena namena;
String boja;

negaUsana(int id,String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		negaUsanaNamena namena, String boja)
{
	
	super(id,naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.namena = namena;
	this.boja = boja;

}

negaUsanaNamena getNamena() {return this.namena;}
String getBoja() {return this.boja;}

void setNamena(negaUsanaNamena namena) {this.namena = namena;}
void setBoja(String boja) {this.boja = boja;}

}
