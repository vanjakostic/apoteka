package apoteka;
import java.util.Scanner;
enum lekOblici {Tablete, Kapsule, Sirup, Prah}

class Lek extends Proizvod
{
    
        protected int uzimanjaNaDan;
        protected lekOblici oblik;
        protected boolean moguDeca;
		protected boolean moguTrudnice;
		protected boolean moguDijabeticari;
		
    public:
	
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
        }

        Lek(String NAZIV, String DATUMPROIZVODNJE, String MESTOPROIZVODNJE, String ROKTRAJANJA, double CENA, boolean DOSTUPAN,
            lekOblici OBLIK, int UZIMANJANADAN, boolean MOGUDECA, boolean MOGUTRUDNICE, boolean MOGUDIJABETICARI)
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
        }


        public void getOblik() 
        { 
        switch (oblik) 
        { 
        case Tablete: 
            return "Tablete";
            break; 
        case Kapsule: 
            return "Kapsule";
            break; 
        case Prah: 
		    return "Prah";
            break;
        case Sirup: 
            return "Sirup";
            break; 
        } 
        } 
        int getUzimanjaNaDan() {return uzimanjaNaDan;}
        boolean getMoguDeca() {return moguDeca;}
        boolean getMoguTrudnice() {return moguTrudnice;}
        boolean getMoguDijabeticari() {return moguDijabeticari;}

        void setOblik()
        {
        int br;
		Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj [1-Tablete/2-Kapsule/3-Sirup/4-Prah]: ");
        String myString = input.next();
        switch(myString)
        {
        case 1:
            oblik = Tablete;
            break;
        case 2:
            oblik = Kapsule;
            break;
        case 3:
            oblik = Sirup;
            break;
        case 4:
            oblik = Prah;
            break;
        }
        }
        void setUzimanjaNaDan(int UZIMANJANADAN) {this.uzimanjaNaDan = UZIMANJANADAN;}
        void setMoguDeca(boolean MOGUDECA) {this.moguDeca = MOGUDECA;}
        void setMoguTrudnice(boolean MOGUTRUDNICE) {this.moguTrudnice = MOGUTRUDNICE;}
        void setMoguDijabeticari(boolean MOGUDIJABETICARI) {this.moguDijabeticari = MOGUDIJABETICARI;}
  

}
