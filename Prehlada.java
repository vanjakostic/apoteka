package apoteka;

class Prehlada extends Lek 
{
	//koji simptom prehlade lek smiruje
     protected boolean kasalj, curenjeNosa, zapusenNos, temperatura, bolUGrlu, kijanje, glavobolja;
	 
	 Lek()
        {
        naziv = "Nije unet";
        datumProizvodnje = "Nije unet";
        mestoProizvodnje = "Nije uneta";
        rokTrajanja = "Nije unet";
        cena = 478.89;
        dostupan = true;
        oblik = Tablete;
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
        }

        Lek(String NAZIV, String DATUMPROIZVODNJE, String MESTOPROIZVODNJE, String ROKTRAJANJA, double CENA, boolean DOSTUPAN,
            lekOblici OBLIK, int UZIMANJANADAN, boolean MOGUDECA, boolean MOGUTRUDNICE, boolean MOGUDIJABETICARI, boolean KASALJ,
			boolean CURENJENOSA, boolean ZAPUSENNOS, boolean TEMPERATURA, boolean BOLUGRLU, boolean KIJANJE, boolean GLAVOBOLJA)
        {
        naziv = NAZIV;
        datumProizvodnje = DATUMPROIZVODNJE;
        mestoProizvodnje = MESTOPROIZVODNJE;
        rokTrajanja = ROKTRAJANJA;
        cena = CENA;
        dostupan = DOSTUPAN;
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


        boolean getKasalj {return kasalj;}
		boolean getCurenjeNosa {return curenjeNosa;}
		boolean getZapusenNos {return zapusenNos;}
		boolean getTemperatura {return temperatura;}
		boolean getBolUGrlu {return bolUGrlu;}
		boolean getKijanje {return kijanje;}
		boolean getGlavobolja {return glavobolja;}

        boolean setKasalj(boolean KASALJ) {this.kasalj = KASALJ;}
		boolean setCurenjeNosa(boolean CURENJENOSA) {this.curenjeNosa = CURENJENOSA;}
		boolean setZapusenNos(boolean ZAPUSENNOS) {this.zapusenNos = ZAPUSENNOS;}
		boolean setTemperatura(boolean TEMPERATURA) {this.temperatura = TEMPERATURA;}
		boolean setBolUGrlu(boolean BOLUGRLU) {this.bolUGrlu = BOLUGRLU;}
		boolean setKijanje(boolean KIJANJE) {this.kijanje = KIJANJE;}
		boolean setGlavobolja(boolean GLAVOBOLJA) {this.glavobolja = GLAVOBOLJA;}

		
}
