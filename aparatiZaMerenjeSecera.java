package apoteka;

class aparatiZaMerenjeSecera extends Proizvod
{
int brojTestTraka;
int brojLanceta;
int brzinaRezultata; //minuti
double potrebnaKolicinaKrvi; //ml
int brojElektroda;
int kapacitetMemorije;

aparatiZaMerenjeSecera(int id,String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		int brojTestTraka, int brojLanceta, int brzinaRezultata, double potrebnaKolicinaKrvi,
		int brojElektroda, int kapacitetMemorije)
{
	
	
	super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.brojTestTraka = brojTestTraka;
	this.brojLanceta = brojLanceta;
	this.brzinaRezultata = brzinaRezultata;
	this.potrebnaKolicinaKrvi = potrebnaKolicinaKrvi;
	this.brojElektroda = brojElektroda;
	this.kapacitetMemorije = kapacitetMemorije;
}

int getBrojTestTraka() {return this.brojTestTraka;}
int getBrojLanceta() {return this.brojLanceta;}
int getBrzinaRezultata() {return this.brzinaRezultata;}
double getPotrebnaKolicinaKrvi() {return this.potrebnaKolicinaKrvi;}
int getBrojElektroda() {return this.brojElektroda;}
int getKapacitetMemorije() {return this.kapacitetMemorije;}

void setBrojTestTraka(int brojTestTraka) {this.brojTestTraka = brojTestTraka;}
void setBrojLanceta(int brojLanceta) {this.brojLanceta = brojLanceta;}
void setBrzinaRezultata(int brzinaRezultata) {this.brzinaRezultata = brzinaRezultata;}
void setPotrebnaKolicinaKrvi(double potrebnaKolicinaKrvi) {this.potrebnaKolicinaKrvi = potrebnaKolicinaKrvi;}
void setBrojElektroda(int brojElektroda) {this.brojElektroda = brojElektroda;}
void setKapacitetMemorije(int kapacitetMemorije) {this.kapacitetMemorije = kapacitetMemorije;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + brojTestTraka +
    "\n" + brojLanceta +
    "\n" + brzinaRezultata +
    "\n" + potrebnaKolicinaKrvi +
    "\n" + brojElektroda +
    "\n" + kapacitetMemorije 
    
    ;
}

}
