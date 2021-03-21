package apoteka;

class kutijeZaLekove extends Proizvod
{
int brojPregrada;
boolean sadrziAlarm;
boolean LEDdisplay;

kutijeZaLekove(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		int brojPregrada, boolean sadrziAlarm, boolean LEDdisplay)
{
	
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.brojPregrada = brojPregrada;
	this.sadrziAlarm = sadrziAlarm;
	this.LEDdisplay = LEDdisplay;
}

int getBrojPregrada() {return this.brojPregrada;}
boolean getSadrziAlarm() {return this.sadrziAlarm;}
boolean getLEDdisplay() {return this.LEDdisplay;}

void setBrojPregrada(int brojPregrada) {this.brojPregrada = brojPregrada;}
void setSadrziAlarm(boolean sadrziAlarm) {this.sadrziAlarm = sadrziAlarm;}
void setLEDdisplay(boolean LEDdisplay) {this.LEDdisplay = LEDdisplay;}

@Override 
public String toString() {
    return naziv + 
    "\n" + datumProizvodnje +
    "\n" + rokTrajanja +
    "\n" + mestoProizvodnje +
    "\n" + brojPregrada +
    "\n" + sadrziAlarm +
    "\n" + LEDdisplay 
    
    
    ;
}
}
