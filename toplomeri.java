package apoteka;

enum tipToplomera {DIGITALNI, BESKONTAKTNI, ZIVA}

class toplomeri extends Proizvod
{
tipToplomera tip;
boolean memorisePoslednjuTemperaturu;
boolean automatskoUkljucivanje;
boolean automatskoIskljucivanje;
double tacnostMerenja;
int minTemp;
int maxTemp;
boolean aksilarnoMerenje;
boolean oralnoMerenje;
boolean rektalnoMerenje;
boolean vodootporan;

toplomeri(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		tipToplomera tip, boolean memorisePoslednjuTemperaturu, boolean automatskoUkljucivanje,
		boolean automatskoIskljucivanje, double tacnostMerenja, int minTemp, int maxTemp,
		boolean aksilarnoMerenje, boolean oralnoMerenje, boolean rektalnoMerenje, boolean vodootporan)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.tip = tip;
	this.memorisePoslednjuTemperaturu = memorisePoslednjuTemperaturu;
	this.automatskoUkljucivanje = automatskoUkljucivanje;        
	this.automatskoIskljucivanje = automatskoIskljucivanje;
	this.tacnostMerenja = tacnostMerenja;
	this.minTemp = minTemp;
	this.maxTemp = maxTemp;
	this.aksilarnoMerenje = aksilarnoMerenje;
	this.oralnoMerenje = oralnoMerenje;
	this.rektalnoMerenje = rektalnoMerenje;
	this.vodootporan = vodootporan;
}

tipToplomera getTipToplomera() {return this.tip;}
boolean getMemorisePoslednjuTemperatutu() {return this.memorisePoslednjuTemperaturu;}
boolean getAutomatskoUkljucivanje() {return this.automatskoUkljucivanje;}
boolean getAutomatskoIskljucivanje() {return this.automatskoIskljucivanje;}
double getTacnostMerenja() {return this.tacnostMerenja;}
int getMinTemp() {return this.minTemp;}
int getMaxTemp() {return this.maxTemp;}
boolean getAksilarnoMerenje() {return this.aksilarnoMerenje;}
boolean getOralnoMerenje() {return this.oralnoMerenje;}
boolean getRektalnoMerenje() {return this.rektalnoMerenje;}
boolean getVodootporan() {return this.vodootporan;}

void setTipToplomera(tipToplomera tip) {this.tip = tip;}
void setMemorisePoslednjuTemperaturu(boolean memorisePoslednjuTemperaturu) {this.memorisePoslednjuTemperaturu = memorisePoslednjuTemperaturu;}
void setAutomatskoUkljucivanje(boolean automatskoUkljucivanje) {this.automatskoUkljucivanje = automatskoUkljucivanje;}
void setAutomatskoIskljucivanje(boolean automatskoIskljucivanje) {this.automatskoIskljucivanje = automatskoIskljucivanje;}
void setTacnostMerenja(double tacnostMerenja) {this.tacnostMerenja = tacnostMerenja;}
void setMinTemp(int minTemp) {this.minTemp = minTemp;}
void setMaxTemp(int maxTemp) {this.maxTemp = maxTemp;}
void setAksilarnoMerenje(boolean aksilarnoMerenje) {this.aksilarnoMerenje = aksilarnoMerenje;}
void setOralnoMerenje(boolean oralnoMerenje) {this.oralnoMerenje = oralnoMerenje;}
void setRektalnoMerenje(boolean rektalnoMerenje) {this.rektalnoMerenje = rektalnoMerenje;}
void setVodootporan(boolean vodootporan) {this.vodootporan = vodootporan;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + tip +
    "\n" + memorisePoslednjuTemperaturu +
    "\n" + automatskoUkljucivanje +
    "\n" + tacnostMerenja +
    "\n" + minTemp +
    "\n" + maxTemp +
    "\n" + aksilarnoMerenje +
    "\n" + oralnoMerenje +
    "\n" + rektalnoMerenje +
    "\n" + vodootporan +
    ;
}

}

