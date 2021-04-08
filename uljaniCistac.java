package apoteka;

enum vrstaUljanogCistaca {JOJOBA, MASLINOVO, AVOKADOVO, BADEMOVO, RUZMARINOVO, GROZDJANO}

class uljaniCistac extends kozmetika
{
vrstaUljanogCistaca vrsta;
int komodogenaSkala;
boolean pretvaraSeUMleko;
boolean parfem;

uljaniCistac(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		vrstaUljanogCistaca vrsta, int komodogenaSkala, boolean pretvaraSeUMleko, boolean parfem)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.vrsta = vrsta;
	this.komodogenaSkala = komodogenaSkala;
	this.pretvaraSeUMleko = pretvaraSeUMleko;
	this.parfem = parfem;

}

vrstaUljanogCistaca getVrsta() {return this.vrsta;}
int getKomodogenaSkala() {return this.komodogenaSkala;}
boolean getPretvaraSeUMleko() {return this.pretvaraSeUMleko;}
boolean getParfem() {return this.parfem;}

void setVrsta(vrstaUljanogCistaca vrsta) {this.vrsta = vrsta;}
void setKomodogenaSkala(int komodogenaSkala) {this.komodogenaSkala = komodogenaSkala;}
void setPretvaraSeUMleko(boolean pretvaraSeUMleko) {this.pretvaraSeUMleko = pretvaraSeUMleko;}
void setParfem(boolean parfem) {this.parfem = parfem;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + vrsta +
    "\n" + komodogenaSkala +
    "\n" + pretvaraSeUMleko +
    "\n" + parfem
    ;
}
}
