package apoteka;

class gelCistaci extends kozmetika
{
boolean retinol;
boolean vitaminC;
boolean cink;
boolean glicerin;
boolean salicilnaKiselina;
boolean ceramidi;
boolean pena;
boolean formaldehid;
boolean ftalati;

gelCistaci(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		boolean retinol, boolean vitaminC, boolean cink, boolean glicerin, boolean salicilnaKiselina,
		boolean ceramidi, boolean pena, boolean formaldehid, boolean ftalati)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.retinol = retinol;
	this.vitaminC = vitaminC;
	this.cink = cink;
	this.glicerin = glicerin;
	this.salicilnaKiselina = salicilnaKiselina;
	this.ceramidi = ceramidi;
	this.pena = pena;
	this.formaldehid = formaldehid;
	this.ftalati = ftalati;

}
boolean getRetionl() {return this.retinol;}
boolean getVitaminC() {return this.vitaminC;}
boolean getCink() {return this.cink;}
boolean getGlicerin() {return this.glicerin;}
boolean getSalicilnaKiselina() {return this.salicilnaKiselina;}
boolean getCeramidi() {return this.ceramidi;}
boolean getPena() {return this.pena;}
boolean getFormaldehid() {return this.formaldehid;}
boolean getFtalati() {return this.ftalati;}

void setRetinol(boolean retinol) {this.retinol = retinol;}
void setVitaminC(boolean vitaminC) {this.vitaminC = vitaminC;}
void setCink(boolean cink) {this.cink = cink;}
void setGlicerin(boolean glicerin) {this.glicerin = glicerin;}
void setSalicilnaKiselina(boolean salicilnaKiselina) {this.salicilnaKiselina = salicilnaKiselina;}
void setCeramidi(boolean ceramidi) {this.ceramidi = ceramidi;}
void setPena(boolean pena) {this.pena = pena;}
void setFormaldehid(boolean formaldehid) {this.formaldehid = formaldehid;}
void setFtalati(boolean ftalati) {this.ftalati = ftalati;}
}
