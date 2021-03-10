package apoteka;

class testoviZaTrudnocu extends Proizvod
{
int osetljivost; //detektuje koncentraciju HCG-a od...mIU/ml
double tacnost;
int brojDanaOdZaceca;
int brzina; //minuti
int brojTestPlocica;
int brojPipeta;


testoviZaTrudnocu(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		int osetljivost, double tacnost, int brojDanaOdZaceca, int brzina, int brojTestPlocica, int brojPipeta)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda);
	this.osetljivost = osetljivost;
	this.tacnost = tacnost;
	this.brojDanaOdZaceca = brojDanaOdZaceca;
	this.brzina = brzina;
	this.brojTestPlocica = brojTestPlocica;
	this.brojDanaOdZaceca = brojPipeta;
}

int getOsetljivost() {return this.osetljivost;}
double getTacnost() {return this.tacnost;}
int getBrojDanaOdZaceca() {return this.brojDanaOdZaceca;}
int getBrzina() {return this.brzina;}
int getBrojTestPlocica() {return this.brojTestPlocica;}
int getBrojPipeta() {return this.brojPipeta;}

void setOsetljivost(int osetljivost) {this.osetljivost = osetljivost;}
void setTacnost(double tacnost) {this.tacnost = tacnost;}
void setBrojDanaOdZaceca(int brojDanaOdZaceca) {this.brojDanaOdZaceca = brojDanaOdZaceca;}
void setBrzina(int brzina) {this.brzina = brzina;}
void setBrojTestPlocica(int brojTestPlocica) {this.brojTestPlocica = brojTestPlocica;}
void setBrojPipeta(int brojPipeta) {this.brojPipeta = brojPipeta;}

}
