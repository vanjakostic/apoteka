package apoteka;

enum tipVage {MEHANICKA, DIGITALNA};
enum jedinicaMere {KG, LB}

class vage extends Proizvod
{
tipVage tip;
jedinicaMere jedinica;
int maxTezina;
boolean indikatorOpterecenja;
boolean automatskoUkljucivanje;
boolean automatskoIskljucivanje;
boolean LEDdisplay;
boolean indikatorNapunjenostiBaterije;

vage(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		tipVage tip, jedinicaMere jedinica, int maxTezina, boolean automatskoUkljucivanje,
		boolean automatskoIskljucivanje, boolean LEDdisplay, boolean indikatorNapunjenostiBaterije)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.tip = tip;
	this.jedinica = jedinica;
	this.maxTezina = maxTezina;
	this.automatskoUkljucivanje = automatskoUkljucivanje;
	this.automatskoIskljucivanje = automatskoIskljucivanje;
	this.LEDdisplay = LEDdisplay;
	this.indikatorNapunjenostiBaterije = indikatorNapunjenostiBaterije;
}

tipVage getTipVage() {return this.tip;}
jedinicaMere getJedinicaMere() {return this.jedinica;}
int getMaxTezina() {return this.maxTezina;}
boolean getIndikatorOpterecenja() {return this.indikatorOpterecenja;}
boolean getAutomatskoUkljucivanje() {return this.automatskoUkljucivanje;}
boolean getAutomatskoIskljucivanje() {return this.automatskoIskljucivanje;}
boolean getLEDdisplay() {return this.LEDdisplay;}
boolean getIndikatorNapunjenostiBaterije() {return this.indikatorNapunjenostiBaterije;}

void setTipVage(tipVage tip) {this.tip = tip;}
void setJedinicaMere(jedinicaMere jedinica) {this.jedinica = jedinica;}
void setMaxTezina(int maxTezina) {this.maxTezina = maxTezina;}
void setIndikatorOpterecenja(boolean indikatorOpterecenja) {this.indikatorOpterecenja = indikatorOpterecenja;}
void setAutomatskoUkljucivanje(boolean automatskoUkljucivanje) {this.automatskoUkljucivanje = automatskoUkljucivanje;}
void setAutomatskoIskljucivanje(boolean automatskoIskljucivanje) {this.automatskoIskljucivanje = automatskoIskljucivanje;}
void setLEDdisplay(boolean LEDdisplay) {this.LEDdisplay = LEDdisplay;}
void setIndikatorNapunjenostiBaterije(boolean indikatorNapunjenostiBaterije) {this.indikatorNapunjenostiBaterije = indikatorNapunjenostiBaterije;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + tip +
    "\n" + jedinica +
    "\n" + maxTezina +
    "\n" + indikatorOpterecenja +
    "\n" + automatskoUkljucivanje +
    "\n" + automatskoIskljucivanje +
    "\n" + LEDdisplay +
    "\n" + indikatorNapunjenostiBaterije 
    ;
}
}
