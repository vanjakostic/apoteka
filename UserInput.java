import java.io.FileWriter;   
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;

public class UserInput 
{

    Korpa korpa = new Korpa();
    Kasa kasa = new Kasa();
    private int ch = 0;
    
    public UserInput () 
    {
        menu();
    }
    
    public void dobrodoslica()
    {
    	System.out.println("******************************");
    	System.out.println("    DOBRODOSLI U APOTEKU");
    	System.out.println("******************************");
    	System.out.println("\n");
    }
    
    public void startScreen () {
    	System.out.println("------------------------------");
        System.out.println("1. Prikazi proizvode u radnji");
        System.out.println("2. Prikazi korpu");
        System.out.println("0. Izadji");
        System.out.println("------------------------------");
    }
    
    public void storeProductsMenu() 
    {
        System.out.println("1. Dodaj u korpu");
        System.out.println("2. Ukloni iz korpe");
        System.out.println("3. Kupi");
        System.out.println("0. Izadji");
        System.out.println("------------------------------");
    }
    
    public void menu () 
    {
    	dobrodoslica();
        do {
        	
        	
            startScreen();
            getUserInput();
            
            switch (ch) 
            {
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

    public void innerChoice1() 
    {
        switch (ch) 
        {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            case 3:
            	kupi();
            	break;
            default:
                
                break;
        }
    }

    public int getUserInput() throws NumberFormatException 
    {
    	System.out.println(">>");
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        System.out.println("------------------------------");
        
        return ch;
    }

    public void displayStoreProducts() 
    {
        List<Proizvod> listaProizvoda = new sviProizvodi().getProizvode();
        for (Proizvod prod: listaProizvoda) 
        {
        
            System.out.println(
                    prod.getID() + "- " +
                            prod.getNaziv() + " " +
                            prod.getCena() + " " +
                            prod.getDostupan()
            );
        }
        System.out.println("------------------------------");
        
    }
    

    public void addProductToCart() 
    {
        int pid = getUserInput();
        korpa.dodajUKorpuID(pid);      
    }

    public void showCart() 
    {
        korpa.printProizvodeUKorpi();
    }

    public void removeProductFromCart() 
    {
        int pid = getUserInput();
        korpa.ukloniProizvodID(pid);
    }
    
    
    public void kupi()
    {
    	 
    	kasa.setTrenutnoStanje(korpa.ukupanIznos());
        System.out.println(kasa.getTrenutnostanje());
        
        try {
            FileWriter myWriter = new FileWriter("Transakcije2.txt", true);
            BufferedWriter bw = new BufferedWriter(myWriter);

            bw.write("Ukupan iznos: " + korpa.ukupanIznos() + "\n\n");
            for (Proizvod prod: korpa.cartItems)
            {
            bw.write("Naziv proizvoda: " + prod.getNaziv() + "\nCena: " + prod.getCena() + "\n");
            //myWriter.write(prod.getNaziv() + " " + prod.getCena() + "\n");
            }
            bw.write("\n");
            bw.close();
            myWriter.close();
            System.out.println("Transakcija je uspesno upisana u fajl.");
          } catch (IOException e) {
            System.out.println("Greska.");
            e.printStackTrace();
          }
    }
    
   
    
}
    
    
