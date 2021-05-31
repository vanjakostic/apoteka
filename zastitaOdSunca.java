enum zastitaOdSuncaOblik {LOSION, GEL, SPREJ, STIK}
enum zastitaOdSuncaTip {MINERALNA, HEMIJSKA}

class zastitaOdSunca extends kozmetika 
{
int SPF;
zastitaOdSuncaOblik oblik;
zastitaOdSuncaTip tip;


zastitaOdSunca(int id,String naziv, double cena, int dostupan,
		boolean vegan, boolean prirodno, boolean organsko,
        int SPF, zastitaOdSuncaOblik oblik, zastitaOdSuncaTip tip)
{
	
	super(id,naziv,cena,dostupan,vegan, prirodno, organsko);
	this.SPF = SPF;
	this.oblik = oblik;
	this.tip = tip;

}

int getSPF() {return this.SPF;}
zastitaOdSuncaOblik getOblik() {return this.oblik;}
zastitaOdSuncaTip getTip() {return this.tip;}

void setSPF(int SPF) {this.SPF = SPF;}
void setOblik(zastitaOdSuncaOblik oblik) {this.oblik = oblik;}
void setTip(zastitaOdSuncaTip tip) {this.tip = tip;}

}
