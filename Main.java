import java.util.ArrayList;
import java.util.List;


public class Main
{
	public static void main (String [] args) 
	{
    	aparatiZaMerenjePritiska aparatPritisak = new aparatiZaMerenjePritiska(1, "Aparat Za Merenje Pritiska PRIZMA YE660E",
    			6900.00, 5, tipAparataZaMerenjePritiska.ZA_ZGLOB, true, 30, true, true, true, false, false, true, true, false, true);
    	
    	aparatiZaMerenjeSecera aparatSecer = new aparatiZaMerenjeSecera(2, "Aparat za merenje secera u krvi MEDISMART RUBY" ,
    			2200.00, 2, 1, 5, 3, 2.00, 4, 10);
    	
    	Cetkice cetkica =  new Cetkice(3, "Colgate cetkica za zube", 300.00, 11, Boje.PLAVA, true, 1);
    	
    	cistaciKoze cistac = new cistaciKoze(4, "Garnier foam cleanser", 550.00, 20, true, true, true, vrstaCistaca.GEL, aktivniSastojak.CINK);
    	
    	inhalatori inhalator = new inhalatori(5, "Inhalator OMRON C102 TOTAL", 2000.00, 5, tipInhalatora.KOMPRESORSKI,
    			bojeInhalatora.ROZI, 2, 5, true, 30.00, 400.00, 50.00, 2.5, 7);
    	
    	Konac konac = new Konac(6, "Colgate konac za zube", 130.00, 8, 1, true, false, false);
    	
    	kreme krema = new kreme(7, "Afrodita krema za lice", 600.00, 30, true, true, true, kremaDeoTela.LICE,
    			kremaTipKoze.ZRELA, kremaBaza.VODENA, false);
    	
    	mirisi miris = new mirisi(8, "Queen spray", 400.00, 10, false, false, false, vrstaMirisa.PARFEM,
    			citrusneNote.LIMUN, vocneNote.BRESKVA, cvetneNote.BEGONIJA, zeleneNote.AGAVA,
    			slatkeNote.KOLACIC, drveneNote.NISTA, smoleNote.NISTA, zivotinjskeKomponente.NISTA,
    			napiciNote.LIMUNADA);
    	
        negaKose sredstvoZaNeguKose = new negaKose(9, "Pantene sampon za ostecenu kosu", 350.00, 6, 
    	true, false, false, negaKoseNamena.SAMPON, true, true, true, 200);
        
        negaNoktiju sredstvoZaNeguNoktiju = new negaNoktiju(10, "Crveni lak za nokte", 240.00, 2, 
        false, false, false, negaNoktijuNamena.LAK, bojaNokti.CRVENA);
        
        negaUsana sredstvoZaNeguUsana = new negaUsana(11, "Labelo", 199.00, 5, false, false, true,
        		negaUsanaNamena.LABELO, "Narandzasto");
        
        Paste pastaZaZube = new Paste(12, "Pasta za zube menta", 200.00, 8, vrstaPaste.IZBELJIVANJE,
        		ukusPaste.MENTA, 50, 2, true, true);
        
        Prehlada lekZaPrehladu = new Prehlada(13, "Galenika lek za prehladu", 700.00, 40, lekOblici.Tablete,
        		2, true, true, true, true, true, true, true, true, true, true);
        
        Rastvor rastvor = new Rastvor(14, "Sredstvo za ispiranje zuba", 300.00, 4, Ukus.LUBENICA, true, true, true);
        
        serum serumZaKozu = new serum(15, "C vitamin serum Ordinary", 630.00, 7, true, true, true, serumNamena.POSVETLJIVANJE,
        		glavniSastojak.C_VITAMIN, deoTela.LICE);
        
        sheetMaske sheetMaska = new sheetMaske(16, "Mediheal placenta sheet mask", 180.00, 9, 
        		false, false, true, materijalMaske.BIOCELULOZA);
        
        Suplementi suplement = new Suplementi(17, "Vitamin C", 270.00, 17, Vrstasuplementa.VITAMIN);
        
        testoviZaTrudnocu testZaTrudnocu = new testoviZaTrudnocu(18, "Test za trudnocu", 400.00, 3, 
        		30, 50.00, 1, 2, 3, 4);
    	
        toplomeri toplomer = new toplomeri(19, "Elektricni toplomer", 280.00, 24, tipToplomera.DIGITALNI, 
        		true, true, false, 4, 5, tipMerenja.AKSILARNO, false);
        
        vage vaga = new vage(20, "Gorenje vaga", 1200.00, 13, tipVage.DIGITALNA, jedinicaMere.KG, 120, 
        		true, true, false, true);
        
        zastitaOdSunca sredstvoZaZastituOdSunca = new zastitaOdSunca(21, "Krema za suncanje SunDance SPF 50", 
        		800.00, 8, false, false, true, 50, zastitaOdSuncaOblik.LOSION, zastitaOdSuncaTip.MINERALNA);
        
      /*  List<kozmetika> listaKozmetike = new ArrayList<kozmetika>();
        List<aparatiZaMerenjePritiska> listaAparataZaMerenjePritiska = new ArrayList<aparatiZaMerenjePritiska>();
        List<aparatiZaMerenjeSecera> listaAparataZaMerenjeSecera = new ArrayList<aparatiZaMerenjeSecera>();
        List<Cetkice> listaCetkica = new ArrayList<Cetkice>();
        List<inhalatori> listaInhalatora = new ArrayList<inhalatori>();*/
        
        sviProizvodi.listaProizvoda.add(cetkica);
        sviProizvodi.listaProizvoda.add(pastaZaZube);
        sviProizvodi.listaProizvoda.add(miris);
        sviProizvodi.listaProizvoda.add(lekZaPrehladu);
        sviProizvodi.listaProizvoda.add(inhalator);
        sviProizvodi.listaProizvoda.add(suplement);
        sviProizvodi.listaProizvoda.add(sredstvoZaZastituOdSunca);
        sviProizvodi.listaProizvoda.add(toplomer);
        sviProizvodi.listaProizvoda.add(testZaTrudnocu);
        sviProizvodi.listaProizvoda.add(krema);
        //dodati svaki proizvod na lager
        
        
        
        new UserInput();
        
        
 }
}