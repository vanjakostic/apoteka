package apoteka;

class toner extends kozmetika
{
boolean alkohol;
boolean glikolnaKiselina;
boolean salicilnaKiselina;
boolean paraben;
boolean adstringenti;
boolean zatezePore;
boolean balansiraPH;

toner(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		boolean alkohol, boolean glikolnaKiselina, boolean salicilnaKiselina, boolean paraben,
		boolean adstringenti, boolean zatezePore, boolean balansiraPH)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.alkohol = alkohol;
	this.glikolnaKiselina = glikolnaKiselina;
	this.salicilnaKiselina = salicilnaKiselina;
	this.paraben = paraben;
	this.adstringenti = adstringenti;
	this.zatezePore = zatezePore;
	this.balansiraPH = balansiraPH;

}
boolean getAlkohol() {return this.alkohol;}
boolean getGlikolnaKiselina() {return this.glikolnaKiselina;}
boolean getSalicilnaKiselina() {return this.salicilnaKiselina;}
boolean getParaben() {return this.paraben;}
boolean getAdstringenti() {return this.adstringenti;}
boolean getZatezePore() {return this.zatezePore;}
boolean getBalansiraPH() {return this.balansiraPH;}

void setAlkohol(boolean alkohol) {this.alkohol = alkohol;}
void setGlikolnaKiselina(boolean glikolnaKiselina) {this.glikolnaKiselina = glikolnaKiselina;}
void setSalicilnaKiselina(boolean salicilnaKiselina) {this.salicilnaKiselina = salicilnaKiselina;}
void setParaben(boolean paraben) {this.paraben = paraben;}
void setAdtringenti(boolean adstringenti) {this.adstringenti = adstringenti;}
void setZatezePore(boolean zatezePore) {this.zatezePore = zatezePore;}
void setBalansiraPH(boolean balansiraPH) {this.balansiraPH = balansiraPH;}
}
