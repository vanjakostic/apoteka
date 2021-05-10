package aparati;

import apoteka.Proizvodjaci;
import apoteka.proizvod;

enum tipToplomera {DIGITALNI, BESKONTAKTNI, ZIVA}
enum tipMerenja {ORALNO, REKTALNO, AKSILARNO}

class toplomeri extends proizvod
{
tipToplomera tipToplomera;
boolean memorisePoslednjuTemperaturu;
boolean automatskoUkljucivanje;
boolean automatskoIskljucivanje;
int minTemp;
int maxTemp;
tipMerenja tipMerenja;
boolean vodootporan;

toplomeri(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		tipToplomera tipToplomera, boolean memorisePoslednjuTemperaturu, boolean automatskoUkljucivanje,
		boolean automatskoIskljucivanje,  int minTemp, int maxTemp,
		tipMerenja tipMerenja, boolean vodootporan)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.tipToplomera = tipToplomera;
	this.memorisePoslednjuTemperaturu = memorisePoslednjuTemperaturu;
	this.automatskoUkljucivanje = automatskoUkljucivanje;        
	this.automatskoIskljucivanje = automatskoIskljucivanje;
	this.minTemp = minTemp;
	this.maxTemp = maxTemp;
	this.tipMerenja = tipMerenja;
	this.vodootporan = vodootporan;
}

tipToplomera getTipToplomera() {return this.tipToplomera;}
boolean getMemorisePoslednjuTemperatutu() {return this.memorisePoslednjuTemperaturu;}
boolean getAutomatskoUkljucivanje() {return this.automatskoUkljucivanje;}
boolean getAutomatskoIskljucivanje() {return this.automatskoIskljucivanje;}
int getMinTemp() {return this.minTemp;}
int getMaxTemp() {return this.maxTemp;}
tipMerenja getTipMerenja() {return this.tipMerenja;}
boolean getVodootporan() {return this.vodootporan;}

void setTipToplomera(tipToplomera tipToplomera) {this.tipToplomera = tipToplomera;}
void setMemorisePoslednjuTemperaturu(boolean memorisePoslednjuTemperaturu) {this.memorisePoslednjuTemperaturu = memorisePoslednjuTemperaturu;}
void setAutomatskoUkljucivanje(boolean automatskoUkljucivanje) {this.automatskoUkljucivanje = automatskoUkljucivanje;}
void setAutomatskoIskljucivanje(boolean automatskoIskljucivanje) {this.automatskoIskljucivanje = automatskoIskljucivanje;}
void setMinTemp(int minTemp) {this.minTemp = minTemp;}
void setMaxTemp(int maxTemp) {this.maxTemp = maxTemp;}
void setTipMerenja(tipMerenja tipMerenja) {this.tipMerenja = tipMerenja;}
void setVodootporan(boolean vodootporan) {this.vodootporan = vodootporan;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + tipToplomera +
    "\n" + memorisePoslednjuTemperaturu +
    "\n" + automatskoUkljucivanje +
    "\n" + minTemp +
    "\n" + maxTemp +
    "\n" + tipMerenja +
    "\n" + vodootporan 
    ;
}
}

