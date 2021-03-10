package apoteka;

enum zastitaOdSuncaOblik {LOSION, GEL, SPREJ, STIK}
enum zastitaOdSuncaTip {MINERALNA, HEMIJSKA}

class zastitaOdSunca extends kozmetika 
{
int SPF;
zastitaOdSuncaOblik oblik;
zastitaOdSuncaTip tip;
boolean cinkOksid;
boolean titaniumDioksid;

zastitaOdSunca(String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
        int SPF, zastitaOdSuncaOblik oblik, zastitaOdSuncaTip tip, boolean cinkOksid, boolean titaniumDioksid)
{
	
	super(naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.SPF = SPF;
	this.oblik = oblik;
	this.tip = tip;
	this.cinkOksid = cinkOksid;
	this.titaniumDioksid = titaniumDioksid;

}

int getSPF() {return this.SPF;}
zastitaOdSuncaOblik getOblik() {return this.oblik;}
zastitaOdSuncaTip getTip() {return this.tip;}
boolean getCinkOksid() {return this.cinkOksid;}
boolean getTitaniumDioksid() {return this.titaniumDioksid;}

void setSPF(int SPF) {this.SPF = SPF;}
void setOblik(zastitaOdSuncaOblik oblik) {this.oblik = oblik;}
void setTip(zastitaOdSuncaTip tip) {this.tip = tip;}
void setCinkOksid(boolean cinkOksid) {this.cinkOksid = cinkOksid;}
void setTitaniumDioksid(boolean titaniumDioksid) {this.titaniumDioksid = titaniumDioksid;}

}
