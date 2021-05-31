


enum vrstaCistaca {ULJE, GEL}
enum aktivniSastojak {VITAMIN_C, CINK, SALICILNA_KISELINA}

class cistaciKoze extends kozmetika
{
vrstaCistaca vrsta;
aktivniSastojak sastojak;

cistaciKoze(int id, String naziv, double cena, int dostupan, 
		boolean vegan, boolean prirodno, boolean organsko,
		vrstaCistaca vrsta, aktivniSastojak sastojak)
{
	
	super(id,naziv,cena,dostupan, vegan, prirodno, organsko);
    this.vrsta = vrsta;
    this.sastojak = sastojak;

}
vrstaCistaca getVrsta() {return this.vrsta;}
aktivniSastojak getSastojak() {return this.sastojak;}

void setVrsta(vrstaCistaca vrsta) {this.vrsta = vrsta;}
void setSastojak(aktivniSastojak sastojak) {this.sastojak = sastojak;}

@Override 
public String toString() {
    return naziv + 
    "\n" + vrsta +
    "\n" + sastojak 
    ;
}
}
