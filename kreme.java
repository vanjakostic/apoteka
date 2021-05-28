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


kreme(int id, String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		kremaDeoTela deoTela, kremaTipKoze tipKoze, kremaBaza baza, boolean SPF)
{
	
	super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.deoTela = deoTela;
	this.tipKoze = tipKoze;
	this.baza = baza;
	this.SPF = SPF;
}

kremaDeoTela getDeoTela() {return this.deoTela;}
kremaTipKoze getTipKoze() {return this.tipKoze;}
kremaBaza getBaza() {return this.baza;}
boolean getSPF() {return this.SPF;}


void setDeoTela(kremaDeoTela deoTela) {this.deoTela = deoTela;}
void setTipKoze(kremaTipKoze tipKoze) {this.tipKoze = tipKoze;}
void setBaza(kremaBaza baza) {this.baza = baza;}
void setSPF(boolean SPF) {this.SPF = SPF;}



}
