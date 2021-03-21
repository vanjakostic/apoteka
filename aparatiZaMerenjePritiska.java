package apoteka;

enum tipAparataZaMerenjePritiska {ZA_ZGLOB, ZA_NADLAKTICU}

class aparatiZaMerenjePritiska extends Proizvod
{
tipAparataZaMerenjePritiska tip;
boolean detektorAritmije;
int memorijaRezultata;
boolean indikatorZaPravilnoPostavljanjeManzetne;
boolean glasovnaFunkcija;
boolean indikatorHipertenzije;
boolean detektorPokreta;
boolean bluetoothFunkcija;
boolean indikatorIstrosenostiBaterije;
boolean datumIVreme;
boolean automatskoUkljucivanje;
boolean automatskoIskljucivanje;

aparatiZaMerenjePritiska(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		tipAparataZaMerenjePritiska tip, boolean detektorAritmije, int memorijaRezultata,
		boolean indikatorZaPravilnoPostavljanjeManzetne, boolean glasovnaFunkcija, boolean indikatorHipertenzije, 
		boolean detektorPokreta, boolean bluetoothFunkcija, boolean indikatorIstrosenostiBaterije,
		boolean datumIVreme, boolean automatskoUkljucivanje, boolean automatskoIskljucivanje)
{
	
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.tip = tip;
	this.detektorAritmije = detektorAritmije;
	this.memorijaRezultata = memorijaRezultata;
	this.indikatorZaPravilnoPostavljanjeManzetne = indikatorZaPravilnoPostavljanjeManzetne;
	this.glasovnaFunkcija = glasovnaFunkcija;
	this.indikatorHipertenzije = indikatorHipertenzije;
	this.detektorPokreta = detektorPokreta;
	this.bluetoothFunkcija = bluetoothFunkcija;
	this.indikatorIstrosenostiBaterije = indikatorIstrosenostiBaterije;
	this.datumIVreme = datumIVreme;
	this.automatskoUkljucivanje = automatskoUkljucivanje;
	this.automatskoIskljucivanje = automatskoIskljucivanje;
}

tipAparataZaMerenjePritiska getTip() {return this.tip;}
boolean getDetektorAritmije() {return this.detektorAritmije;}
int getMemorijaRezultata() {return this.memorijaRezultata;}
boolean getIndikatorZaPravilnoPostavljanjeManzetne() {return this.indikatorZaPravilnoPostavljanjeManzetne;}
boolean getGlasovnaFunkcija() {return this.glasovnaFunkcija;}
boolean getIndikatorHipertenzije() {return this.indikatorHipertenzije;}
boolean getDetektorPokreta() {return this.detektorPokreta;}
boolean getIndikatorIstrosenostiBaterije() {return this.indikatorIstrosenostiBaterije;}
boolean getDatumIVreme() {return this.datumIVreme;}
boolean getAutomatskoUkljucivanje() {return this.automatskoUkljucivanje;}
boolean getAutomatskoIskljucivanje() {return this.automatskoIskljucivanje;}

void setTip(tipAparataZaMerenjePritiska tip) {this.tip = tip;}
void setDetektorAritmije(boolean detektorAritmije) {this.detektorAritmije = detektorAritmije;}
void setMemorijaRezultata(int memorijaRezultata) {this.memorijaRezultata = memorijaRezultata;}
void setIndikatorZaPravilnoPostavljanjeManzetne(boolean indikatorZaPostavljanjeManzetne) {this.indikatorZaPravilnoPostavljanjeManzetne = indikatorZaPostavljanjeManzetne;}
void setGlasovnaFunkcija(boolean glasovnaFunkcija) {this.glasovnaFunkcija = glasovnaFunkcija;}
void setIndikatorHipertenzije(boolean indikatorHipertenzije) {this.indikatorHipertenzije = indikatorHipertenzije;}
void setDetektorPokreta(boolean detektorPokreta) {this.detektorPokreta = detektorPokreta;}
void setBlueToothFunkcija(boolean bluetoothFunkcija) {this.bluetoothFunkcija = bluetoothFunkcija;}
void setIndikatorIstrosenostiBaterije(boolean indikatorIstrosenostiBaterije) {this.indikatorIstrosenostiBaterije = indikatorIstrosenostiBaterije;}
void setDatumIVreme(boolean datumIVreme) {this.datumIVreme = datumIVreme;}
void setAutomatskoUkljucivanje(boolean automatskoUkljucivanje) {this.automatskoUkljucivanje = automatskoUkljucivanje;}
void setAutomatskoIskljucivanje(boolean automatskoIskljucivanje) {this.automatskoIskljucivanje = automatskoIskljucivanje;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + tip +
    "\n" + detektorAritmije +
    "\n" + memorijaRezultata +
    "\n" + indikatorZaPravilnoPostavljanjeManzetne +
    "\n" + glasovnaFunkcija +
    "\n" + indikatorHipertenzije +
    "\n" + bluetoothFunkcija +
    "\n" + indikatorIstrosenostiBaterije +
    "\n" + datumIVreme +
    "\n" + automatskoIskljucivanje +
    "\n" + automatskoUkljucivanje +
    
    ;
}
}
