


enum negaNoktijuNamena {LAK, GEL}
enum bojaNokti {CRVENA, ROZA, BELA, PLAVA, ZELENA}

class negaNoktiju extends kozmetika
{
negaNoktijuNamena namena;
bojaNokti boja;

negaNoktiju(int id,String naziv,  double cena, int dostupan, 
		boolean vegan, boolean prirodno, boolean organsko,
		negaNoktijuNamena namena, bojaNokti boja)
{
	
	super(id,naziv,cena,dostupan,vegan, prirodno, organsko);
	this.namena = namena;
	this.boja = boja;

}

negaNoktijuNamena getNamena() {return this.namena;}
bojaNokti getBoja() {return this.boja;}

void setNamena(negaNoktijuNamena namena) {this.namena = namena;}
void setBoja(bojaNokti boja) {this.boja = boja;}

}
