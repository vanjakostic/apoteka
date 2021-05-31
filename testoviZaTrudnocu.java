

class testoviZaTrudnocu extends Proizvod
{
int osetljivost; //detektuje koncentraciju HCG-a od...mIU/ml
double tacnost;
int brojDanaOdZaceca;
int brzina; //minuti
int brojTestPlocica;
int brojPipeta;


testoviZaTrudnocu(int id,String naziv, double cena, int dostupan, 
		int osetljivost, double tacnost, int brojDanaOdZaceca, int brzina, int brojTestPlocica, int brojPipeta)
{
	
	super(id,naziv,cena,dostupan);
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

@Override 
public String toString() {
    return naziv + 
    "\n" + osetljivost +
    "\n" + tacnost +
    "\n" + brojDanaOdZaceca +
    "\n" + brzina +
    "\n" + brojTestPlocica +
    "\n" + brojPipeta
    ;
}
}
