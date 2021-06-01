package apoteka;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class UserInput {

    Korpa korpa = new Korpa();
    private int ch = 0;
    
    public UserInput () {
        menu();
    }
    
    public void dobrodoslica()
    {
    	System.out.println("******************************");
    	System.out.println("DOBRODOSLI U APOTEKU");
    	System.out.println("******************************");
    }
    public void startScreen () {
        System.out.println("1. Prikazi proizvode u radnji");
        System.out.println("2. Prikazi korpu");
        System.out.println("0. Izadji");
        System.out.println("------------------------------");
    }
    
    public void storeProductsMenu() {
        System.out.println("1. Dodaj u korpu");
        System.out.println("2. Ukloni iz korpe");
        System.out.println("0. Izadji");
        System.out.println("------------------------------");
    }
    
    public void menu () {
        do {
        	
        	dobrodoslica();
            startScreen();
            getUserInput();
            
            switch (ch) {
                case 1: 
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    
                    break;
            }
        } while (ch != 0);
    }

    public void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                
                break;
        }
    }

    public int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    public void displayStoreProducts() {
        List<Proizvod> listaProizvoda = new sviProizvodi().getProizvode();
        for (Proizvod prod: listaProizvoda) {
        
            System.out.println(
                    prod.getID() + "- " +
                            prod.getNaziv() + " " +
                            prod.getCena() + " " +
                            prod.getDostupan()
            );
        	}
        }
    

    public void addProductToCart() {
        int pid = getUserInput();
        korpa.dodajUKorpuID(pid);      
    }

    public void showCart() {
        korpa.printProizvodeUKorpi();
    }

    public void removeProductFromCart() {
        int pid = getUserInput();
        korpa.ukloniProizvodID(pid);
    }
    
    
    public void kupi(Kasa &k){
        
        for (Proizvod prod: korpa) {
            
            t=k.getTrenutnostanje;
            t+=prod.getCena();
            k.setTrenutnostanje(t);
      
        }
        
        for (Proizvod prod: korpa) {
            
              
            try {
                FileWriter f = new FileWriter("baza.txt", true);
                f.write(showCart());
            }
            catch(FileNotFoundException | IOException e) {
                System.out.println("Greska ");
            }
            finally{
                if (f != null) f.close();
            }
	
            
      
        }
    
    }
    
    
    
    
}
