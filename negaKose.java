



enum negaKoseNamena {SAMPON, BALZAM, GEL, LAK, RASCESLJAVANJE}

class negaKose extends kozmetika
{
negaKoseNamena namena;
boolean protivPeruti;
boolean protivOpadanja;
boolean brziRast;;
int kolicina; //ml

negaKose(int id, String naziv, double cena, int dostupan, 
		boolean vegan, boolean prirodno, boolean organsko,
		negaKoseNamena namena, boolean protivPeruti, boolean protivOpadanja, boolean brziRast, int kolicina)
{
	
	super(id, naziv,cena,dostupan, vegan, prirodno, organsko);
	this.namena = namena;
	this.protivPeruti = protivPeruti;
	this.protivOpadanja = protivOpadanja;
	this.brziRast = brziRast;
	this.kolicina = kolicina;

}

negaKoseNamena getNamena() {return this.namena;}
boolean getProtivPeruti() {return this.protivPeruti;}
boolean getProtivOpadanja() {return this.protivOpadanja;}
boolean getBrziRast() {return this.brziRast;}
int getKolicina() {return this.kolicina;}

void setNamena(negaKoseNamena namena) {this.namena = namena;}
void setProtivPeruti(boolean protivPeruti) {this.protivPeruti = protivPeruti;}
void setProtivOpadanja(boolean protivOpadanja) {this.protivOpadanja = protivOpadanja;}
void setBrziRast(boolean brziRast) {this.brziRast = brziRast;}
void setKolicina(int kolicina) {this.kolicina = kolicina;}

}
