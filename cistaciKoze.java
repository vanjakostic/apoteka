package Kozmetika;

import apoteka.Proizvodjaci;

enum vrstaCistaca {ULJE, GEL}
enum aktivniSastojak {VITAMIN_C, CINK, SALICILNA_KISELINA}

class cistaciKoze extends kozmetika
{
vrstaCistaca vrsta;
aktivniSastojak sastojak;

cistaciKoze(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		vrstaCistaca vrsta, aktivniSastojak sastojak)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
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
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + vrsta +
    "\n" + sastojak 
    ;
}
}
