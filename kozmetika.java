package apoteka;

class kozmetika extends Proizvod
{
boolean vegan;
boolean prirodno;
boolean organsko;

kozmetika(int id, String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko)
{
	
	super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.vegan = vegan;
	this.prirodno = prirodno;
	this.organsko = organsko;

}
boolean getVegan() {return this.vegan;}
boolean getPrirodno() {return this.prirodno;}
boolean getOrgansko() {return this.organsko;}

void setVegan(boolean vegan) {this.vegan = vegan;}
void setPrirodno(boolean prirodno) {this.prirodno = prirodno;}
void setOrgansko(boolean organsko) {this.organsko = organsko;}
}
