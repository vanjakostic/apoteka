



enum negaUsanaNamena {RUZ, SJAJ, LABELO};

class negaUsana extends kozmetika
{
negaUsanaNamena namena;
String boja;

negaUsana(int id,String naziv,  double cena, int dostupan,
		boolean vegan, boolean prirodno, boolean organsko,
		negaUsanaNamena namena, String boja)
{
	
	super(id,naziv,cena,dostupan, vegan, prirodno, organsko);
	this.namena = namena;
	this.boja = boja;

}

negaUsanaNamena getNamena() {return this.namena;}
String getBoja() {return this.boja;}

void setNamena(negaUsanaNamena namena) {this.namena = namena;}
void setBoja(String boja) {this.boja = boja;}

}
