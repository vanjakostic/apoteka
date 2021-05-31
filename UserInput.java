import java.util.List;
import java.util.Scanner;

public class UserInput {

    Korpa korpa = new Korpa();
    private int ch = 0;
    
    public UserInput () {
        menu();
    }
    
    public void startScreen () {
        System.out.println("1. Prikazi proizvode u radnji");
        System.out.println("2. Prikazi korpu");
        System.out.println("0. Izadji");
    }
    
    public void storeProductsMenu() {
        System.out.println("1. Dodaj u korpu");
        System.out.println("2. Ukloni iz korpe");
        System.out.println("0. Izadji");
    }
    
    public void menu () {
        do {
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

    private void innerChoice1() {
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

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
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

    private void addProductToCart() {
        int pid = getUserInput();
        korpa.dodajUKorpuID(pid);      
    }

    private void showCart() {
        korpa.printProizvodeUKorpi();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        korpa.ukloniProizvodID(pid);
    }
}