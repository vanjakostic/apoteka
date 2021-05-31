
class kozmetika extends Proizvod
{
boolean vegan;
boolean prirodno;
boolean organsko;

kozmetika(int id, String naziv, double cena, int dostupan, 
		boolean vegan, boolean prirodno, boolean organsko)
{
	
	super(id, naziv,cena,dostupan);
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
