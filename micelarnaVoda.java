package apoteka;

class micelarnaVoda extends kozmetika
{
boolean hidrira;
boolean reguliseMasnocu;
boolean matEfekat;
double PH;

micelarnaVoda(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		boolean hidrira, boolean reguliseMasnocu, boolean matEfekat, double PH)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.hidrira =  hidrira;
	this.reguliseMasnocu = reguliseMasnocu;
	this.matEfekat = matEfekat;
	this.PH = PH;

}

boolean getHidrira() {return this.hidrira;}
boolean getReguliseMasnocu() {return this.reguliseMasnocu;}
boolean getMatEfekat() {return this.matEfekat;}
double getPH() {return this.PH;}

void setHidrira(boolean hidrira) {this.hidrira = hidrira;}
void setReguliseMasnocu(boolean reguliseMasnocu) {this.reguliseMasnocu = reguliseMasnocu;}
void setMatEfekat(boolean matEfekat) {this.matEfekat = matEfekat;}
void setPH(double PH) {this.PH = PH;}

}
