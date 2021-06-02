
import java.util.Scanner;
enum lekOblici {Tablete, Kapsule, Sirup, Prah}

class Lek extends Proizvod
{
    
        protected int uzimanjaNaDan;
        protected lekOblici oblik;
        protected boolean moguDeca;
		protected boolean moguTrudnice;
		protected boolean moguDijabeticari;
		
    public
	
      /*  Lek()
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
        }*/

        Lek(int ID, String NAZIV, double CENA, int DOSTUPAN,
            lekOblici OBLIK, int UZIMANJANADAN, boolean MOGUDECA, boolean MOGUTRUDNICE, boolean MOGUDIJABETICARI)
        {
        super(ID, NAZIV, CENA, DOSTUPAN);
        oblik = OBLIK;
        uzimanjaNaDan = UZIMANJANADAN;
        moguDeca = MOGUDECA;
        moguTrudnice = MOGUTRUDNICE;
        moguDijabeticari = MOGUDIJABETICARI;
        }


        /*public lekOblici getOblik() 
        { 
        switch (oblik) 
        { 
        case Tablete: 
            return Tablete;
            break; 
        case Kapsule: 
            return Kapsule;
            break; 
        case Prah: 
		    return "Prah";
            break;
        case Sirup: 
            return "Sirup";
            break; 
        } 
        } */
        int getUzimanjaNaDan() {return uzimanjaNaDan;}
        boolean getMoguDeca() {return moguDeca;}
        boolean getMoguTrudnice() {return moguTrudnice;}
        boolean getMoguDijabeticari() {return moguDijabeticari;}

        void setOblik()
        {
		Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj [1-Tablete/2-Kapsule/3-Sirup/4-Prah]: ");
        int br = input.nextInt();
        switch(br)
        {
        case 1:
            oblik = lekOblici.Tablete;
            break;
        case 2:
            oblik = lekOblici.Kapsule;
            break;
        case 3:
            oblik = lekOblici.Sirup;
            break;
        case 4:
            oblik = lekOblici.Prah;
            break;
        }
        input.close();
        }
        void setUzimanjaNaDan(int UZIMANJANADAN) {this.uzimanjaNaDan = UZIMANJANADAN;}
        void setMoguDeca(boolean MOGUDECA) {this.moguDeca = MOGUDECA;}
        void setMoguTrudnice(boolean MOGUTRUDNICE) {this.moguTrudnice = MOGUTRUDNICE;}
        void setMoguDijabeticari(boolean MOGUDIJABETICARI) {this.moguDijabeticari = MOGUDIJABETICARI;}
  

}
