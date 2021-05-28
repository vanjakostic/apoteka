package apoteka;


enum serumNamena {ANTI_AGING, PROTIV_AKNI, POSVETLJIVANJE, HIDRIRANJE, REPARACIJA}
enum glavniSastojak {HIJALURON, C_VITAMIN, KOLAGEN}
enum deoTela {LICE, TELO, VISENAMENSKI}

class serum extends kozmetika
{
serumNamena namena;
glavniSastojak sastojak;
deoTela deo;

serum(int id,String naziv, Proizvodjaci proizvodjac, String datumProizvodnje, String rokTrajanja,
		String mestoProizvodnje, double cena, boolean dostupan, int brojproizvoda,
		boolean vegan, boolean prirodno, boolean organsko,
		serumNamena namena, glavniSastojak sastojak, deoTela deo)
{
	
	super(id, naziv,proizvodjac,datumProizvodnje,rokTrajanja,mestoProizvodnje,cena,dostupan,brojproizvoda, vegan, prirodno, organsko);
	this.namena = namena;
	this.sastojak = sastojak;
	this.deo = deo;

}

serumNamena getNamena() {return this.namena;}
glavniSastojak getSastojak() {return this.sastojak;}
deoTela getDeo() {return this.deo;}

void setNamena(serumNamena namena) {this.namena = namena;}
void setSastojak(glavniSastojak sastojak) {this.sastojak = sastojak;}
void setDeo(deoTela deo) {this.deo = deo;}
	

}
