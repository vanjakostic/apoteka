package apoteka;

enum kremaDeoTela {TELO, LICE, VISENAMENSKA, RUKE}
enum kremaTipKoze {ZRELA, MLADA, SVITIPOVI}
enum kremaBaza {ULJANA, VODENA}

class kreme extends kozmetika
{
kremaDeoTela deoTela;
kremaTipKoze tipKoze;
kremaBaza baza;
boolean SPF;
boolean benzoilPeroksid;
boolean Q10;
boolean urea;
boolean vitaminA;
boolean vitaminB;
boolean alfaHidroksiKiseline;
boolean betaHidroksiKiseline;

kreme(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		kremaDeoTela deoTela, kremaTipKoze tipKoze, kremaBaza baza, boolean SPF, boolean benzoilPeroksid,
		boolean Q10, boolean urea, boolean vitaminA, boolean vitaminB, boolean alfaHidroksiKiseline, boolean betaHidroksiKiseline)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.deoTela = deoTela;
	this.tipKoze = tipKoze;
	this.baza = baza;
	this.SPF = SPF;
	this.benzoilPeroksid = benzoilPeroksid;
	this.Q10 = Q10;
	this.urea = urea;
	this.vitaminA = vitaminA;
	this.vitaminB = vitaminB;
	this.alfaHidroksiKiseline = alfaHidroksiKiseline;
	this.betaHidroksiKiseline = betaHidroksiKiseline;
}

kremaDeoTela getDeoTela() {return this.deoTela;}
kremaTipKoze getTipKoze() {return this.tipKoze;}
kremaBaza getBaza() {return this.baza;}
boolean getSPF() {return this.SPF;}
boolean getBenzoilPeroksid() {return this.benzoilPeroksid;}
boolean getQ10() {return this.Q10;}
boolean getUrea() {return this.urea;}
boolean getVitaminA() {return this.vitaminA;}
boolean getVitaminB() {return this.vitaminB;}
boolean getAlfaHidroksiKiseline() {return this.alfaHidroksiKiseline;}
boolean getBetaHidrokiKiseline() {return this.betaHidroksiKiseline;}

void setDeoTela(kremaDeoTela deoTela) {this.deoTela = deoTela;}
void setTipKoze(kremaTipKoze tipKoze) {this.tipKoze = tipKoze;}
void setBaza(kremaBaza baza) {this.baza = baza;}
void setSPF(boolean SPF) {this.SPF = SPF;}
void setBenzoilPeroksid(boolean benzoilPeroksid) {this.benzoilPeroksid = benzoilPeroksid;}
void setQ10(boolean Q10) {this.Q10 = Q10;}
void setUrea(boolean urea) {this.urea = urea;}
void setVitaminA(boolean vitaminA) {this.vitaminA = vitaminA;}
void setVitaminB(boolean vitaminB) {this.vitaminB = vitaminB;}
void setAlfaHidroksiKiseline(boolean alfaHidroksiKiseline) {this.alfaHidroksiKiseline = alfaHidroksiKiseline;}
void setBetaHidroksiKiseline(boolean betaHidroksiKiseline) {this.betaHidroksiKiseline = betaHidroksiKiseline;}


}
