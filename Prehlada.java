

class Prehlada extends Lek 
{
	//koji simptom prehlade lek smiruje
     protected boolean kasalj, curenjeNosa, zapusenNos, temperatura, bolUGrlu, kijanje, glavobolja;
	 
	/* Prehlada()
        {
        naziv = "Nije unet";
        datumProizvodnje = "Nije unet";
        mestoProizvodnje = "Nije uneta";
        rokTrajanja = "Nije unet";
        cena = 478.89;
        dostupan = true;
        oblik = lekOblici.Tablete;
        uzimanjaNaDan = 3;
        moguDeca = true;
        moguTrudnice = true;
        moguDijabeticari = true;
	    	kasalj = true;
		    curenjeNosa = true;
		    zapusenNos = true;
		    temperatura = true;
		    bolUGrlu = true;
		    kijanje = true;
		    glavobolja = true;
        }*/

        Prehlada(int ID, String NAZIV,  double CENA, int DOSTUPAN, 
            lekOblici OBLIK, int UZIMANJANADAN, boolean MOGUDECA, boolean MOGUTRUDNICE, boolean MOGUDIJABETICARI, boolean KASALJ,
			boolean CURENJENOSA, boolean ZAPUSENNOS, boolean TEMPERATURA, boolean BOLUGRLU, boolean KIJANJE, boolean GLAVOBOLJA)
        {
        super(ID, NAZIV,  CENA,  DOSTUPAN, OBLIK,  UZIMANJANADAN, MOGUDECA,  MOGUTRUDNICE,  MOGUDIJABETICARI);
        oblik = OBLIK;
        uzimanjaNaDan = UZIMANJANADAN;
        moguDeca = MOGUDECA;
        moguTrudnice = MOGUTRUDNICE;
        moguDijabeticari = MOGUDIJABETICARI;
		kasalj = KASALJ;
		curenjeNosa = CURENJENOSA;
		zapusenNos = ZAPUSENNOS;
		temperatura = TEMPERATURA;
		bolUGrlu = BOLUGRLU;
		kijanje = KIJANJE;
		glavobolja = GLAVOBOLJA;
        }


        boolean getKasalj() {return this.kasalj;}
		boolean getCurenjeNosa() {return this.curenjeNosa;}
		boolean getZapusenNos() {return this.zapusenNos;}
		boolean getTemperatura() {return this.temperatura;}
		boolean getBolUGrlu() {return this.bolUGrlu;}
		boolean getKijanje() {return this.kijanje;}
		boolean getGlavobolja() {return this.glavobolja;}

        void setKasalj(boolean KASALJ) {this.kasalj = KASALJ;}
		void setCurenjeNosa(boolean CURENJENOSA) {this.curenjeNosa = CURENJENOSA;}
		void setZapusenNos(boolean ZAPUSENNOS) {this.zapusenNos = ZAPUSENNOS;}
		void setTemperatura(boolean TEMPERATURA) {this.temperatura = TEMPERATURA;}
		void setBolUGrlu(boolean BOLUGRLU) {this.bolUGrlu = BOLUGRLU;}
		void setKijanje(boolean KIJANJE) {this.kijanje = KIJANJE;}
		void setGlavobolja(boolean GLAVOBOLJA) {this.glavobolja = GLAVOBOLJA;}

		
}
