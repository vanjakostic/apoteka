


enum tipInhalatora {KOMPRESORSKI, ULTRAZVUCNI}
enum bojeInhalatora {ROZI, BELI, PLAVI}

class inhalatori extends Proizvod
{
tipInhalatora tip;
bojeInhalatora boje;
int duzinaCrevaZaVazduh;
int brojFilteraZaVazduh;
boolean nazalniTus;
double protokVazduha; // L/min
double frekvencija; // Hz
double snaga; // watt
double tezina; //kg
int nivoBuke; // Db

inhalatori(int id, String naziv, double cena, int dostupan,
		tipInhalatora tip, bojeInhalatora boje, int duzinaCrevaZaVazduh, int brojFilteraZaVazduh, boolean nazalniTus,
		double protokVazduha, double frekvencija, double snaga, double tezina, int nivoBuke)
{
	
	super(id, naziv,cena,dostupan);
	this.tip = tip;
	this.boje = boje;
	this.duzinaCrevaZaVazduh = duzinaCrevaZaVazduh;
	this.brojFilteraZaVazduh = brojFilteraZaVazduh;
	this.nazalniTus = nazalniTus;
	this.protokVazduha = protokVazduha;
	this.frekvencija = frekvencija;
	this.snaga = snaga;
	this.tezina = tezina;
	this.nivoBuke = nivoBuke;
}

tipInhalatora getTipInhalatora() {return this.tip;}
bojeInhalatora getBojaInhalatora() {return this.boje;}
int getDuzinaCrevaZaVazduh() {return this.duzinaCrevaZaVazduh;}
int getBrojFilteraZaVazduh() {return this.brojFilteraZaVazduh;}
boolean getNazalniTus() {return this.nazalniTus;}
double getProtokVazduha() {return this.protokVazduha;}
double getFrekvencija() {return this.frekvencija;}
double getSnaga() {return this.snaga;}
double getTezina() {return this.tezina;}
int getNivoBuke() {return this.nivoBuke;}

void setTipInhalatora(tipInhalatora tip) {this.tip = tip;}
void setBojaInhalatora(bojeInhalatora boje) {this.boje = boje;}
void setDuzinaCrevaZaVazduh(int duzinaCrevaZaVazduh) {this.duzinaCrevaZaVazduh = duzinaCrevaZaVazduh;}
void setBrojFilteraZaVazduh(int brojFilteraZaVazduh) {this.brojFilteraZaVazduh = brojFilteraZaVazduh;}
void setNazalniTus(boolean nazalniTus) {this.nazalniTus = nazalniTus;}
void setProtokVazduha(double protokVazduha) {this.protokVazduha = protokVazduha;}
void setFrekvencija(double frekvencija) {this.frekvencija = frekvencija;}
void setSnaga(double snaga) {this.snaga = snaga;}
void setTezina(double tezina) {this.tezina = tezina;}
void setNivoBuke(int nivoBuke) {this.nivoBuke = nivoBuke;}

@Override 
public String toString() {
    return naziv + 
    "\n" + tip +
    "\n" + boje +
    "\n" + duzinaCrevaZaVazduh +
    "\n" + brojFilteraZaVazduh +
    "\n" + nazalniTus +
    "\n" + protokVazduha +
    "\n" + frekvencija +
    "\n" + snaga +
    "\n" + tezina +
    "\n" + nivoBuke 
    
    ;
}
}


