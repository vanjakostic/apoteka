import java.util.ArrayList;
import java.util.List;

class Korpa {

    List<Proizvod> cartItems = new ArrayList<Proizvod>();
    
    public void dodajUKorpuID(int id) {
        Proizvod proizvod = getProizvodPoID(id);
        dodajUKorpu(proizvod);
    }

    private Proizvod getProizvodPoID(int id) {
        Proizvod proizvod = null;
        List<Proizvod> listaProizvoda = new sviProizvodi().getProizvode();
        for (Proizvod prod: listaProizvoda) {
            if (prod.getID() == id) {
                proizvod = prod;
                break;
            }
        }
        return proizvod;
    }

    private void dodajUKorpu(Proizvod proizvod) {
        cartItems.add(proizvod);
    }

    public void ukloniProizvodID(int id) {
        Proizvod prod = getProizvodPoID(id);
        cartItems.remove(prod);
    }

    void printProizvodeUKorpi() {
        for (Proizvod prod: cartItems) {
            System.out.println(prod.getNaziv());
        }
    }
    
}