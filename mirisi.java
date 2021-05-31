

enum vrstaMirisa {PARFEM, TOALETNA_VODA, KOLONJSKA_VODA}
enum citrusneNote {NISTA, NARANDZA, LIMUN, MANDARINA, TANGERINA, KUMKVAT, LIMUNSKA_TRAVA, POMELO}
enum vocneNote {NISTA, BRESKVA, BANANICA, BOROVNICA, DUD, GROZDJE, JAGODA, KUPINA}
enum cvetneNote {NISTA, BEGONIJA, CIKLAMA, BROMELIJA, DALIJA, FUKSIJA, GERANIJA, GERBER}
enum zeleneNote {NISTA, AGAVA, ASPARAGUS, BOSILJAK, CILANTRO, GINKO, KAKTUS, PAPRAT, RUZMARIN}
enum zacinskeNote {NISTA, CIMET, BIBER, KIM, KARDAMON, SAFRAN, SLADIC, VANILIJA, MIRODJIJA}
enum slatkeNote {NISTA, COKOLADA, BISKVIT, ALVA, KOLACIC, MEDENJAK, MARMELADA, PRALINE, ZVAKA}
enum drveneNote {NISTA, ARGAN, BUKVA, CEMPRES, BOR, JELA, ROGAC, SIMSIR, PACULI, SMREKA}
enum smoleNote {NISTA, MASTIKA, MIRO, ELEMI, TAMJAN, STIRAKS, LABDANUM, OPOPONAKS}
enum zivotinjskeKomponente {NISTA, MOSUS, MLEKO, PCELINJI_VOSAK, KAVIJAR, TARTUF}
enum napiciNote {NISTA, KAPUCINO, VINO, LIMUNADA, KOKA_KOLA, KONJAK, MOHITO, RUM, SAKE}

class mirisi extends kozmetika
{
vrstaMirisa vrsta;
citrusneNote citrusne;
vocneNote vocne;
cvetneNote cvetne;
zeleneNote zelene;
slatkeNote slatke;
drveneNote drvene;
smoleNote smole;
zivotinjskeKomponente zivotinjske;
napiciNote napici;

mirisi(int id, String naziv, double cena,int  dostupan, 
		boolean vegan, boolean prirodno, boolean organsko,
		vrstaMirisa vrsta, citrusneNote citrusne, vocneNote vocne, cvetneNote cvetne, zeleneNote zelene,
		slatkeNote slatke, drveneNote drvene, smoleNote smole, zivotinjskeKomponente zivotinjske, napiciNote napici)
{
	
	super(id, naziv,cena,dostupan, vegan, prirodno, organsko);
    this.vrsta = vrsta;
    this.citrusne = citrusne;
    this.vocne = vocne;
    this.cvetne = cvetne;
    this.zelene = zelene;
    this.slatke = slatke;
    this.drvene = drvene;
    this.smole = smole;
    this.zivotinjske = zivotinjske;
    this.napici = napici;
}

vrstaMirisa getVrsta() {return this.vrsta;}
citrusneNote getCitrusne() {return this.citrusne;}
vocneNote getVocne() {return this.vocne;}
cvetneNote getCvetne() {return this.cvetne;}
zeleneNote getZelene() {return this.zelene;}
slatkeNote getSlatke() {return this.slatke;}
drveneNote getDrvene() {return this.drvene;}
smoleNote getSmole() {return this.smole;}
zivotinjskeKomponente getZivotnjske() {return this.zivotinjske;}
napiciNote getNapici() {return this.napici;}

void setVrsta(vrstaMirisa vrsta) {this.vrsta = vrsta;}
void setCitrusne(citrusneNote citrusne) {this.citrusne = citrusne;}
void setVocne(vocneNote vocne) {this.vocne = vocne;}
void setCvetne(cvetneNote cvetne) {this.cvetne = cvetne;}
void setZelene(zeleneNote zelene) {this.zelene = zelene;}
void setSlatke(slatkeNote slatke) {this.slatke = slatke;}
void setDrvene(drveneNote drvene) {this.drvene = drvene;}
void setSmole(smoleNote smole) {this.smole = smole;}
void setZivotinjske(zivotinjskeKomponente zivotinjske) {this.zivotinjske = zivotinjske;}
void setNapici(napiciNote napici) {this.napici = napici;}

}
