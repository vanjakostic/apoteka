import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Korpa {

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
    	System.out.println("KORPA: \n");
        for (Proizvod prod: cartItems) {
            System.out.println(prod.getNaziv());
        }
        
    }
    
    double ukupanIznos() {
    	double t=0.00;
        for (Proizvod prod: cartItems) 
        {
            t+=prod.getCena();
        }
        return t;
    }
    
    void upisiUFajl() throws IOException
    {
    	
            Path fileName = Path.of("demo.txt");
            String content  = "hello world !!";
            Files.writeString(fileName, content);
             
            String actual = Files.readString(fileName);
            System.out.println(actual);
        
    }
    
    
}