import java.util.ArrayList;
import java.util.List;

public class sviProizvodi {

	    private final List<Proizvod> listaProizvoda = new ArrayList<Proizvod>();

	    public sviProizvodi () {
	        this.initStoreItems();
	    }
	    
	    public List<Proizvod> getProizvode() {
	        return listaProizvoda;
	    }
	    
	    public void initStoreItems() {
	        String [] productNames = {"Lux Soap", "Fair n Lovely", "MTR"};
	        Double [] productPrice = {40.00d, 60.00d, 30.00d};
	        Integer [] stock = {10, 6, 10};
	        
	        for (int i=0; i < productNames.length; i++) {
	            this.listaProizvoda.add(new Proizvod(i+1, productNames[i], productPrice[i], stock[i]));
	        }
	    }
	
}
